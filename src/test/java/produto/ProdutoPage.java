package produto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.time.Duration;

public class ProdutoPage {

    private final By linkNovoProduto = By.name("lnkNovoProduto");
    private final By nomeProduto = By.name("inpNomeProduto");
    private final By skuProduto = By.name("inpSkuProduto");
    private final By categoriaProduto = By.name("selCategoriaProduto");
    private final By abaEstoquePreco = By.name("abaEstoquePrecoProduto");
    private final By precoProduto = By.name("inpPrecoProduto");
    private final By estoqueProduto = By.name("inpEstoqueProduto");
    private final By botaoSalvar = By.name("btnSalvarProduto");
    private final By nomeProdutoNaLista = By.name("tdProdutoNome_1");

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ProdutoPage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void acessarFormularioDeNovoProduto() {
        wait.until(ExpectedConditions.elementToBeClickable(linkNovoProduto)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nomeProduto));
    }

    public void informarDadosGerais(String nome, String sku, String categoria) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nomeProduto)).sendKeys(nome);
        driver.findElement(skuProduto).sendKeys(sku);
        new Select(driver.findElement(categoriaProduto)).selectByVisibleText(categoria);
    }

    public void informarEstoqueEPreco(String preco, String estoque) {
        wait.until(ExpectedConditions.elementToBeClickable(abaEstoquePreco)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(precoProduto)).sendKeys(preco);
        driver.findElement(estoqueProduto).sendKeys(estoque);
    }

    public void salvar() {
        wait.until(ExpectedConditions.elementToBeClickable(botaoSalvar)).click();
    }

    public boolean produtoCadastrado(String nome) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(nomeProdutoNaLista))
                .getText().equals(nome);
    }
}
