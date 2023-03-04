@TestViewTeacher @Test
Feature: View Teacher

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    Then User click menu Masuk
    And User input "shafirayuria@gmail.com" as email and input "Akuinhere22" as password
    And User clicked masuk button

  Scenario: Verify 'user' button is enabled
    Given Teacher already on Beranda / Home
    When Teacher click 'user' button
    Then button is enabled
    And click 'user' button
    Then Teacher Click 'Profile' option
    And Go to Teacher Profile

  Scenario: Verify 'Profile Picture' is
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Profile Picture'
    And Profile picture teacher is displayed

  Scenario: Verify 'Teacher Name' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Teacher Name'
    And Teacher name is displayed

  Scenario: Verify 'Rating' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Rating'
    And Rating is displayed

  Scenario: Verify 'Tarif Belajar' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Tarif Belajar'
    And Tarif Belajar is displayed

  Scenario: Verify 'Mata Pelajaran dan Tingkatan' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Mata Pelajaran dan Tingkatan'
    And Mata Pelajaran dan Tingkatan is displayed

  Scenario: Verify Tentang Kursus in 'Spesialis Mata Pelajaran' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Spesialis Mata Pelajaran'
    And Spesialis Mata Pelajaran is displayed

  Scenario: Verify Tentang Kursus in 'Jenjang Pendidikan' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Jenjang Pendidikan'
    And Jenjang Pendidikan is displayed

  Scenario: Verify 'Degree' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Degree'
    And Degree is displayed

  Scenario: Verify 'Tentang Saya' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Tentang Saya'
    And Tentang Saya is displayed

  Scenario: Verify 'Pengalaman' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Pengalaman'
    And Pengalaman is displayed

  Scenario: Verify 'Selengkapnya' button is enabled
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher click 'Selengkapnya' button
    Then button is enabled
    And Show 'Selengkapnya' modal

  Scenario: Verify 'Lokasi Saya' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Lokasi Saya'
    And Lokasi Saya is displayed

  Scenario: Verify Ketersediaan in 'Offline' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Offline'
    And Ketersediaan in 'Offline' is displayed

  Scenario: Verify Ketersediaan in 'Online' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Online'
    And Ketersediaan in 'Online' is displayed

  Scenario: Verify 'Ulasan' is Displayed
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher verifies 'Ulasan'
    And Ulasan is displayed

  Scenario: Verify 'Lihat Lebih Banyak' button is enabled
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher click 'Lihat Lebih Banyak' button
    And button is enabled

  Scenario: Verify 'Cek Jadwal' button is enabled
    Given User move to Profile Page
    When Teacher already on User's Profile Page
    Then Teacher click 'Cek Jadwal' button