package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/default-cucumber-report"},
        features ="src/test/resources/Features",
        glue ="stepDefinitions",
        tags ="@swich",
        dryRun = false
)
public class TestRunner {
}
