#language: en
#author: BrandonGonzalezLopez

Feature: Navigation to the Bash Home section in W3Schools
  As an authenticated user in W3Schools
  I want to navigate through the main navigation bar and access the Bash section
  So that I can view the Bash Home page

  @NavigateToBashHome
  Scenario: Access the Bash Home section from the main navigation menu
    Given the user is authenticated and on the W3Schools main page
    When the main navigation bar has fully loaded
    And the user clicks the right navigation arrow to reveal more topics
    And the user locates and clicks on the “Bash” option
    Then the system should load the Bash section correctly
    And the Bash Home page should be displayed on the screen
