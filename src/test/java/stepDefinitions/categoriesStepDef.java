package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.categoriesPage;

import static stepDefinitions.Browser.driver;
public class categoriesStepDef {
    categoriesPage cat;

    @When("user hover on Apparel category")
    public void user_hover_on_a_category()
    {
        cat=new categoriesPage(driver);
        cat.moveToMainMenu();
    }
    @And("user select Shoes subcategory")
    public void user_click_on_the_sub_category()
    {
        cat.moveToSubMenu();
    }
    @Then("sub category page appear")
    public void sub_category_page_appear()
    {
        String expectedUrl="https://demo.nopcommerce.com/shoes";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
