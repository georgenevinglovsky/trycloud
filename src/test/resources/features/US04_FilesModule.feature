@US04
Feature: As a user, I should be able to access to Files module.
  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    And user should see the home page

  Scenario: verify users can access to Files module

    When the user clicks the "Files" module
    Then verify the page title  "Files - Trycloud QA"



  Scenario: verify users can select all the uploaded files from the page

    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected
