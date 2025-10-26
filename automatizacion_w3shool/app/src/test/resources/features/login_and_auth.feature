#language: en
#author: BrandonGonzalezLopez

Feature: Login and Authentication Functionality
  As a W3Schools user
  I want to log in and authenticate with valid credentials
  So that I can access the website’s features

  @LoginAuth
  Scenario: Successful login with valid credentials
    Given the user is on the W3Schools login page
    When they enter valid credentials (email and password)
      | Email                 | Password     |
      | deivgonz777@gmail.com | Hero696969$  |
    Then the system should verify that the user has been successfully authenticated and redirected to the main menu of the website

  @LoginAuthInvalid
  Scenario: Failed login with invalid credentials
    Given the user is on the W3Schools login page
    When they enter invalid credentials (email and password)
      | Email                 | Password    |
      | deivgonz777@gmail.com | Hero1234567 |
    Then the system should display an error message indicating invalid credentials and deny access to the main menu
