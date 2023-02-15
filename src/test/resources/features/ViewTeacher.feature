@Test
Feature: View Teacher

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "shafirayuria@gmail.com" as email and input "Akuinhere22" as password

  Scenario: Verify 'user' button is enabled
    Given Teacher already on Beranda / Home
    When Teacher click 'user' button
    Then button is enabled
    And click 'user' button
    Then Teacher Click 'Profile' option
    And Go to Teacher Profile

  Scenario: Verify 'Profile Picture' is
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Profile Picture'
    Then Profile picture teacher is displayed

  Scenario: Verify 'Teacher Name' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Teacher Name'
    Then Teacher name is displayed

  Scenario: Verify 'Rating' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Rating'
    Then Rating is displayed

  Scenario: Verify 'Tarif Belajar' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Tarif Belajar'
    Then Tarif Belajar is displayed

  Scenario: Verify 'Mata Pelajaran dan Tingkatan' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Mata Pelajaran dan Tingkatan'
    Then Mata Pelajaran dan Tingkatan is displayed

  Scenario: Verify Tentang Kursus in 'Spesialis Mata Pelajaran' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Spesialis Mata Pelajaran'
    Then Spesialis Mata Pelajaran is displayed

  Scenario: Verify Tentang Kursus in 'Jenjang Pendidikan' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Jenjang Pendidikan'
    Then Jenjang Pendidikan is displayed

  Scenario: Verify 'Degree' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Degree'
    Then Degree is displayed

  Scenario: Verify 'Tentang Saya' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Tentang Saya'
    Then Tentang Saya is displayed

  Scenario: Verify 'Pengalaman' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Pengalaman'
    Then Pengalaman is displayed

  Scenario: Verify 'Selengkapnya' button is enabled
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher click 'Selengkapnya' button
    Then button is enabled
    And Show 'Selengkapnya' modal

  Scenario: Verify 'Lokasi Saya' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Lokasi Saya'
    Then Lokasi Saya is displayed

  Scenario: Verify Ketersediaan in 'Offline' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Offline'
    Then Ketersediaan in 'Offline' is displayed

  Scenario: Verify Ketersediaan in 'Online' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Online'
    Then Ketersediaan in 'Online' is displayed

  Scenario: Verify 'Ulasan' is Displayed
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher verifies 'Ulasan'
    Then Ulasan is displayed

  Scenario: Verify 'Lihat Lebih Banyak' button is enabled
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher click 'Lihat Lebih Banyak' button
    Then button is enabled

  Scenario: Verify 'Cek Jadwal' button is enabled
    When User move to Profile Page
    Given Teacher already on User's Profile Page
    When Teacher click 'Cek Jadwal' button
    Then button is enabled