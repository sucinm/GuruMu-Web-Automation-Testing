@Test
Feature: Cari guru

  Scenario: Verify 'mata pelajaran' field is displayed
    Given Student already login
    When Student click menu Beranda
    Then Should show home page
    And Should show mata pelajaran field

  Scenario: Verify 'lokasi' field is displayed
    Given Student already login
    When Student click menu Beranda
    Then Should show home page
    And Should show lokasi field

  Scenario: Verify 'cari' button is displayed
    Given Student already login
    When Student click menu Beranda
    Then Should show home page
    And Should show cari button

  Scenario: Verify teacher list is displayed
    Given Student already login
    When Student click menu Beranda
    Then Should show home page
    And Should show teacher list

  Scenario: Verify 'mata pelajaran' field is enabled
    Given Student already on home page
    When Student click mata pelajaran field
    Then Mata pelajaran field is enabled

  Scenario Outline: Input special character in 'mata pelajaran' field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | #@#@           |

  Scenario Outline: Input number in 'mata pelajaran' field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | 1              |

  Scenario Outline: Input alphabet in 'mata pelajaran' field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field value is "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | matematika     |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'mata pelajaran' field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    Then Mata pelajaran field show alert "Maximal char 250"
    Examples:
      | mata_pelajaran                                                                                 |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsd |

  Scenario: Verify 'lokasi' field is enabled
    Given Student already on home page
    When Student click lokasi field
    Then Lokasi field is enabled

  Scenario Outline: Input special character in 'lokasi' field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi |
      | #@#@   |

  Scenario Outline: Input number in 'lokasi' field	Given Student already on home page
    When Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi |
      | 1      |

  Scenario Outline: Input alphabet in 'lokasi' field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    Then Lokasi field value is "<lokasi>"
    Examples:
      | lokasi     |
      | matematika |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'lokasi' field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    Then Lokasi field show alert "Maximal char 250"
    Examples:
      | lokasi                                                                                         |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsd |

#    Cari Guru Functionality
  Scenario Outline: Student search for teachers by input valid mata pelajaran field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    And Student click button Search
    Then Should show teacher list
    And Verify teacher mata pelajaran "<mata_pelajaran>"
    Examples:
      | mata_pelajaran |
      | matematika     |

  Scenario Outline: Students search for teachers by input special char in mata pelajaran field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    And Student click button Search
    Then Shouldn't show teacher list
    And Show notification not found
    Examples:
      | mata_pelajaran |
      | $#@@*!         |
      | !#@#@#*)       |

  Scenario Outline: Students search for teachers by input number in mata pelajaran field
    Given Student already on home page
    When Student input "<mata_pelajaran>" as mata pelajaran
    And Student click button Search
    Then Should show teacher list
    Then Shouldn't show teacher list
    And Show notification not found
    Examples:
      | mata_pelajaran |
      | 1              |
      | 123            |

  Scenario Outline: Students search for teachers by input valid lokasi field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    And Student click button Search
    Then Should show teacher list
    And Verify teacher lokasi "<lokasi>"
    Examples:
      | lokasi      |
      | kab. Malang |

  Scenario Outline: Students search for teachers by input special char in lokasi field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    And Student click button Search
    Then Shouldn't show teacher list
    And Show notification not found
    Examples:
      | lokasi   |
      | $#@@*!   |
      | !#@#@#*) |

  Scenario Outline: Students search for teachers by number in lokasi field
    Given Student already on home page
    When Student input "<lokasi>" as lokasi
    And Student click button Search
    Then Shouldn't show teacher list
    And Show notification not found
    Examples:
      | lokasi |
      | 1      |
      | 123    |


  Scenario: Student search for teachers by input valid mata pelajaran and valid lokasi
    Given Student already on home page
    When Student input "matematika" as mata pelajaran
    And Student input "kab. Malang" as lokasi
    And Student click button Search
    Then Should show teacher list
    And Verify teacher mata pelajaran "matematika"
    And Verify teacher lokasi "kab. Malang"

  Scenario: Students search for teachers without search filter
    Given Student already on home page
    When Student click button Search
    Then Should show teacher list