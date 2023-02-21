@TestViewStudent @Test
Feature: View Student

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "herdiladania11@gmail.com" as email and input "fe123" as password
    And User clicked masuk button

  Scenario: Verify 'user' button is enabled
    Given Student already on Beranda / Home
    When Student click 'user' button
    Then button is enabled
    And click 'user' button
    Then Student click 'Profile' option
    And Go to Student Profile

  Scenario: Verify 'Profile Picture' is Displayed
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student verifies 'Profile Picture'
    And Profile picture is displayed

  Scenario: Verify 'Name' is Displayed
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student verifies 'Name'
    And Name is displayed

  Scenario: Verify 'Email' is Displayed
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student verifies 'Email'
    And Email is displayed

  Scenario: Verify 'Handphone' is Displayed\
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student verifies 'Handphone'
    And Handphone is displayed

  Scenario: Verify 'Alamat' is Displayed
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student verifies 'Alamat'
    And Alamat is displayed

  Scenario: Verify 'Profile' button is enabled
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student click 'Profile' button
    Then button is enabled
    And Show Profile sidebar

  Scenario: Verify 'Riwayat' button is enabled
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student click 'Riwayat' button
    Then button is enabled
    And Show Riwayat sidebar

  Scenario: Verify 'Sedang Berlangsung' button is enabled
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student click 'Sedang Berlangsung' button
    Then button is enabled
    And Show Sedang Berlangsung sidebar

  Scenario: Verify 'Perbarui Profil' button is enabled
    Given User move to Profile Page
    When Student already on User's Profile Page
    Then Student click 'Perbarui Profil' button
    And button is enabled

