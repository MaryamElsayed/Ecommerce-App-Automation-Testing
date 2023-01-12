package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;
import static stepDefinitions.Browser.driver;
import pages.loginPage;

import java.time.Duration;

public class homeStepDef {
    Home home;

    @Given("user navigate to the website")
    public void openHomePage() {
        home = new Home(driver);
        home.openHomePage();
    }

}
