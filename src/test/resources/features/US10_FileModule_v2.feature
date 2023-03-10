Feature: As a user, I should be able to delete a file/folder.

  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page
  @US10
  Scenario: Verify users delete a file/folder
    When the user clicks on the "Files" modulee
    And user click action-icon from any file on the page
    And user choose the "Delete" folder option
    When the user clicks the Deleted folder sub-module on the left side
    Then Verify the deleted file is displayed on the Deleted Files page.