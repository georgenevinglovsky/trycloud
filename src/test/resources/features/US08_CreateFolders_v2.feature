Feature: As a user,I should be able to add/create folders.

  Background:
    Given : user logged in successfully and on the home page

    Scenario: Verify users can add the folder
      When the user clicks the "Files" module
      And user clicks the add icon on the top
      And user click "New folder"
      And user write a folder name
      When the user click submit icon
      Then Verify the folder is displayed on the page
