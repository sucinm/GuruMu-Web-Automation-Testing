@Test
Feature: Penilaian Ulasan

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "johndoe@gmail.com" as email and input "pass12345" as password
    When User move to Profile Page

  Scenario Outline: Verify teacher name is displayed
    Given Student already on profile page
    And Sub menu Riwayat is active
    When Student click link ulasan in row "<nama_guru>" as teacher
    Then Show penilaian dan ulasan popup
    And Show "<nama_guru>" on penilaian dan ulasan popup
    Examples:
      | nama_guru |
      | Adi       |

  Scenario Outline: Verify 'ulasan' field is displayed
    Given Student already on profile page
    And Sub menu Riwayat is active
    When Student click link ulasan in row "<nama_guru>" as teacher
    Then Show penilaian dan ulasan popup
    And Show ulasan field
    Examples:
      | nama_guru |
      | Adi       |

  Scenario Outline: Verify 'penilaian' field is displayed
    Given Student already on profile page
    And Sub menu Riwayat is active
    When Student click link ulasan in row "<nama_guru>" as teacher
    Then Show penilaian dan ulasan popup
    And Show penilaian field
    Examples:
      | nama_guru |
      | Adi       |

  Scenario Outline: Verify 'nilai' button is displayed
    Given Student already on profile page
    And Sub menu Riwayat is active
    When Student click link ulasan in row "<nama_guru>" as teacher
    Then Show penilaian dan ulasan popup
    And Show nilai button
    Examples:
      | nama_guru |
      | Adi       |

  Scenario: Verify 'ulasan' field is enabled
    Given Student already show penilaian dan ulasan popup
    When Student click ulasan field
    Then Ulasan field is enabled

  Scenario Outline: Input special character in 'ulasan' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | #@#@   |

  Scenario Outline: Input number in 'ulasan' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | 1      |

  Scenario Outline: Input alphabet in 'ulasan' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field value is "<ulasan>"
    Examples:
      | ulasan |
      | keren  |

  Scenario Outline: Input alphabet with more than maximum allowed length on 'ulasan' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<ulasan>" in ulasan field
    Then Ulasan field show alert "Maximal char 250"
    Examples:
      | ulasan                                                                                                                                                                                                                                                                                |
      | Abcsdsdadsdadsadsdsadasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdssdsdsdsdsdadasdadasdasjdbasjkdhasjdkhasjkdgasjhfgkasjhfgahjsfgadhjsfgahjsfgashjfgasjhfgasjkfasgjhadfgasfsgkfgjhasgfasdfsdfsdfjdsgfdshjfgdshfgdshfgdshjfgaskyfgqewyurteqwiufgadsufyewuifhdsjkfhekf |

  Scenario: Verify 'penilaian' field is enabled
    Given Student already show penilaian dan ulasan popup
    When Student click penilaian field
    Then Penilaian field is enabled

  Scenario Outline: Input special character in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is "0"
    Examples:
      | penilaian |
      | #@#@      |

  Scenario Outline: Input number in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is "<penilaian>"
    Examples:
      | penilaian |
      | 1         |

  Scenario Outline: Input alphabet in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field value is "0"
    Examples:
      | penilaian |
      | keren     |

  Scenario Outline: Input number with more than maximum allowed length on 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field show alert "Maximal number is 5"
    Examples:
      | penilaian |
      | 12121     |

  Scenario Outline: Input alphabet with less than minimum allowed length on 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    When Student input "<penilaian>" in penilaian field
    Then Penilaian field show alert "Minimal number is 1"
    Examples:
      | penilaian |
      | 0         |

#  Penilaian & Ulasan Functionality
  Scenario Outline: Search with input number in 'ulasan' field and 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    And Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    When Student click button nilai
    Then Show success message "Berhasil"
    Examples:
      | ulasan | penilaian |
      | 1      | 1         |

  Scenario Outline: Search with input special character in 'ulasan' field and input number in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    And Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    When Student click button nilai
    Then Show success message "Berhasil"
    Examples:
      | ulasan | penilaian |
      | @#@$   | 1         |

  Scenario Outline: Search with input alphabet in 'ulasan' field and input number in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    And Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    When Student click button nilai
    Then Show success message "Berhasil"
    Examples:
      | ulasan | penilaian |
      | keren  | 1         |

  Scenario Outline: Search with input alphabet in 'ulasan' field and input alphabet in 'penilaian' field
    Given Student already show penilaian dan ulasan popup
    And Student input "<ulasan>" as ulasan
    And Student input "<penilaian>" as penilaian
    When Student click button nilai
    Then Show success message "Berhasil"
    Examples:
      | ulasan | penilaian |
      | keren  | lima      |