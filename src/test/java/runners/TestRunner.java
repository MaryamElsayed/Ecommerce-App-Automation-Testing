package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "stepDefinitions",
        plugin = {"pretty",
                "html:target/cucumber.html"},
        tags = "@tag1"
)
public class TestRunner {
}
