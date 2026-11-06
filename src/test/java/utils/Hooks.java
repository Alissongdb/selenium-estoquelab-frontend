package utils;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void beforeScenario() {
        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://estoquelab.netlify.app/");
    }
}
