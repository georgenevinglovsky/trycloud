Feature: As a user,I should be able to add/create folders.

  Background:
    Given : user logged in successfully and on the home page meiyin


    Scenario: Verify users can add the folder meiyin
      When the user clicks the "Files" module meiyin
      And user clicks the add icon on the top meiyin
      And user click "New folder" meiyin
      And user write a folder name meiyin
      When the user click submit icon meiyin
      Then Verify the folder is displayed on the page meiyin
