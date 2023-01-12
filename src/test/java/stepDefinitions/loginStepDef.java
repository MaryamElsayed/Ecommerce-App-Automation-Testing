package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;
import pages.loginPage;
import static stepDefinitions.Browser.driver;

public class loginStepDef {

    loginPage login  ;
    Home home ;


    @And("user click on login")
    public void user_click_on_login()
    {
        home=new Home(driver);
        home.clickOnLogin();
    }

    @And("^user enter his email \"(.*)\" and his password \"(.*)\"$")
    public void data_entry(String username,String password)
    {
        login = new loginPage(driver);
        login.enterUserData(username,password);
    }

    @When("user press enter to login")
    public void press_enter()
    {
        login.passwordEle().sendKeys(Keys.ENTER);
    }
    @When("user press login button")
    public void press_login()
    {
        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();
    }
    @Then("user can login successfully")
    public void login_successfully()
    {
        WebElement myAccountLabel=driver.findElement(By.xpath("//a[@class=\"ico-account\"]"));
        Assert.assertTrue(myAccountLabel.isDisplayed());
        Assert.assertEquals(myAccountLabel.getText(), "My account");
    }


}
