package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.searchPage;

import static stepDefinitions.Browser.driver;
public class searchStepDef {
    searchPage search;

    @When("type in the search bar the product he wants")
    public void type_in_the_search_bar_the_product_he_wants()
    {
        search=new searchPage(driver);
        search.searchProduct("HTC");
    }
    @And("click on search button")
    public void click_on_search_button()
    {
        search.searchBtnClick();
    }
    @Then("products should display that contains the searched word")
    public void products_should_display_that_contains_the_searched_word()
    {
        Assert.assertTrue(search.SearchedItemsCount()>0);
        Assert.assertTrue(driver.getCurrentUrl().contains("HTC"));
    }
}
