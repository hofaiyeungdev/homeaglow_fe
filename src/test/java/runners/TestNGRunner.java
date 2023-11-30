package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinitions", "AppHooks"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/report.json"},
        tags = "not @ignore and not @NotYetImplement"
)

@Test
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
