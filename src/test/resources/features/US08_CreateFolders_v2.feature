Feature: As a user,I should be able to add/create folders.

  Background:
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page

    @US08
    Scenario: Verify users can add the folder meiyin
      When the user clicks the "Files" module meiyin
      And user clicks the add icon on the top meiyin
      And user click "New folder" meiyin
      And user write a folder name meiyin
      When the user click submit icon meiyin
      Then Verify the folder is displayed on the page meiyin
