package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

public class LoginStepDefinitions {

    @Given("the user is on the W3Schools login page")
    public void the_user_is_on_the_w3schools_login_page() {
        System.out.println("User is on the W3Schools login page");
        throw new io.cucumber.java.PendingException();
    }

    @When("they enter valid credentials \\(email and password)")
    public void they_enter_valid_credentials_email_and_password(DataTable dataTable) {
        System.out.println("Entering valid credentials");
        System.out.println("Data: " + dataTable.toString());
        throw new io.cucumber.java.PendingException();
    }

    @When("they enter invalid credentials \\(email and password)")
    public void they_enter_invalid_credentials_email_and_password(DataTable dataTable) {
        System.out.println("Entering invalid credentials");
        System.out.println("Data: " + dataTable.toString());
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system should verify that the user has been successfully authenticated and redirected to the main menu of the website")
    public void the_system_should_verify_that_the_user_has_been_successfully_authenticated_and_redirected_to_the_main_menu_of_the_website() {
        System.out.println("Verifying successful authentication and redirection");
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system should display an error message indicating invalid credentials and deny access to the main menu")
    public void the_system_should_display_an_error_message_indicating_invalid_credentials_and_deny_access_to_the_main_menu() {
        System.out.println("Verifying error message for invalid credentials");
        throw new io.cucumber.java.PendingException();
    }
}