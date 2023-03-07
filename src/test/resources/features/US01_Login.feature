Feature: Login functionality

  Background:
    Given user is on login page

  Scenario: User login with correct credentials
    When user input correct username
    And user input correct password
    And click login button
    Then user should see the home page

  Scenario Outline: Verify user login fail with invalid credentials
    When user enter invalid "<username>" and "<password>"
    And click login button
    Then verify "<message>" message should be displayed
    Examples:
      | username | password    | message                     |
      | User9    | Wrong       | Wrong username or password. |
      | Wrong    | Userpass123 | Wrong username or password. |
      | Wrong    | Wrong       | Wrong username or password. |