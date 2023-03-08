@hakob
Feature:  As a user, I should be able to search any item/ users from the homepage.

  Scenario Outline: Verify users can search any files/folder/users from the search box.

    Given user logged in to the appHV
    When the user clicks the magnifier icon on the right top
    And users search any "<searchword>" in existing file,folder,user name
    Then verify the app displays "<searchword>" in the expected result option
    Examples:
      | searchword |
      | file       |
      | folder     |
      | user       |
