package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.awesomeTagePage;

import static stepDefinitions.Browser.driver;
public class awesomeTagStepDef {
    awesomeTagePage awesome;

    @When("user go to search page")
    public void user_go_to_search_page()
    {
        awesome = new awesomeTagePage(driver);
        awesome.searchClick();
    }
    @And("select awesome tage")
    public void select_awesome_tage()
    {
        awesome.awesomeClick();
    }
    @Then("products with awesome tag displayed to the user")
    public void products_with_awesome_tag_displayed_to_the_user()
    {
        String expectedUrl ="https://demo.nopcommerce.com/awesome";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
