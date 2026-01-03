package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.time.Duration;

public class ManterLogin {

    private WebDriver driver;
    private WebDriverWait wait;

    public ManterLogin() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clicarBotaoLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[href='/login']")
        )).click();
    }

    public void informarLogin(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("user")
        )).sendKeys(email);
    }

    public void informarSenha(String senha) {
        driver.findElement(By.id("password")).sendKeys(senha);
    }

    public void clicarBtnLogin() {
        driver.findElement(By.id("btnLogin")).click();
    }

    public boolean loginRealizadoComSucesso() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".swal2-popup")
        )).isDisplayed();
    }

}
