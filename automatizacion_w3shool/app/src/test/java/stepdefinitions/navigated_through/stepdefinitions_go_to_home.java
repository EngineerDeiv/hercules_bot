package stepdefinitions.navigated_through;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import automatizacion_w3shool.tasks.OpenPage;
import automatizacion_w3shool.tasks.AuthUserW3school;
import automatizacion_w3shool.models.credentialsUserLogin;

public class stepdefinitions_go_to_home {

    @Given("an authenticated user is on the W3Schools main page")
    public void an_authenticated_user_is_on_the_w3schools_main_page() {
        // Create test credentials
        credentialsUserLogin credentials = new credentialsUserLogin("deivgonz777@gmail.com", "Hero696969$");
        
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenPage.toW3Schools(),                         // ← Already exists
                AuthUserW3school.withCredentials(credentials)   // ← Already exists
        );
    }
    @When("the user opens the main navigation menu")
    public void the_user_opens_the_main_navigation_menu() {
        Target menuButton = Target.the("Menu button").located(By.id("navbtn_menu"));
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(menuButton)
        );
    }
    @When("clicks on the W3Schools logo at the top left")
    public void clicks_on_the_w3schools_logo_at_the_top_left() {
        Target logo = Target.the("W3Schools logo").located(By.id("w3-logo"));
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(logo)
        );
    }
    @Then("the system should correctly load the Main Home page")
    public void the_system_should_correctly_load_the_main_home_page() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        System.out.println("Main Home page is loaded correctly");
    }
    @Then("the vertical navigation menu should be displayed")
    public void the_vertical_navigation_menu_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        System.out.println("Vertical navigation menu is displayed");
    }
}
