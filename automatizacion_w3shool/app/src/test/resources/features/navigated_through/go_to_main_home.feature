#language: en
#author: BrandonGonzalezLopez

Feature: Navigation to the Main Home section in W3Schools
  As an authenticated W3Schools user
  I want to navigate through the main menu by clicking the logo at the top left
  So that I can access the Main Home section

  @NavigateToMainHomeOK
  Scenario: Navigate to the Main Home section
    Given an authenticated user is on the W3Schools main page
    When the user opens the main navigation menu
    And clicks on the W3Schools logo at the top left
    Then the system should correctly load the Main Home page
    And the vertical navigation menu should be displayed
