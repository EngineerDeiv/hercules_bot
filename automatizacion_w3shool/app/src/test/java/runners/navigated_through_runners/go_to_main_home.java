package runners.navigated_through_runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/navigated_through/go_to_main_home.feature",
        glue = {"stepdefinitions", "stepdefinitions.navigated_through"},
        plugin = {"pretty", "html:target/cucumber-reports/navigation"})
public class go_to_main_home {
}
