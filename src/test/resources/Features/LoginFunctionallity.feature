Feature: Login functionality
  @UI @Run
  Scenario: Valid login functionality
Given user insert username
    And user insert password
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks ob LogOut button
    And insert username
    And insert password
  Scenario: Invalid login functionality