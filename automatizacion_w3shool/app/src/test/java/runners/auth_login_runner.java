package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login_and_auth.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports/auth_login"}
)
public class auth_login_runner {
}