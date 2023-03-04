@TeacherViewSession @Test
Feature: Teacher view session

  Background:
    When User click avatar navigation
    And User click menu Masuk
    And User input "suciguru@alta.com" as email and input "suciguru" as password
    And User clicked masuk button
    And Student click menu Beranda
    And Student click profile icon button

  @ScenarioViewTeacher
  Scenario: Verify 'Cek Jadwal' in Riwayat teacher page can be click
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session

  @ScenarioViewTeacher
  Scenario: Verify 'Cek Jadwal' in Riwayat teacher page without delay
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session without delay 3s

  @ScenarioViewTeacher
  Scenario: Verify 'Nama Murid' field is displayed in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Should show Nama Murid field

  @ScenarioViewTeacher
  Scenario: Verify 'Jam' field is displayed in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Should show jam field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Hari & tanggal' field is displayed in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Should show Hari & tanggal field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Status' field is displayed in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Should show status field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Link google meet' field is displayed in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Should show Link google meet field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Link google meet' field can be clicked in Riwayat guru session
    When Teacher click Cek Jadwal button on profile page
    Then Show page Riwayat in guru session
    And Teacher click google meet link

  @ScenarioViewTeacher
  Scenario: Verify 'Sedang Berlangsung' in teacher page can be click
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Show page Sedang Berlangsung in guru session

  @ScenarioViewTeacher
  Scenario: Verify 'Sedang Berlangsung' in teacher page without delay
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Show page Sedang Berlangsung in guru session without delay

  @ScenarioViewTeacher
  Scenario: Verify 'Nama Murid' field is displayed in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Should show Nama Murid field

  @ScenarioViewTeacher
  Scenario: Verify 'Jam' field is displayed in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Should show jam field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Hari & tanggal' field is displayed in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Should show Hari & tanggal field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Status' field is displayed in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Should show status field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Link google meet' field is displayed in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Should show Link google meet field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Link google meet' field can be clicked in Sedang Berlangsung guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Sedang Berlangsung button
    And Teacher click google meet link

  @ScenarioViewTeacher
  Scenario: Verify 'Jadwal Mengajar' in teacher page can be click
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Jadwal Mengajar button in guru session
    And Show page Jadwal Mengajar in guru session

  @ScenarioViewTeacher
  Scenario: Verify 'Jadwal Mengajar' in teacher page without delay
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Jadwal Mengajar button in guru session
    And Show page Jadwal Mengajar in guru session without delay

  @ScenarioViewTeacher
  Scenario: Verify 'Jam' field is displayed in Jadwal Mengajar guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Jadwal Mengajar button in guru session
    And Should show jam field in teacher page

  @ScenarioViewTeacher
  Scenario: Verify 'Hari & tanggal' field is displayed in Jadwal Mengajar guru session
    When Teacher click Cek Jadwal button on profile page
    Then Teacher click Jadwal Mengajar button in guru session
    And Should show Hari & tanggal field in teacher page