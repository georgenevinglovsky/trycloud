Feature: As a user, I should be able to write comments to files/folders.

  Scenario: Verify users to write comments to files/folder
    Given Users at the Dashboard page
    When Users be able to click on Files module and landing on Files page
    When Users should be able to click on dot dot dot ... icon on each file list
    And Users should be able to click on Details After actions menu show up
    And User should be able to click on Comments icon
    And Users should be able to write "new comments" and click post the comment
    Then The posted comments should show under comment box



