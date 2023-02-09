
  Feature: Login
    As a user i want to login to website sauce demo

    @TestClick
    Scenario: User click navigation
      Given User open the website GuruMu
      When User click avatar navigation
  @Login
  Scenario: Normal login
    Given User open the website GuruMu
    When User click menu Masuk
    And User input "suci@gmail.com" as email and input "12345" as password
    Then User show popup message

  Scenario Outline: Invalid Login
    Given User open the website GuruMu
    When User input "<email>" as email and input "<password>" as password
    Then User see error "<errorMessage>" on login page
  Examples:
    | email             | password | errorMessage         |
    | johndoe@gmail.com |          | Password is required |
    |                   | 123      | Username is required |