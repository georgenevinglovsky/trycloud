
Feature: As a user, I want to access to Photos module.

  Background:
    Given users login to the app hannan
@wip
  Scenario:  verify user access to the photos module
    When the user clicks the "Photos" module hannan
    Then verify there are following sub-modules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |