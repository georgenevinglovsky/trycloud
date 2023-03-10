
Feature: As a user, I want to access to Photos module.

  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page
@wip
  Scenario:  verify user access to the photos module
    When the user clicks the "Photos" module hannan
    Then verify there are following sub-modules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |