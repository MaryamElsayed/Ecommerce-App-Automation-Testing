package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import pages.addProductsToCartPage;

import static stepDefinitions.Browser.driver;
public class addProductStepDef {
    addProductsToCartPage addProduct;

    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button()
    {
        addProduct = new addProductsToCartPage(driver);
        addProduct.AddBtnOneClick();
    }

    @And("click on add to cart")
    public void click_on_add_to_cart()
    {
        addProduct.AddBtnTwoClick();
    }
    @Then("a successful message displayed to the user")
    public void a_successful_message_displayed_to_the_user()
    {
        Assert.assertTrue(addProduct.MessageEle().isDisplayed());
    }
    @When("a user click on shopping cart link appear in the message")
    public void a_user_click_on_shopping_cart_link_appear_in_the_message()
    {
        addProduct.linkClick();
    }
    @Then("user go to shopping cart page")
    public void user_go_to_shopping_cart_page()
    {
        String expectedUrl = "https://demo.nopcommerce.com/cart";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @An("find the product he added")
    public void find_the_product_he_added()
    {
        String expectedProductName = "adidas Consortium Campus 80s Running Shoes";
        String actualProductName = addProduct.productEle().getText();
        Assert.assertTrue(actualProductName.contains(expectedProductName));
    }
}
