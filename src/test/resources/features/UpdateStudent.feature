@TestUpdateStudent @Test
Feature: Update Student

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "updatemurid@gmail.com" as email and input "updatemurid" as password
    And User clicked masuk button
    When User move to Profile Page
    And User click edit profile

  Scenario: Verify Nama Lengkap field is enabled
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Nama Lengkap field is enabled

  Scenario Outline: Input Field with Valid Name in Nama Lengkap field
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Student input with valid name like "<name>" in Nama Lengkap field
    Examples:
      | name              |
      | Update Murid Name |

  Scenario Outline: Input Field with Number in Nama Lengkap field
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Student input with number like "<name>" in Nama Lengkap field
    Examples:
      |            name          |
      | 081232736478263478910900 |

  Scenario Outline: Input Field with Chacter and Number in Nama Lengkap field
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Student input with character and number like "<name>" in Nama Lengkap field
    Examples:
      |            name          |
      | acbdefghij08123273647826 |

  Scenario Outline: Input Field with Special Character in Nama Lengkap field
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Student input with special character like "<name>" in Nama Lengkap field
    Examples:
      |            name          |
      | #$^$%&^%*&^*^&*$#$#@%$%^ |

  Scenario Outline: Input Field with Character and Special Character in Nama Lengkap field
    Given Student already on Edit Profile page
    When Student click Nama Lengkap field
    Then Student input with special character like "<name>" in Nama Lengkap field
    Examples:
      |            name          |
      | abcdefghijk*^&*$#$#@%$%^ |

  Scenario: Verify Handphone field is enabled
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Handphone field is enabled

  Scenario Outline: Input Field with Valid Number in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with valid number like "<number>" in Handphone field
    Examples:
      |    number    |
      | 089943577389 |

  Scenario Outline: Input Field with Not Valid Number in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with not valid number like "<number>" in Handphone field
    Examples:
      |    number    |
      | 1234567891011|

  Scenario Outline: Input Field with Character in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with number like "<number>" in Handphone field
    Examples:
      |    number    |
      | abcdefghijkl |

  Scenario Outline: Input Field with Chacter and Number in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with character and number like "<number>" in Handphone field
    Examples:
      |    number    |
      | 089943abcdefg|

  Scenario Outline: Input Field with Special Character in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with special character like "<number>" in Handphone field
    Examples:
      |    number    |
      | !@#$#%^%$^%^ |

  Scenario Outline: Input Field with Number and Special Character in Handphone field
    Given Student already on Edit Profile page
    When Student click Handphone field
    Then Student input with special character like "<number>" in Handphone field
    Examples:
      |    number    |
      | 089943$*%^*$ |

  Scenario: Verify Email field is enabled
    Given Student already on Edit Profile page
    When Student click Email field
    Then Email field is enabled

  Scenario Outline: Input Field with Valid Email in Email field
    Given Student already on Edit Profile page
    When Student click Email field
    Then Student input with valid name like "<email>" in Email field
    Examples:
      | email                 |
      | updatemurid@gmail.com |

  Scenario Outline: Input Field with Not Valid Email in Email field
    Given Student already on Edit Profile page
    When Student click Email field
    Then Student input with valid name like "<email>" in Email field
    Examples:
      | email   |
      | updatemurid@gmail |

  Scenario Outline: Input Field with Chacter in Email field
    Given Student already on Edit Profile page
    When Student click Email field
    Then Student input with character and number like "<email>" in Email field
    Examples:
      |   email   |
      | acbdefghij|

  Scenario Outline: Input Field with Number in Email field
    Given Student already on Edit Profile page
    When Student click Email field
    Then Student input with number like "<email>" in Email field
    Examples:
      |     email     |
      | 263478910900  |

  Scenario Outline: Input Field with Special Character in Email field
    Given Student already on Edit Profile page
    When Student click Email field
    Then Student input with special character like "<email>" in Email field
    Examples:
      |            email         |
      | #$^$%&^%*&^*^&*$#$#@%$%^ |

  Scenario: Verify Alamat field is enabled
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Alamat field is enabled

  Scenario Outline: Input Field with Character in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with character like "<alamat>" in Alamat field
    Examples:
      |    alamat      |
      | Jakarta Barat  |

  Scenario Outline: Input Field with Number in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with number like "<alamat>" in Alamat field
    Examples:
      |    alamat      |
      | 08263478910900 |

  Scenario Outline: Input Field with Chacter and Number in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with character and number like "<alamat>" in Alamat field
    Examples:
      |      alamat         |
      | Jakarta Barat no 12 |

  Scenario Outline: Input Field with Not Valid Special Character in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with not valid special character like "<alamat>" in Alamat field
    Examples:
      |       alamat         |
      | Jakarta Barat no.12% |

  Scenario Outline: Input Field with Special Character in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with special character like "<alamat>" in Alamat field
    Examples:
      |          alamat          |
      | #$^$%&^%*&^*^&*$#$#@%$%^ |

  Scenario Outline: Input Field with Valid Alamat in Alamat field
    Given Student already on Edit Profile page
    When Student click Alamat field
    Then Student input with Valid Alamat like "<alamat>" in Alamat field
    Examples:
      |       alamat         |
      | Jakarta Barat no.12  |

  Scenario: Verify Unggah Foto field is enabled
    Given Student already on Edit Profile page
    When Student click Unggah Foto field
    Then Unggah Foto field is enabled

  Scenario Outline: Verify Unggah Foto with 400 x 400 pixels
    Given Student already on Edit Profile page
    When Student click Unggah Foto field
    Then Student Upload "<foto>" with 400 x 400 pixels in Unggah Foto field
    Examples:
      | foto       |
      | update.png |

  Scenario Outline: Verify Unggah Foto with under 400 x 400 pixels
    Given Student already on Edit Profile page
    When Student click Unggah Foto field
    Then Student Upload "<foto>" with under 400 x 400 pixels in Unggah Foto field
    Examples:
      | foto       |
      | update.png |

  Scenario Outline: Verify Unggah Foto with over 400 x 400 pixels
    Given Student already on Edit Profile page
    When Student click Unggah Foto field
    Then Student Upload "<foto>" with over 400 x 400 pixels in Unggah Foto field
    Examples:
      | foto       |
      | update.png |

  Scenario: Verify X button is enabled
    Given Student already on Edit Profile page
    When Student click X button
    Then button is enabled

  Scenario: Submit Perbarui button with all data form has been filled
    Given Student already on Edit Profile page
    When Student fill all data form
    Then Student click Perbarui button

  Scenario: Submit Perbarui button with all data but not Nama Lengkap form has been filled
    Given Student already on Edit Profile page
    When Student fill all data form but not on Nama Lengkap field
    Then Student click Perbarui button

  Scenario: Submit Perbarui button with all data form but not on Handphone has been filled
    Given Student already on Edit Profile page
    When Student fill all data form but not on Handphone field
    Then Student click Perbarui button

  Scenario: Submit Perbarui button with all data form but not on Email has been filled
    Given Student already on Edit Profile page
    When Student fill all data form but not on Email field
    Then Student click Perbarui button

  Scenario: Submit Perbarui button with all data form but not on Alamat has been filled
    Given Student already on Edit Profile page
    When Student fill all data form but not on Alamat field
    Then Student click Perbarui button

  Scenario: Submit Perbarui button with all data form but not on Unggah Foto has been filled
    Given Student already on Edit Profile page
    When Student fill all data form but not on Unggah Foto field
    Then Student click Perbarui button



