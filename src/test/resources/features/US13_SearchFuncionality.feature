@hakob
Feature: As a user, I should be able to search any item/ users from the homepage.

  Scenario Outline: Verify users can search any files/folder/users from the search box.

    Given user logged in to the app
    When the user clicks the magnifier icon on the right top
    And users search "<searchword>" in any existing file,folder,user name
    Then verify the app displays the "<searchword>" in expected result option

    Examples:
      | searchword |
      | file       |
      | selenium   |
      | user       |