package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.Home;
import pages.loginPage;
import pages.registerPage;
import static stepDefinitions.Browser.driver;

public class registerStepDef {
    Home home;
    registerPage register;

    WebElement birthDay;
    WebElement birthMonth;
    WebElement birthYear;
    Select daySelected;
    Select monthSelected;
    Select yearSelected;

    @And("user click on register")
    public void click_on_register()
    {
        home=new Home(driver);
        home.clickOnRegister();
    }
    @And("user selected his gender")
    public void select_gender()
    {
        register=new registerPage(driver);
       register.gender();
    }

    @And("user enter his first name")
    public void first_name()
    {
        register.firstName("Maryam");
    }
    @And("user enter his last name")
    public void last_name()
    {
        register.lastName("Mohamed");
    }
//    @And("user selected his date")
//    public void select_date()
//    {
//        birthDay=driver.findElement(By.name("DateOfBirthDay"));
//        birthMonth=driver.findElement(By.name("DateOfBirthMonth"));
//        birthYear=driver.findElement(By.name("DateOfBirthYear"));
//        daySelected = new Select(birthDay);
//        monthSelected= new Select(birthMonth);
//        yearSelected= new Select(birthYear);
//        daySelected.selectByValue("23");
//        monthSelected.selectByVisibleText("April");
//        yearSelected.selectByValue("2000");
//    }
    @And("user enter his email")
    public void enter_email()
    {
        register.emailEntry("maryamM@gmail.com");
    }
    @And("user enter his company name")
    public void enter_company_name()
    {
        register.company("xyz");
    }
    @And("user enter his password")
    public void enter_password()
    {
        register.passwordEntry("000000");
    }

    @And("user confirm his password")
    public void enter_confirm_password()
    {
        register.confirmPasswordEntry("000000");
    }

    @When("user press enter")
    public void press_enter()
    {
        register.confirmPassEle().sendKeys(Keys.ENTER);
    }


    @Then("message of successfully registration displayed")
    public void message()
    {
        String expectedMessage = "Your registration completed";
        String actualMessage = register.registrationMessageEle().getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
