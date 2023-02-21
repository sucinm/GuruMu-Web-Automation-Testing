package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.UpdateTeacherPage;
import org.openqa.selenium.WebDriver;

public class UpdateTeacherSteps {

    private WebDriver webDriver;
    UpdateTeacherPage updateTeacherPage;

    public UpdateTeacherSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        updateTeacherPage = new UpdateTeacherPage(webDriver);
    }

    @Given("Teacher already on Edit Profile page")
    public void teacherAlreadyOnEditProfilePage() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isHomeDisplayed();
    }

    @When("Teacher click 'Tarif / Jam' field")
    public void teacherClickTarifJamField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
    }

    @Then("'Tarif / Jam' field is enabled")
    public void tarifJamFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputTarifEnabled();
    }

    @Then("Teacher input with valid tarif like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithValidTarifLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterAndNumberLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithSpecialCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character and special character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterAndSpecialCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with over limit tarif like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithOverLimitTarifLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @When("Teacher click 'Spesialis Mata Pelajaran' field")
    public void teacherClickSpesialisMataPelajaranField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
    }

    @Then("'Spesialis Mata Pelajaran' field is enabled")
    public void spesialisMataPelajaranFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isSpesialisMapelEnabled();
    }

    @And("Show Dropdown list")
    public void showDropdownList() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
    }

    @Then("Option from 'Spesialis Mata Pelajaran' Can be Clicked")
    public void optionFromSpesialisMataPelajaranCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.selectDropdown("Matematika");
    }

    @When("Teacher click 'Jenjang Pendidikan' field")
    public void teacherClickJenjangPendidikanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickJenjangPendidikan();
    }

    @Then("'Jenjang Pendidikan' field is enabled")
    public void jenjangPendidikanFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isJenjangPendidikanEnabled();
    }

    @Then("Option from 'Jenjang Pendidikan' Can be Clicked")
    public void optionFromJenjangPendidikanCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
    }

    @When("Teacher click 'Unggah Foto' field")
    public void teacherClickUnggahFotoField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputPhoto();
    }

    @Then("Teacher Upload \"([^\"]*)\" with (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("Teacher Upload \"([^\"]*)\" with under (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithUnderXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("Teacher Upload \"([^\"]*)\" with over (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithOverXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("'Date' field is enabled")
    public boolean dateFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        return updateTeacherPage.isPickerCalendarEnabled();

    }

    @Then("'Date' field can be Clicked")
    public void dateFieldCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }

    @And("Show Date Picker")
    public void showDatePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerCalendar();
    }

    @Then("Teacher Click Date in 'Date' Picker")
    public void teacherClickDateInDatePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setPickerCalendar("20/02/2023");

    }

    @And("Date Picker can be Clicked")
    public void datePickerCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }


    @Then("Teacher Click Back Date in 'Date' Picker")
    public boolean teacherClickBackDateInDatePicker() {
        if (dateFieldIsEnabled()) {
            UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
            updateTeacherPage.clickPickerCalendar();
            updateTeacherPage.setPickerCalendar("01/01/2023");
            System.out.println("Date Picker has been clicked and set to 01/01/2023");
        } else {
            System.out.println("Date Picker is not enabled");
        }
        return false;
    }


    @And("Date Picker cannot be Clicked")
    public void datePickerCannotBeClicked() {
        if (!dateFieldIsEnabled()) {
            System.out.println("Date Picker is not enabled");
        } else {
            System.out.println("Date Picker is enabled, it should not be clicked");
        }
    }

    @Then("Teacher Click Previous 'Month' in Date Picker")
    public boolean teacherClickPreviousMonthInDatePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.clickPreviousMonth();

        if (dateFieldIsEnabled()) {
            updateTeacherPage.clickPickerCalendar();
            updateTeacherPage.setPickerCalendar("01/01/2023");
            System.out.println("Date Picker has been clicked and set to 01/01/2023");
        } else {
            System.out.println("Date Picker is not enabled");
        }
        return false;

    }



    @Then("Teacher Click Next 'Month' in Date Picker")
    public boolean teacherClickNextMonthInDatePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.clickPreviousMonth();

        if (dateFieldIsEnabled()) {
            updateTeacherPage.clickPickerCalendar();
            updateTeacherPage.setPickerCalendar("01/03/2023");
            System.out.println("Date Picker has been clicked and set to 01/03/2023");
        } else {
            System.out.println("Date Picker is not enabled");
        }
        return false;
    }


    @When("Teacher click 'Time' field")
    public void teacherClickTimeField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @Then("'Time' field is enabled")
    public void timeFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerJamEnabled();
    }

    @When("Teacher Click 'Time' field in 'Atur Waktu Mengajar'")
    public void teacherClickTimeFieldInAturWaktuMengajar() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @Then("'Time' field in 'Atur Waktu Mengajar' can be Clicked")
    public void timeFieldInAturWaktuMengajarCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerJamEnabled();
    }

    @And("Show Time Picker")
    public void showTimePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
    }

    @Then("Teacher Click 'Time' in Time Picker")
    public void teacherClickTimeInTimePicker() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @And("Time Picker can be Clicked")
    public void timePickerCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }

    @When("Teacher click 'Gelar' field")
    public void teacherClickGelarField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputGelarEnabled();
    }

    @Then("'Gelar' field is enabled")
    public void gelarFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickGelar();
    }

    @Then("Teacher input with Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Character and Number like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterAndNumberLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Special Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithSpecialCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Character and Special Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterAndSpecialCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @When("Teacher click 'Pengalaman' field")
    public void teacherClickPengalamanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputPengalaman();
    }

    @Then("'Pengalaman' field is enabled")
    public void pengalamanFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputPengalamanEnabled();
    }

    @When("Teacher click 'Lokasi Asal' field")
    public void teacherClickLokasiAsalField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickLokasiAsal();
    }

    @Then("'Lokasi Asal' field is enabled")
    public void lokasiAsalFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isSelectLokasiAsalEnabled();
    }

    @Then("Option from 'Lokasi Asal' Can be Clicked")
    public void optionFromLokasiAsalCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isSelectLokasiAsalEnabled();
    }

    @When("Teacher Click 'Offline' Checkbox Ketersediaan field")
    public void teacherClickOfflineCheckboxKetersediaanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputCheckboxOffline();
    }

    @Then("Offline Checkbox can be Clicked")
    public void offlineCheckboxCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputCheckboxOfflineEnabled();
    }

    @When("Teacher Click 'Online' Checkbox Ketersediaan field")
    public void teacherClickOnlineCheckboxKetersediaanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputCheckboxOnline();
    }

    @When("Teacher click 'Handphone' field")
    public void teacherClickHandphoneField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputHandphone();
    }

    @Then("Teacher input with valid number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithValidNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with not valid number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithNotValidNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithCharacterAndNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithSpecialCharacterLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @When("Teacher click 'Email' field")
    public void teacherClickEmailField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputEmail();
    }

    @Then("Teacher input with valid name like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithValidNameLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithCharacterAndNumberLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithNumberLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithSpecialCharacterLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @When("Teacher click 'LinkedIn' field")
    public void teacherClickLinkedInField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickInputLinkedin();
    }

    @Then("'LinkedIn' field is enabled")
    public void linkedinFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputLinkedinEnabled();
    }

    @Then("Teacher input with character like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithCharacterLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithNumberLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithCharacterAndNumberLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithSpecialCharacterLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @When("Teacher click 'Atur Tempat Mengajar' button")
    public void teacherClickAturTempatMengajarButton() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickCheckboxMaps();
    }

    @Then("'Atur Tempat Mengajar' field can be Clicked")
    public void aturTempatMengajarFieldCanBeClicked() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isCheckboxMapsEnabled();
    }

    @And("Show OpenStreetMap")
    public void showOpenStreetMap() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.selectCheckboxMaps("Jakarta");
    }

    @When("Teacher fill all data form")
    public void teacherFillAllDataForm() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }



    @When("Teacher fill all data form but not on 'Tarif / Jam' field")
    public void teacherFillAllDataFormButNotOnTarifJamField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Specialis Mata Pelajaran' field")
    public void teacherFillAllDataFormButNotOnSpecialisMataPelajaranField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Jenjang Pendidikan' field")
    public void teacherFillAllDataFormButNotOnJenjangPendidikanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Unggah Ijazah' field")
    public void teacherFillAllDataFormButNotOnUnggahIjazahField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Unggah Foto' field")
    public void teacherFillAllDataFormButNotOnUnggahFotoField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Gelar' field")
    public void teacherFillAllDataFormButNotOnGelarField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Tentang Saya' field")
    public void teacherFillAllDataFormButNotOnTentangSayaField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Lokasi Saya' field")
    public void teacherFillAllDataFormButNotOnLokasiSayaField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Offline' button in Ketersediaan field")
    public void teacherFillAllDataFormButNotOnOfflineButtonInKetersediaanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Online' button in Ketersediaan field")
    public void teacherFillAllDataFormButNotOnOnlineButtonInKetersediaanField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Handphone' field")
    public void teacherFillAllDataFormButNotOnHandphoneField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'Email' field")
    public void teacherFillAllDataFormButNotOnEmailField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form but not on 'LinkedIn' field")
    public void teacherFillAllDataFormButNotOnLinkedInField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
    }

    @Then("Teacher click 'Tambah Jadwal Mengajar' button")
    public void teacherClickTambahJadwalMengajarButton() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
    }

    @Then("Teacher click 'Perbarui' button")
    public void teacherClickPerbaruiButton() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickBtnUpdateTeacher();
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Date in 'Atur Waktu Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnDateInAturWaktuMengajarField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Hour in 'Atur Waktu Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnHourInAturWaktuMengajarField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Maps in 'Atur Tempat Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnMapsInAturTempatMengajarField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("update.png");
        updateTeacherPage.isPickerCalendarEnabled();
        updateTeacherPage.clickPickerCalendar();
        updateTeacherPage.setPickerCalendar("15/02/2023");
        updateTeacherPage.isPickerJamEnabled();
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickGelar();
        updateTeacherPage.setInputGelar("Diploma");
        updateTeacherPage.setInputTentangSaya("Tentang");
        updateTeacherPage.clickLokasiAsal();
        updateTeacherPage.clickInputPengalaman();
        updateTeacherPage.setInputPengalaman("2 Tahun");
        updateTeacherPage.clickInputCheckboxOffline();
        updateTeacherPage.clickInputCheckboxOnline();
        updateTeacherPage.clickInputHandphone();
        updateTeacherPage.setInputHandphone("081293507979");
        updateTeacherPage.clickInputEmail();
        updateTeacherPage.setInputEmail("updateguru@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("updateguru");
    }

    @When("Teacher click 'Unggah Ijazah' field")
    public void teacherClickUnggahIjazahField() {
        updateTeacherPage.clickIjazah();
    }

    @Then("Teacher Upload \"([^\"]*)\" with (\\d+) x (\\d+) pixels in 'Unggah Ijazah' field")
    public void teacherUploadWithXPixelsInUnggahIjazahField(String input, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage.setInputIjazah(input);
    }

    @Then("'Unggah Ijazah' field is enabled")
    public void unggahIjazahFieldIsEnabled() {
        updateTeacherPage.isInputIjazahEnabled();
    }

    @Then("Teacher Upload \"([^\"]*)\" with under (\\d+) x (\\d+) pixels in 'Unggah Ijazah' field")
    public void teacherUploadWithUnderXPixelsInUnggahIjazahField(String input, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage.setInputIjazah(input);
    }

    @Then("Teacher Upload \"([^\"]*)\" with over (\\d+) x (\\d+) pixels in 'Unggah Ijazah' field")
    public void teacherUploadWithOverXPixelsInUnggahIjazahField(String input, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage.setInputIjazah(input);
    }


    @When("Teacher Click 'Date' field")
    public void teacherClickDateField() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.clickPickerCalendar();
    }

    @And("User move to edit profile")
    public void userMoveToEditProfile() throws InterruptedException {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.toEditProfile();
        Thread.sleep(3000);
    }

    @Then("'Handphone' field is enabled")
    public void handphoneFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputHandphoneEnabled();
    }

    @Then("'Email' field is enabled")
    public void emailFieldIsEnabled() {
        UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage(webDriver);
        updateTeacherPage.isInputEmailEnabled();
    }
}




