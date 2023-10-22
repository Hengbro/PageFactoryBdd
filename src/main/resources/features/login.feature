Feature: Login Web

  Scenario: Login Valid Test
    Given User is on the login page
    When User input username password click button login
    Then User should be logged in