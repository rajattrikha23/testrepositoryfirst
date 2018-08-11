Feature: Test FB smoke scenario
  I want to test FB Login

  Scenario: Test Login with valid credetials
    Given Open chrome and start application
    When I enter valid username and valid password
    Then User should login successfully