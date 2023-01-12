package stepDefinitions;
import io.cucumber.java.en.And;
import pages.requiredFieldsOfProductPage;

import static stepDefinitions.Browser.driver;
public class requiredFieldsStepDef {
    requiredFieldsOfProductPage req;
    @And("user chooses required fields in the product")
    public void user_chooses_required_fields_in_the_product()
    {
        req = new requiredFieldsOfProductPage(driver);
        req.chooseSize();
        req.chooseColor();
    }
}
