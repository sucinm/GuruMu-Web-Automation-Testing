@Login
  Feature: Login
    As a user i want to login to website sauce demo

  Scenario: Normal login
    Given User open the website GuruMu
    When User input "johndoe@gmail.com" as email and input "pass12345" as password

  Scenario Outline: Invalid Login
    Given User open the website GuruMu
    When User input "<email>" as email and input "<password>" as password
    Then User see error "<errorMessage>" on login page
  Examples:
    | email             | password | errorMessage         |
    | johndoe@gmail.com |          | Password is required |
    |                   | 123      | Username is required |