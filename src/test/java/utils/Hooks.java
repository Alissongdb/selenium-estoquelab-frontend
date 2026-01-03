package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import login.ManterLogin;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {

        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationpratice.com.br/");

        // Se NÃO for cenário de login, faz login automaticamente
        if (!scenario.getSourceTagNames().contains("@login")) {
            ManterLogin login = new ManterLogin();
            login.clicarBotaoLogin();
            login.informarLogin("alissondalbosco@hotmail.com");
            login.informarSenha("123456");
            login.clicarBtnLogin();
        }
    }

    @After
    public void finalizarTeste() {
        //DriverFactory.quitDriver();
    }
}
