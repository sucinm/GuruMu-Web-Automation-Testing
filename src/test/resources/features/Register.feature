@Register
Feature: Register
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
    And User will see alert message "validation error"
    Examples:
      | email           |
      | agusgmail@.com  |
      | agus@gmailcom   |
      | agus@opiqew.com |

  @RegisterStudent
  Scenario Outline: Register Student with invalid password format
    Given User already in GuruMu register pop-up form
    When User input valid data except "<password>" in Password field for student
    And User select "Siswa" in Peran field
    Then User cant click Daftar Button
    Examples:
      | password    |
      | agusganteng |
      | agus123     |
      | 1231313231  |
      | ^&*&&^*@!#  |

  @Register
  Scenario: Register Student without name
    Given User already in GuruMu register pop-up form
    When User input valid data for student
    And User empty the Nama Lengkap field
    And User select "Siswa" in Peran field
    Then User cant click Daftar Button

  @RegisterStudent
  Scenario: Register Student with empty data
    Given User already in GuruMu register pop-up form
    When User empty all data field
    And User select "Siswa" in Peran field
    Then User cant click Daftar Button

  @RegisterTeacher
  Scenario: Register Student with valid data
    Given User already in GuruMu register pop-up form
    When User input all valid data for teacher
    And User select "Guru" in Peran field
    Then User click Daftar Button
    And User will redirect to Login Page

  @RegisterTeacher
  Scenario Outline: Register Student with invalid email format
    Given User already in GuruMu register pop-up form
    When User input valid data except "<email>" in Email field for teacher
    And User select "Guru" in Peran field
    Then User click Daftar Button
    And User will see alert message "validation error"
    Examples:
      | email           |
      | agusgmail@.com  |
      | agus@gmailcom   |
      | agus@opiqew.com |

  @RegisterTeacher
  Scenario Outline: Register Student with invalid password format
    Given User already in GuruMu register pop-up form
    When User input valid data except "<password>" in Password field for teacher
    And User select "Guru" in Peran field
    Then User cant click Daftar Button
    Examples:
      | password    |
      | agusganteng |
      | agus123     |
      | 1231313231  |
      | ^&*&&^*@!#  |

  @RegisterTeacher
  Scenario: Register Student without name
    Given User already in GuruMu register pop-up form
    When User input valid data for teacher
    And User empty the Nama Lengkap field
    And User select "Guru" in Peran field
    Then User cant click Daftar Button

  @RegisterStudent
  Scenario: Register Student with empty data
    Given User already in GuruMu register pop-up form
    When User empty all data field
    And User select "Guru" in Peran field
    Then User cant click Daftar Button


  Scenario: Input valid data in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "sukses update data guru"

  @testregister
  Scenario: Empty the alamat in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input valid data but empty alamat field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario Outline: Input invalid phone number in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input valid data but invalid "<phone number>" in Handphone field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"
    Examples:
      | phone number         |
      | 08iwq9231313         |
      | 829(@*#(8389         |
      | 08127382912837823193 |
      | 2                    |

  Scenario: Empty the phone number in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input valid data but empty phone number field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario: Empty the pemilihan jenjang pengajaran in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario: Empty the Deskripsi diri in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input valid data but empty Deskripsi diri field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario: Empty the LinkedIn Profile in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input valid data but empty Linkedin profile
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario: Upload photo with size more than maximum requirement in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload ijazah with valid requirement except photo
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  Scenario: Upload ijazah with size more than maximum requirement in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo with valid requirement except ijazah
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"