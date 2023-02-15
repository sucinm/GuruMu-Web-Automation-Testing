@Test
Feature: View Student

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "herdiladania11@gmail.com" as email and input "fe123" as password


  Scenario: Verify 'user' button is enabled
    Given Student already on Beranda / Home
    When Student click 'user' button
    Then button is enabled
    And click 'user' button
    Then Student click 'Profile' option
    And Go to Student Profile

  Scenario: Verify 'Profile Picture' is Displayed
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student verifies 'Profile Picture'
    Then Profile picture is displayed

  Scenario: Verify 'Name' is Displayed
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student verifies 'Name'
    Then Name is displayed

  Scenario: Verify 'Email' is Displayed
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student verifies 'Email'
    Then Email is displayed

  Scenario: Verify 'Handphone' is Displayed\
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student verifies 'Handphone'
    Then Handphone is displayed

  Scenario: Verify 'Alamat' is Displayed
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student verifies 'Alamat'
    Then Alamat is displayed

  Scenario: Verify 'Profile' button is enabled
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student click 'Profile' button
    Then button is enabled
    And Show Profile sidebar

  Scenario: Verify 'Riwayat' button is enabled
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student click 'Riwayat' button
    Then button is enabled
    And Show Riwayat sidebar

  Scenario: Verify 'Sedang Berlangsung' button is enabled
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student click 'Sedang Berlangsung' button
    Then button is enabled
    And Show Sedang Berlangsung sidebar

  Scenario: Verify 'Perbarui Profil' button is enabled
    When User move to Profile Page
    Given Student already on User's Profile Page
    When Student click 'Perbarui Profil' button
    Then button is enabled

