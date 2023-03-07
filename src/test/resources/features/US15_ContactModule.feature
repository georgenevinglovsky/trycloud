Feature: Contact Module
  US13: As a user, I should be able to access to Contacts module.

  Background:
    Given user is logged to the Application
  @wip
  Scenario: :  verify user access to the contacts module.
    Given user on the dashboard page
    When the user clicks the "Contacts" module
    Then verify the page title is "Contacts - Trycloud QA"