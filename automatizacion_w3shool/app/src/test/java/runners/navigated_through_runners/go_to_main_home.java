package runners.navigated_through_runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/navigated_through/go_to_main_home.feature",
        glue = {"stepdefinitions", "stepdefinitions.navigated_through"},
        plugin = {"pretty", "html:target/cucumber-reports/navigation"})
public class go_to_main_home {
}
