@Register @Test
Feature: Lengkapi Data Guru
  As a teacher i want to complete my profile

  @LengkapiDataGuru
  Scenario: Input valid data in Register teacher next step
    Given User already in GuruMu Selesaikan profil anda pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "sukses update data guru"

  @LengkapiDataGuru
  Scenario: Empty the alamat in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input valid data but empty alamat field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario Outline: Input invalid phone number in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
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

  @LengkapiDataGuru
  Scenario: Empty the phone number in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input valid data but empty phone number field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario: Empty the pemilihan jenjang pengajaran in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input all valid data in selesaikan profil anda form
    And User not select any choice in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario: Empty the Deskripsi diri in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input valid data but empty Deskripsi diri field
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario: Empty the LinkedIn Profile in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input valid data but empty Linkedin profile
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo and ijazah with valid requirement
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario: Upload photo with size more than maximum requirement in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload ijazah with valid requirement except photo
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"

  @LengkapiDataGuru
  Scenario: Upload ijazah with size more than maximum requirement in Register teacher next step
    Given User already in GuruMu Selesaikan profil pop-up form
    When User input all valid data in selesaikan profil anda form
    And User select "Sekolah Menengah Atas" in Pemilihan Jenjang Pengajaran field
    And User upload photo with valid requirement except ijazah
    Then User click Update data Button
    And User will see alert message "updateData masa kosong sih"