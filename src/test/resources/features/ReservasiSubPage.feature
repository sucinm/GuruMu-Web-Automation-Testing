@Reservasi
Feature: Reservasi Sub Page
  Background:
#    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "sucimurid@gmail.com" as email and input "sucimurid" as password
    And User clicked masuk button
    When Student click menu Beranda
    And Student input "matematika" as mata pelajaran
    And Student input "jakarta" as lokasi
    Then Should show teacher list
    Then Should show home page
    When Student click Guru
    Then Should show Guru Details
    Then Click Reservation

  Scenario: X button is shown
    Then show 'X' button

  Scenario: Payment method is shown
    Then show payment method

  Scenario: Pesan saya is shown
    Then show pesan saya

  Scenario: Metode Belajar is shown
    Then show metode belajar

  Scenario: Tanggal reservasi is shown
    Then show tanggal reservasi

  Scenario: Jam reservasi is shown
    Then show jam reservasi

  Scenario: Alamat is shown
    Then show alamat

  Scenario: Nomor HP is shown
    Then show nomor HP

