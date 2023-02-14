@StudentViewSession
Feature: Student view session

  Background:
    When User click avatar navigation
    And User click menu Masuk
    And User input "herdiladania11@gmail.com" as email and input "fe123" as password
    And Student click menu Beranda
    And Student click profile icon button

  @ScenarioViewStudent
  Scenario: Verify 'Sedang Berlangsung' student page can be clicked
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung

  @ScenarioViewStudent
  Scenario: Verify 'Nama Guru' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show Nama Guru field

  @ScenarioViewStudent
  Scenario: Verify 'Jam' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show jam field

  @ScenarioViewStudent
  Scenario: Verify 'Hari & tanggal' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show Hari & tanggal field

  @ScenarioViewStudent
  Scenario: Verify 'Jam' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show jam field

  @ScenarioViewStudent
  Scenario: Verify 'Status' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show status field

  @ScenarioViewStudent
  Scenario: Verify 'Link google meet' field is displayed
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Should show Link google meet field

  @ScenarioViewStudent
  Scenario: Verify 'Link google meet' field can be clicked
    When Student click button Sedang Berlangsung
    Then Showing page Sedang Berlangsung
    And Student click google meet link