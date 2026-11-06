package produto;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import login.LoginPage;
import org.junit.Assert;

public class ProdutoStepDefinition {

    private final LoginPage loginPage = new LoginPage();
    private final ProdutoPage produtoPage = new ProdutoPage();

    @Dado("que estou autenticado no EstoqueLab com usuário {string} e senha {string}")
    public void estouAutenticadoNoEstoqueLab(String usuario, String senha) {
        loginPage.informarCredenciais(usuario, senha);
        loginPage.solicitarEntrada();
        Assert.assertTrue(
                "A área de produtos não foi exibida após o login.",
                loginPage.areaDeProdutosVisivel()
        );
    }

    @Dado("que acesso o formulário de novo produto")
    public void acessoFormularioDeNovoProduto() {
        produtoPage.acessarFormularioDeNovoProduto();
    }

    @Quando("informo o produto {string}, SKU {string} e categoria {string}")
    public void informoDadosGerais(String nome, String sku, String categoria) {
        produtoPage.informarDadosGerais(nome, sku, categoria);
    }

    @Quando("informo o preço {string} e o estoque {string}")
    public void informoPrecoEEstoque(String preco, String estoque) {
        produtoPage.informarEstoqueEPreco(preco, estoque);
    }

    @Quando("salvo o produto")
    public void salvoProduto() {
        produtoPage.salvar();
    }

    @Entao("o produto {string} deve aparecer na lista")
    public void produtoDeveAparecerNaLista(String nome) {
        Assert.assertTrue(
                "O produto cadastrado não apareceu na lista.",
                produtoPage.produtoCadastrado(nome)
        );
    }
}
