@Login
Feature: Login
  As a user i want to login to GuruMu website

  Scenario: Login user with valid email & password
    Given User already in GuruMu login page
    When User input "qatestregisterguru1@gmail.com" as email and input "Qatestguru@123" as password
    Then User clicked masuk button
    And User will see "Succes Login" in beranda page

  Scenario Outline: Login user with empty data
    Given User already in GuruMu login page
    When User input "<email>" as email and input "<password>" as password
    Then User cant clicked masuk button
    Examples:
      | email                | password    |
      |                      |             |
      | wrongemail@gmail.com |             |
      |                      | invalidpass |

  Scenario Outline: Login user with invalid data
    Given User already in GuruMu login page
    When User input "<email>" as email and input "<password>" as password
    Then User clicked masuk button
    And Alert pop-up will shown with message "data not found"
    Examples:
      | email                  | password    |
      | unregistered@gmail.com | unregister  |
      | wrongemail@gmail.com   | validpass   |
      | validemail@gmail.com   | invalidpass |