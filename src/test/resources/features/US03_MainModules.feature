@US03
Feature: As a user, I should be accessing all the main modules of the app.

  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page

  Scenario:  Verify users accessing all the main modules of the app.

    Then Verify the user see the following modules:

      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |