package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import pages.addProductsToCartPage;
import pages.addProductsToCompareListPage;

import static stepDefinitions.Browser.driver;

public class addProductToCompareListStepDef {
    addProductsToCompareListPage addProduct;

    @When("user click on compare button")
    public void user_click_on_add_to_cart_button()
    {
        addProduct = new addProductsToCompareListPage(driver);
        addProduct.AddBtnOneClick();
    }


    @Then("a successful message of adding to compare list displayed to the user")
    public void a_successful_message_of_adding_to_compare_list_displayed_to_the_user()
    {
        Assert.assertTrue(addProduct.MessageEle().isDisplayed());
    }
    @When("a user click on compare list link appear in the message")
    public void a_user_click_on_compare_list_link_appear_in_the_message()
    {
        addProduct.linkClick();
    }
    @Then("user go to compare list page")
    public void user_go_to_compare_list_page()
    {
        String expectedUrl = "https://demo.nopcommerce.com/compareproducts";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @An("find the product he added to the compare list")
    public void find_the_product_he_added_to_the_compare_list()
    {
        String expectedProductName = "adidas Consortium Campus 80s Running Shoes";
        String actualProductName = addProduct.productEle().getText();
        Assert.assertTrue(actualProductName.contains(expectedProductName));
    }
}
