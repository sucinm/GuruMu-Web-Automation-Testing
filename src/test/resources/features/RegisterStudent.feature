@Register @Test
Feature: Register Student
  As a user i want to register to GuruMu website

@RegisterStudent
Scenario: Register Student with valid data
  Given User already in GuruMu register pop-up form
  When User input all valid data for student
  And User select "Siswa" in Peran field
  Then User click Daftar Button
  And User will redirect to Login Page

@RegisterStudent
Scenario Outline: Register Student with invalid email format
  Given User already in GuruMu register pop-up form
  When User input valid data except "<email>" in Email field for student
  And User select "Siswa" in Peran field
  Then User click Daftar Button
  And User will see alert message "format email salah"
Examples:
  | email           |
  | agusgmail@.com  |
  | agus31@gmailcom |
  | agus@opiqew.com |

@RegisterStudent
Scenario Outline: Register Student with invalid password format
  Given User already in GuruMu register pop-up form
  When User input valid data except "<password>" in Password field for student
  And User select "Siswa" in Peran field
  And User cant click Daftar Button
Examples:
| password    |
| agusganteng |
| agus123     |
| 1231313231  |
| ^&*&&^*@!#  |

@RegisterStudent
Scenario: Register Student with registered user
  Given User already in GuruMu register pop-up form
  When User input registered user data
  And User select "Siswa" in Peran field
  Then User click Daftar Button
  And User will see alert message "data sudah terdaftar"

@RegisterStudent
Scenario: Register Student without name
  Given User already in GuruMu register pop-up form
  When User input valid data for student
  And User empty the Nama Lengkap field
  And User select "Siswa" in Peran field
  Then User cant click Daftar Button

@RegisterStudent
Scenario: Register Student without password
  Given User already in GuruMu register pop-up form
  When User input valid data for student but empty the password
  And User select "Siswa" in Peran field
  Then User cant click Daftar Button

@RegisterStudent
Scenario: Register Student without email
  Given User already in GuruMu register pop-up form
  When User input valid data for student but empty the email
  And User select "Siswa" in Peran field
  Then User cant click Daftar Button

@RegisterStudent
Scenario: Register Student with empty data
  Given User already in GuruMu register pop-up form
  When User empty all data field
  And User select "Siswa" in Peran field
  Then User cant click Daftar Button

