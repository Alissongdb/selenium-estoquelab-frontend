package login;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginStepDefinition {

    private final LoginPage loginPage = new LoginPage();

    @Dado("que estou na página inicial do EstoqueLab")
    public void queEstouNaPaginaInicialDoEstoqueLab() {
        Assert.assertTrue(loginPage.paginaInicialVisivel());
    }

    @Quando("informo o usuário {string} e a senha {string}")
    public void informoUsuarioESenha(String usuario, String senha) {
        loginPage.informarCredenciais(usuario, senha);
    }

    @Quando("solicito a entrada")
    public void solicitoEntrada() {
        loginPage.solicitarEntrada();
    }

    @Entao("devo visualizar a área de produtos")
    public void devoVisualizarAreaDeProdutos() {
        Assert.assertTrue(
                "A área de produtos não foi exibida após o login.",
                loginPage.areaDeProdutosVisivel()
        );
    }
}
