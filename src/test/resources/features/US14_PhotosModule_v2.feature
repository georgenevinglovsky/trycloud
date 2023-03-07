@US14
Feature: As a user, I want to access to Photos module.

  Background:
    Given users login to the app

  Scenario:  verify user access to the photos module
    When the user clicks the "Photos" module
    Then verify there are following sub-modules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |