package utils;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void iniciarDriver() {
        driver = DriverFactory.getDriver();
    }
}
