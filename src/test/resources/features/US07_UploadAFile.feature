Feature: As a user,I should be able to upload a file.
  Background:
    Given  user logged in successfully and on the home page aimiati

 @US07
  Scenario: verify users to upload a file from Files aimaiti
    When the user clicks the "Files" module aimaiti
    When the user clicks the add icon one the top aimaiti
    And users uploads file with the "Upload file" option aimaiti
    Then verify the file is displayed on the page aimiati