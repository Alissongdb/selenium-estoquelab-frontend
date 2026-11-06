package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean paginaInicialVisivel() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("inpUsuarioLogin")
        )).isDisplayed();
    }

    public void informarCredenciais(String usuario, String senha) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("inpUsuarioLogin")
        )).sendKeys(usuario);
        driver.findElement(By.name("inpSenhaLogin")).sendKeys(senha);
    }

    public void solicitarEntrada() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.name("btnEntrar")
        )).click();
    }

    public boolean areaDeProdutosVisivel() {
        String conteudo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("conteudoPrincipal")
        )).getText();
        return conteudo.contains("Produtos");
    }
}
