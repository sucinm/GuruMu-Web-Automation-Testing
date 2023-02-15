@TestUpdateTeacher
Feature: Update Teacher

  Background:
    Given User open the website GuruMu
    When User click avatar navigation
    And User click menu Masuk
    And User input "zulfeekei@gmail.com" as email and input "be123" as password
    When User move to Profile Page
    And User move to edit profile

  Scenario: Verify 'Tarif / Jam' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then 'Tarif / Jam' field is enabled

  Scenario Outline: Input Field with Valid Tarif in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with valid tarif like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif  |
      | 500000 |

  Scenario Outline: Input Field with Character in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with character like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif  |
      | abcdef |

  Scenario Outline: Input Field with Character and Number in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with character and number like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif  |
      | abc456 |

  Scenario Outline: Input Field with Special Character in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with special character like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif  |
      | ^&*^%% |

  Scenario Outline: Input Field with Character and Special Character in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with character and special character like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif     |
      | abcd^&#$% |

  Scenario Outline: Input Field with Over Limit Tarif in 'Tarif / Jam' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Tarif / Jam' field
    Then Teacher input with over limit tarif like "<tarif>" in 'Tarif / Jam' field
    Examples:
      | tarif         |
      | 1000000000000 |

  Scenario: Verify 'Spesialis Mata Pelajaran' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Spesialis Mata Pelajaran' field
    Then 'Spesialis Mata Pelajaran' field is enabled
    And Show Dropdown list

  Scenario: Verify 'Spesialis Mata Pelajaran' option is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Spesialis Mata Pelajaran' field
    Then 'Spesialis Mata Pelajaran' field is enabled
    And Show Dropdown list
    Then Option from 'Spesialis Mata Pelajaran' Can be Clicked

  Scenario: Verify 'Jenjang Pendidikan' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Jenjang Pendidikan' field
    Then 'Jenjang Pendidikan' field is enabled
    And Show Dropdown list

  Scenario: Verify 'Jenjang Pendidikan' option is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Jenjang Pendidikan' field
    Then 'Jenjang Pendidikan' field is enabled
    And Show Dropdown list
    Then Option from 'Jenjang Pendidikan' Can be Clicked

  Scenario: Verify 'Unggah Ijazah' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Ijazah' field
    Then 'Unggah Ijazah' field is enabled

  Scenario Outline: Verify 'Unggah Ijazah' with 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Ijazah' field
    Then Teacher Upload "<foto>" with 400 x 400 pixels in 'Unggah Ijazah' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario Outline: Verify 'Unggah Ijazah' with under 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Ijazah' field
    Then Teacher Upload "<foto>" with under 400 x 400 pixels in 'Unggah Ijazah' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario Outline: Verify 'Unggah Ijazah' with over 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Ijazah' field
    Then Teacher Upload "<foto>" with over 400 x 400 pixels in 'Unggah Ijazah' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario: Verify 'Unggah Ijazah' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Ijazah' field
    Then 'Unggah Ijazah' field is enabled

  Scenario Outline: Verify 'Unggah Foto' with 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Foto' field
    Then Teacher Upload "<foto>" with 400 x 400 pixels in 'Unggah Foto' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario Outline: Verify 'Unggah Foto' with under 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Foto' field
    Then Teacher Upload "<foto>" with under 400 x 400 pixels in 'Unggah Foto' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario Outline: Verify 'Unggah Foto' with over 400 x 400 pixels
    Given Teacher already on Edit Profile page
    When Teacher click 'Unggah Foto' field
    Then Teacher Upload "<foto>" with over 400 x 400 pixels in 'Unggah Foto' field
    Examples:
      |       foto      |
      |     uyuy.png    |

  Scenario: Verify 'Date' field in Atur Waktu Mengajar is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Date' field
    Then 'Date' field is enabled

  Scenario: Input with Date in 'Date' field from Atur Waktu Mengajar
    Given Teacher already on Edit Profile page
    When Teacher Click 'Date' field
    Then 'Date' field can be Clicked
    And Show Date Picker
    Then Teacher Click Date in 'Date' Picker
    And Date Picker can be Clicked

  Scenario: Input with Date in 'Date' field from Atur Waktu Mengajar
    Given Teacher already on Edit Profile page
    When Teacher Click 'Date' field
    Then 'Date' field can be Clicked
    And Show Date Picker
    Then Teacher Click Back Date in 'Date' Picker
    And Date Picker cannot be Clicked

  Scenario: Input with Back Month in 'Date' field from Atur Waktu Mengajar
    Given Teacher already on Edit Profile page
    When Teacher Click 'Date' field
    Then 'Date' field can be Clicked
    And Show Date Picker
    Then Teacher Click Previous 'Month' in Date Picker
    And Teacher Click Date in 'Date' Picker

  Scenario: Input with Next Month in 'Date' field from Atur Waktu Mengajar
    Given Teacher already on Edit Profile page
    When Teacher Click 'Date' field
    Then 'Date' field can be Clicked
    And Show Date Picker
    Then Teacher Click Next 'Month' in Date Picker
    And Teacher Click Date in 'Date' Picker

  Scenario: Verify 'Time' field in Atur Waktu Mengajar is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Time' field
    Then 'Time' field is enabled

  Scenario: Verify 'Time' field in Atur Waktu Mengajar is enabled
    Given Teacher already on Edit Profile page
    When Teacher Click 'Time' field in 'Atur Waktu Mengajar'
    Then 'Time' field in 'Atur Waktu Mengajar' can be Clicked
    And Show Time Picker
    Then Teacher Click 'Time' in Time Picker
    And Time Picker can be Clicked

  Scenario: Verify 'Gelar' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Gelar' field
    Then 'Gelar' field is enabled

  Scenario Outline: Input Field with Character in 'Gelar' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Gelar' field
    Then Teacher input with Character like "<aboutme>" in 'Gelar' field
    Examples:
      | aboutme                         |
      | Nurul Khalifatu Sadiyah Amd Kom |

  Scenario Outline: Input Field with Character and Number in 'Gelar' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Gelar' field
    Then Teacher input with Character and Number like "<aboutme>" in 'Gelar' field
    Examples:
      | aboutme                              |
      | Nurul Khalifatu Sadiyah Amd Kom 2017 |

  Scenario Outline: Input Field with Special Character in 'Gelar' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Gelar' field
    Then Teacher input with Special Character like "<aboutme>" in 'Gelar' field
    Examples:
      | aboutme  |
      | $%^$%^%& |

  Scenario Outline: Input Field with Character and Special Character in 'Gelar' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Gelar' field
    Then Teacher input with Character and Special Character like "<aboutme>" in 'Gelar' field
    Examples:
      | aboutme                         |
      | Nurul Khalifatu Sadiyah Amd.Kom |

  Scenario: Verify 'Pengalaman' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Pengalaman' field
    Then 'Pengalaman' field is enabled

  Scenario Outline: Input Field with Character in 'Pengalaman' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Pengalaman' field
    Then Teacher input with Character like "<experience>" in 'Gelar' field
    Examples:
      | experience              |
      | Fullstack Web Developer |

  Scenario Outline: Input Field with Character and Number in 'Pengalaman' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Pengalaman' field
    Then Teacher input with Character and Number like "<experience>" in 'Gelar' field
    Examples:
      | experience                   |
      | Fullstack Web Developer 2022 |

  Scenario Outline: Input Field with Special Character in 'Pengalaman' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Pengalaman' field
    Then Teacher input with Special Character like "<experience>" in 'Gelar' field
    Examples:
      | experience |
      | $%^$%&&*&( |

  Scenario Outline: Input Field with Character and Special Character in 'Pengalaman' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Pengalaman' field
    Then Teacher input with Character and Special Character like "<experience>" in 'Gelar' field
    Examples:
      | experience                     |
      | Fullstack Web Developer : 2022 |

  Scenario: Verify 'Lokasi Asal' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Lokasi Asal' field
    Then 'Lokasi Asal' field is enabled
    And Show Dropdown list

  Scenario: Verify 'Lokasi Asal' option is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Lokasi Asal' field
    Then 'Lokasi Asal' field is enabled
    And Show Dropdown list
    Then Option from 'Lokasi Asal' Can be Clicked

  Scenario: Verify 'Offline' checkbox in Ketersediaan field is enabled
    Given Teacher already on Edit Profile page
    When Teacher Click 'Offline' Checkbox Ketersediaan field
    Then Offline Checkbox can be Clicked

  Scenario: Verify 'Online' checkbox in Ketersediaan field is enabled
    Given Teacher already on Edit Profile page
    When Teacher Click 'Online' Checkbox Ketersediaan field
    Then Offline Checkbox can be Clicked

  Scenario: Verify 'Handphone' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then 'Handphone' field is enabled

  Scenario Outline: Input Field with Valid Number in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with valid number like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | 089943577389 |

  Scenario Outline: Input Field with Not Valid Number in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with not valid number like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | 1234567891011|

  Scenario Outline: Input Field with Character in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with number like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | abcdefghijkl |

  Scenario Outline: Input Field with Chacter and Number in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with character and number like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | 089943abcdefg|

  Scenario Outline: Input Field with Special Character in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with special character like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | !@#$#%^%$^%^ |

  Scenario Outline: Input Field with Number and Special Character in 'Handphone' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Handphone' field
    Then Teacher input with special character like "<number>" in 'Handphone' field
    Examples:
      |    number    |
      | 089943$*%^*$ |

  Scenario: Verify 'Email' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then 'Email' field is enabled

  Scenario Outline: Input Field with Valid Email in 'Email' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then Teacher input with valid name like "<email>" in 'Email' field
    Examples:
      |       email       |
      | uyuyks@gmail.com  |

  Scenario Outline: Input Field with Not Valid Email in 'Email' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then Teacher input with valid name like "<email>" in 'Email' field
    Examples:
      |    email     |
      | uyuyks@gmail |

  Scenario Outline: Input Field with Chacter in 'Email' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then Teacher input with character and number like "<email>" in 'Email' field
    Examples:
      |   email   |
      | acbdefghij|

  Scenario Outline: Input Field with Number in 'Email' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then Teacher input with number like "<email>" in 'Email' field
    Examples:
      |     email     |
      | 263478910900  |

  Scenario Outline: Input Field with Special Character in 'Email' field
    Given Teacher already on Edit Profile page
    When Teacher click 'Email' field
    Then Teacher input with special character like "<email>" in 'Email' field
    Examples:
      |            email         |
      | #$^$%&^%*&^*^&*$#$#@%$%^ |

  Scenario: Verify 'LinkedIn' field is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'LinkedIn' field
    Then 'LinkedIn' field is enabled

  Scenario Outline: Input Field with Character in 'LinkedIn' field
    Given Teacher already on Edit Profile page
    When Teacher click 'LinkedIn' field
    Then Teacher input with character like "<linkedin>" in 'LinkedIn' field
    Examples:
      | linkedin |
      | uyuyks   |

  Scenario Outline: Input Field with Number in 'LinkedIn' field
    Given Teacher already on Edit Profile page
    When Teacher click 'LinkedIn' field
    Then Teacher input with number like "<linkedin>" in 'LinkedIn' field
    Examples:
      | linkedin  |
      | 123235346 |

  Scenario Outline: Input Field with Chacter and Number in 'LinkedIn' field
    Given Teacher already on Edit Profile page
    When Teacher click 'LinkedIn' field
    Then Teacher input with character and number like "<linkedin>" in 'LinkedIn' field
    Examples:
      | linkedin     |
      | uyuyks123456 |

  Scenario Outline: Input Field with Special Character in 'LinkedIn' field
    Given Teacher already on Edit Profile page
    When Teacher click 'LinkedIn' field
    Then Teacher input with special character like "<linkedin>" in 'LinkedIn' field
    Examples:
      | linkedin    |
      | $%^%&^%&*^* |

  Scenario: Verify 'Atur Tempat Mengajar' button is enabled
    Given Teacher already on Edit Profile page
    When Teacher click 'Atur Tempat Mengajar' button
    Then 'Atur Tempat Mengajar' field can be Clicked
    And Show OpenStreetMap

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Tarif / Jam' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Specialis Mata Pelajaran' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Jenjang Pendidikan' field
    Then Teacher click 'Perbarui' button

  Scenario: Submit 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Unggah Ijazah' field
    Then Teacher click 'Perbarui' button

  Scenario: Submit 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Unggah Foto' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Gelar' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Tentang Saya' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Lokasi Saya' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Offline' button in Ketersediaan field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Online' button in Ketersediaan field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Handphone' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'Email' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form but not on 'LinkedIn' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Tambah Jadwal Mengajar' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form
    Then Teacher click 'Tambah Jadwal Mengajar' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Date in 'Atur Waktu Mengajar' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Hour in 'Atur Waktu Mengajar' field
    Then Teacher click 'Perbarui' button

  Scenario: Teacher 'Perbarui' button with all data form has been filled
    Given Teacher already on Edit Profile page
    When Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Maps in 'Atur Tempat Mengajar' field
    Then Teacher click 'Perbarui' button