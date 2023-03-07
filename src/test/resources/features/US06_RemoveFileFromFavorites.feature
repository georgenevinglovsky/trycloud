Feature: As a user, I should be able to remove files from favorites.


  Background:
    Given : user logged in successfully and on the home page
    Scenario:
      When the user clicks the "Files" module
      When user click action-icon from any file on the page
      And  user choose the "Remove from favorites" option
      And user click the "Favorites" sub-module on the left side
      Then Verify that the file is not listed in the Favorites table
