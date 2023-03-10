@US04
Feature: As a user, I should be able to access to Files module.
    Background:
      Given user logged in successfully and on the home page hannan


  Scenario: verify users can access to Files module

    When the user clicks the "Files" module
    Then verify the page title  "Files - Trycloud QA"



  Scenario: verify users can select all the uploaded files from the page

    Given user logged in successfully and on the home page hannan
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected
