#language: en
#author: BrandonGonzalezLopez

Feature: Navigation to the Bash Home section in W3Schools
  As a W3Schools user
  I want to navigate through the main menu
  So that I can access and verify the content of the Bash Home section

#FIRST SCENARIO OF AUTOMATION TESTING
  @NavigateToBashOK
    Scenario: Navigate to the Bash Home section
      Given the user is on the W3Schools main page
      When it open the main navigation menu
      And click on the dropdown menu on the left side
      And select the “Bash” option from the list
      Then the system should load the Bash page correctly
      When the page has fully loaded, the user scrolls vertically down through the Bash Home section
      Then the user should see detailed Bash content and verify that the Bash Home information is displayed correctly
