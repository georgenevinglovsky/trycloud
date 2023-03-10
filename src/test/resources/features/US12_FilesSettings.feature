@US12
Feature: As a user, I should be able to update settings.

  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page
  Scenario: Verify the users can check any checkbox on the Files page.
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any checkbox
