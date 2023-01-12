package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Home;
import pages.loginPage;
import pages.resetPasswordPage;

import static stepDefinitions.Browser.driver;
public class resetPasswordStepDef {
    Home home;
    resetPasswordPage reset;
    loginPage login;

    @And("user click on forgot password")
    public void user_click_on_forgot_password()
    {
        login = new loginPage(driver);
        login.recoverPasswordClick();
    }
    @And("user go to password recovery page")
    public void use_go_to_password_recovery_page()
    {
        String expectedUrl = "https://demo.nopcommerce.com/passwordrecovery";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @And("user enter his recover email")
    public void user_enter_his_recover_email()
    {
        reset = new resetPasswordPage(driver);
        reset.enterEmailRecovery("maryamM@gmail.com");
    }
    @When("user press enter on email")
    public void user_press_enter_on_email()
    {
        login.usernameEle().sendKeys(Keys.ENTER);
    }
    @When("user press recover button")
    public void user_press_recover_button()
    {

        reset.recoverBtnClick();
    }
    @Then("message displayed successfully")
    public void message_displayed_successfully()
    {

        String expectedMsg = "Email with instructions has been sent to you.";
        String actualMsg = reset.recoveryMsg().getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
