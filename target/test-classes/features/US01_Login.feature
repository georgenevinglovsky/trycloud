Feature: Login functionality


  Scenario: User login with correct credentials
    Given user is on login page
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page

