Feature: As a user,I should be able to upload a file.
  Background:
    Given : user logged in successfully and on the home page

  Scenario: verify users to upload a file from Files
    When the user clicks the "Files" module
    When the user clicks the add icon one the top
    And users uploads file with the "Upload file" option
    Then verify the file is displayed on the page