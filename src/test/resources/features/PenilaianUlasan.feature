@PenilaianUlasan @Test
Feature: Penilaian Ulasan

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "sucimurid@gmail.com" as email and input "sucimurid" as password
    And User clicked masuk button
    When User move to History Murid Page
    And Student click Riwayat submenu
    And Sub menu Riwayat is active
    When Student click link ulasan in row
    Then Show penilaian dan ulasan popup

  Scenario Outline: Verify teacher name is displayed
    Then Show "<nama_guru>" on penilaian dan ulasan popup
    Examples:
      | nama_guru               |
      | Suci Nascaisar Maharani |

  Scenario: Verify 'ulasan' field is displayed
    Then Show ulasan field

  Scenario: Verify 'penilaian' field is displayed
    Then Show penilaian field

  Scenario: Verify 'nilai' button is displayed
    Then Show nilai button

  Scenario: Verify 'ulasan' field is enabled
    Then Ulasan field is enabled

  Scenario Outline: Input special character in 'ulasan' field
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | #@#@   |

  Scenario Outline: Input number in 'ulasan' field
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | 1      |

  Scenario Outline: Input alphabet in 'ulasan' field
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | keren  |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'ulasan' field
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field show alert "Maximal char 300"
    Examples:
      | ulasan                                                                                                                                                                                                                                                                                                          |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsdadasdadasdasjdbasjkdhasjdkhasjkdgasjhfgkasjhfgahjsfgadhjsfgahjsfgashjfgasjhfgasjkfasgjhadfgasfsgkfgjhasgfasdfsdfsdfjdsgfdshjfgdshfgdshfgdshjfgaskyfgqewyurteqwiufgadsufyewuifhdsjkfhekfdfsdfdsfssdfsdfsdsazxasasds |

  Scenario: Verify 'penilaian' field is enabled
    When Student click penilaian field
    Then Penilaian field is enabled

  Scenario Outline: Input special character in 'penilaian' field
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is ""
    Examples:
      | penilaian |
      | #@#@      |

  Scenario Outline: Input number in 'penilaian' field
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is "<penilaian>"
    Examples:
      | penilaian |
      | 1         |

  Scenario Outline: Input alphabet in 'penilaian' field
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is ""
    Examples:
      | penilaian |
      | keren     |

  Scenario Outline: Input number with more than maximum allowed length on 'penilaian' field
    When Student input "<penilaian>" in penilaian field
    And Student click button nilai
    Then Penilaian field show alert
    Examples:
      | penilaian |
      | 12121     |

  Scenario Outline: Input alphabet with less than minimum allowed length on 'penilaian' field
    When Student input "<penilaian>" in penilaian field
    And Student click button nilai
    Then Penilaian field show alert
    Examples:
      | penilaian |
      | 0         |

#  Penilaian & Ulasan Functionality
  Scenario Outline: Rating & review with input number in 'ulasan' field and 'penilaian' field
    When Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    And Student click button nilai
    Then User will see "Succes" in beranda page
    Examples:
      | ulasan | penilaian |
      | 1      | 5         |

  Scenario Outline: Rating & review with input special character in 'ulasan' field and input number in 'penilaian' field
    When Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    And Student click button nilai
    Then Student will see alert "input tidak valid" in beranda page
    Examples:
      | ulasan | penilaian |
      | @#@$   | 5         |

  Scenario Outline: Rating & review with input alphabet in 'ulasan' field and input number in 'penilaian' field
    When Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    And Student click button nilai
    Then Student will see "berhasil menambahkan ulasan" in beranda page
    Examples:
      | ulasan | penilaian |
      | keren  | 5         |

  Scenario Outline: Rating & review with input alphabet in 'ulasan' field and input alphabet in 'penilaian' field
    When Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    Then Button nilai is disabled
    Examples:
      | ulasan | penilaian |
      | keren  | lima      |