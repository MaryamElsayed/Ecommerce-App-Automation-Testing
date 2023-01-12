package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.createOrderPage;

import static stepDefinitions.Browser.driver;
public class createOrderStepDef {
    createOrderPage create;

    @When("user accept terms of service")
    public void user_accept_terms_of_service()
    {
        create = new createOrderPage(driver);
        create.termsClick();
    }
    @And("click on checkout")
    public void click_on_checkout()
    {
        create.checkOutClick();
    }
    @And("user enter his required information to continue shipment")
    public void user_enter_his_required_information_to_continue_shipment()
    {
        create.infoEntry("Maryam",
                "Mohamed",
                "maryamM@gmail.com",
                "Egypt",
                "Cairo",
                "obourCity",
                "12345",
                "01254789");
    }
    @And("user complete order")
    public void user_complete_order() throws InterruptedException {
        create.completeOrder();
    }
    @Then("message displayed that order placed successfully")
    public void message_displayed_that_order_placed_successfully()
    {
//        System.out.println(driver.getCurrentUrl());
//        String expectedMsg = "Thank you";
//        String actualMsg = create.messageEle().getText();
//        System.out.println(actualMsg);
//        Assert.assertEquals(expectedMsg,actualMsg);
        String expectedUrl = "https://demo.nopcommerce.com/onepagecheckout#opc-confirm_order";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
}
