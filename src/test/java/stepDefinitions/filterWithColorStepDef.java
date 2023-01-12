package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.filterWithColoPage;

import static stepDefinitions.Browser.driver;
public class filterWithColorStepDef {
    filterWithColoPage filter;

    @When("user select a red color")
    public void user_select_a_red_color()
    {
        filter=new filterWithColoPage(driver);
        filter.selectCheckBox();
    }
    @Then("shoes with red color only appeared")
    public void shoes_with_red_color_only_appeared()
    {
        boolean f=filter.isSelected();
        Assert.assertTrue(f);
    }

}
