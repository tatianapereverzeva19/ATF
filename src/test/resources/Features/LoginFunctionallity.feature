Feature: Login functionality
  @UI @Run
  Scenario: Valid login functionality
Given user insert username
    And user insert password
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks ob LogOut button
  Scenario: Invalid login functionality