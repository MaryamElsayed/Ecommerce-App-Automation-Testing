package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.currencySwitchPage;

import java.util.List;

import static stepDefinitions.Browser.driver;
public class currencySwitchStepDef {
    currencySwitchPage currency ;

    @When("change from US Dollar to Euro")
        public void change_from_US_Dollar_to_Euro()
            {
               currency = new currencySwitchPage(driver);
               currency.changeCurrency();
            }
    @Then("Currency of all products changed to Euro")
    public void Currency_of_all_products_changed_to_Euro()
    {
        List<WebElement> productPrices = currency.products();
        for (int i=0;i<productPrices.size();i++)
        {
            WebElement price = productPrices.get(i);
            String actualPrice = price.getText();
            Assert.assertTrue(actualPrice.contains("€"));
        }
    }
}
