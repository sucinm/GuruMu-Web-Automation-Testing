@Register
Feature: Register
  As a user i want to register to GuruMu website

  @RegisterTeacher
  Scenario: Register Teacher with valid data
    Given User already in GuruMu register pop-up form
    When User input all valid data for teacher
    And User select "Guru" in Peran field
    Then User click Daftar Button
    And User will redirect to Login Page

  @RegisterTeacher
  Scenario Outline: Register Teacher with invalid email format
    Given User already in GuruMu register pop-up form
    When User input valid data except "<email>" in Email field for teacher
    And User select "Guru" in Peran field
    Then User click Daftar Button
    And User will see alert message "format email salah"
    Examples:
      | email           |
      | agusgmail@.com  |
      | agus12@gmailcom |
      | agus@opiqew.com |

  @RegisterTeacher
  Scenario Outline: Register Teacher with invalid password format
    Given User already in GuruMu register pop-up form
    When User input valid data except "<password>" in Password field for student
    And User select "Guru" in Peran field
    Then User cant click Daftar Button
    Examples:
      | password    |
      | agusganteng |
      | agus123     |
      | 1231313231  |
      | ^&*&&^*@!#  |

  @RegisterTeachertest
  Scenario: Register Student with registered user
    Given User already in GuruMu register pop-up form
    When User input registered user data
    And User select "Guru" in Peran field
    Then User click Daftar Button
    And User will see alert message "data sudah terdaftar"

  @RegisterTeacher
  Scenario: Register Teacher without name
    Given User already in GuruMu register pop-up form
    When User input valid data for teacher
    And User empty the Nama Lengkap field
    And User select "Guru" in Peran field
    Then User cant click Daftar Button

  @RegisterTeacher
  Scenario: Register Student without password
    Given User already in GuruMu register pop-up form
    When User input valid data for student but empty the password
    And User select "Guru" in Peran field
    Then User cant click Daftar Button

  @RegisterTeacher
  Scenario: Register Student without email
    Given User already in GuruMu register pop-up form
    When User input valid data for student but empty the email
    And User select "Guru" in Peran field
    Then User cant click Daftar Button


  @RegisterTeacher
  Scenario: Register Teacher with empty data
    Given User already in GuruMu register pop-up form
    When User empty all data field
    And User select "Guru" in Peran field
    Then User cant click Daftar Button


