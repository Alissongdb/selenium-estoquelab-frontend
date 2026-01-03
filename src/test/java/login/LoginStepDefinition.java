package login;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginStepDefinition {

    private ManterLogin manterLogin;

    public LoginStepDefinition() {
        this.manterLogin = new ManterLogin();
    }

    @Dado("que estou no site Automation Pratice")
    public void que_estou_no_site_automation_pratice() {
    }

    @Dado("clico no botao Login da pagina principal")
    public void clico_no_botao_login_da_pagina_principal() {
        manterLogin.clicarBotaoLogin();
    }

    @Quando("preencho o campo email com {string}")
    public void preencho_o_campo_email_com(String email) {
        manterLogin.informarLogin("alissondalbosco@hotmail.com");
    }

    @Quando("preencho o campo senha com {string}")
    public void preencho_o_campo_senha_com(String senha) {
        manterLogin.informarSenha("123456");
    }

    @Quando("clico no botao Login")
    public void clico_no_botao_login() {
        manterLogin.clicarBtnLogin();
    }

    @Entao("deve ser aberto uma janela popup com a mensagem Login realizado")
    public void deve_ser_aberto_uma_janela_popup_com_a_mensagem_login_realizado() {
        Assert.assertTrue(
                "Login realizado\n" +
                        "Olá, alissondalbosco@hotmail.com",
                manterLogin.loginRealizadoComSucesso()
        );
    }
}
