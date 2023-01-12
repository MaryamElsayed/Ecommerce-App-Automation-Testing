package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import pages.addProductsToCartPage;
import pages.addProductsToWishList;

import static stepDefinitions.Browser.driver;

public class addProductToWishListStepDef {
    addProductsToWishList addProduct;

    @When("user click on heart button")
    public void user_click_on_heart_button()
    {
        addProduct = new addProductsToWishList(driver);
        addProduct.AddBtnOneClick();
    }

    @And("click on add to wishlist")
    public void click_on_add_to_wishlist()
    {
        addProduct.AddBtnTwoClick();
    }

    @Then("a successful message of adding to wishlist displayed to the user")
    public void a_successful_message_of_adding_to_wishlist_displayed_to_the_user()
    {
        Assert.assertTrue(addProduct.MessageEle().isDisplayed());
    }
    @When("a user click on wish list link appear in the message")
    public void a_user_click_on_wish_list_link_appear_in_the_message()
    {
        addProduct.linkClick();
    }
    @Then("user go to wish list page")
    public void user_go_to_wish_list_page()
    {
        String expectedUrl = "https://demo.nopcommerce.com/wishlist";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @An("find the product he added to the wish list")
    public void find_the_product_he_added_to_the_wish_list()
    {
        String expectedProductName = "adidas Consortium Campus 80s Running Shoes";
        String actualProductName = addProduct.productEle().getText();
        Assert.assertTrue(actualProductName.contains(expectedProductName));
    }
}
