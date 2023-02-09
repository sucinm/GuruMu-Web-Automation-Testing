@CariGuru
Feature: Cari guru

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "sucimurid@gmail.com" as email and input "sucimurid" as password

  @Scenario1
  Scenario: Verify 'mata pelajaran' field is displayed
    When Student click menu Beranda
    Then Should show home page
    And Should show mata pelajaran field

  Scenario: Verify 'lokasi' field is displayed
    When Student click menu Beranda
    Then Should show home page
    And Should show lokasi field

  Scenario: Verify 'cari' button is displayed
    When Student click menu Beranda
    Then Should show home page
    And Should show cari button

  Scenario: Verify teacher list is displayed
    When Student click menu Beranda
    Then Should show home page
    And Should show teacher list

  Scenario: Verify 'mata pelajaran' field is enabled
    When Student click menu Beranda
    And Student click mata pelajaran field
    Then Mata pelajaran field is enabled

  Scenario Outline: Input special character in 'mata pelajaran' field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | #@#@           |

  Scenario Outline: Input number in 'mata pelajaran' field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | 1              |

  Scenario Outline: Input alphabet in 'mata pelajaran' field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | matematika     |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'mata pelajaran' field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field show alert "Maximal char 250"
    Examples:
      | mata_pelajaran                                                                                 |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsd |

  Scenario: Verify 'lokasi' field is enabled
    When Student click menu Beranda
    And Student click lokasi field
    Then Lokasi field is enabled

  Scenario Outline: Input special character in 'lokasi' field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi |
      | #@#@   |

  Scenario Outline: Input number in 'lokasi' field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi |
      | 1      |

  Scenario Outline: Input alphabet in 'lokasi' field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi     |
      | matematika |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'lokasi' field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Lokasi field show alert "Maximal char 250"
    Examples:
      | lokasi                                                                                         |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsd |

#    Cari Guru Functionality
  Scenario: Student search for teachers by input valid mata pelajaran field
    When Student click menu Beranda
    And Student input "matematika" as mata pelajaran
    Then Should show teacher list

  Scenario Outline: Students search for teachers by input special char in mata pelajaran field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Shouldn't show teacher list
    Examples:
      | mata_pelajaran |
      | $#@@*!         |
      | !#@#@#*)       |

  Scenario Outline: Students search for teachers by input number in mata pelajaran field
    When Student click menu Beranda
    And Student input "<mata_pelajaran>" as mata pelajaran
    Then Shouldn't show teacher list
    Examples:
      | mata_pelajaran |
      | 1              |
      | 123            |

  Scenario Outline: Students search for teachers by input valid lokasi field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Should show teacher list
    And Verify teacher lokasi "<lokasi>"
    Examples:
      | lokasi   |
      | surabaya |

  Scenario Outline: Students search for teachers by input special char in lokasi field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Shouldn't show teacher list
    Examples:
      | lokasi   |
      | $#@@*!   |
      | !#@#@#*) |

  Scenario Outline: Students search for teachers by number in lokasi field
    When Student click menu Beranda
    And Student input "<lokasi>" as lokasi
    Then Shouldn't show teacher list
    Examples:
      | lokasi |
      | 1      |
      | 123    |


  Scenario: Student search for teachers by input valid mata pelajaran and valid lokasi
    When Student click menu Beranda
    And Student input "matematika" as mata pelajaran
    And Student input "surabaya" as lokasi
    Then Should show teacher list
    And Verify teacher lokasi "surabaya"

  Scenario: Students search for teachers without search filter
    When Student click menu Beranda
    Then Should show teacher list