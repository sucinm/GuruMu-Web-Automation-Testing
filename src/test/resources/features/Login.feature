@Login
Feature: Login
  As a user i want to login to GuruMu website

  Scenario: Login user with valid email & password
    Given User already in GuruMu login page
    When User input "fikri@gmail.com" as email and input "password12" as password
    Then User will see "Succes Login" in beranda page

  Scenario: Login user with empty data
    Given User already in GuruMu login page
    When User input "" as email and input "" as password
    Then User cant clicked masuk button

  Scenario Outline: Login user with invalid data
    Given User already in GuruMu login page
    When User input "<email>" as email and input "<password>" as password
    And Alert pop-up will shown with message "data not found"
    Examples:
      | email                  | password    |
      | unregistered@gmail.com | unregister  |
      | wrongemail@gmail.com   | validpass   |
      | validemail@gmail.com   | invalidpass |