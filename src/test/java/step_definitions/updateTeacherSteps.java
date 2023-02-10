package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ReservasiSubPage;
import org.example.pageObject.updateTeacherPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class updateTeacherSteps {

    private WebDriver webDriver;
    updateTeacherPage updateTeacherPage;

    public updateTeacherSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        updateTeacherPage = new updateTeacherPage(webDriver);
    }

    @Given("Teacher already on Edit Profile page")
    public void teacherAlreadyOnEditProfilePage() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isHomeDisplayed();
    }

    @When("Teacher click 'Tarif / Jam' field")
    public void teacherClickTarifJamField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
    }

    @Then("'Tarif / Jam' field is enabled")
    public void tarifJamFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isInputTarifEnabled();
    }

    @Then("Teacher input with valid tarif like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithValidTarifLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterAndNumberLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithSpecialCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with character and special character like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithCharacterAndSpecialCharacterLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @Then("Teacher input with over limit tarif like \"([^\"]*)\" in 'Tarif / Jam' field")
    public void teacherInputWithOverLimitTarifLikeInTarifJamField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputTarif(input);
    }

    @When("Teacher click 'Spesialis Mata Pelajaran' field")
    public void teacherClickSpesialisMataPelajaranField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
    }

    @Then("'Spesialis Mata Pelajaran' field is enabled")
    public void spesialisMataPelajaranFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isSpesialisMapelEnabled();
    }

    @And("Show Dropdown list")
    public void showDropdownList() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
    }

    @Then("Option from 'Spesialis Mata Pelajaran' Can be Clicked")
    public void optionFromSpesialisMataPelajaranCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.selectDropdown("Matematika");
    }

    @When("Teacher click 'Jenjang Pendidikan' field")
    public void teacherClickJenjangPendidikanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickJenjangPendidikan();
    }

    @Then("'Jenjang Pendidikan' field is enabled")
    public void jenjangPendidikanFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isJenjangPendidikanEnabled();
    }

    @Then("Option from 'Jenjang Pendidikan' Can be Clicked")
    public void optionFromJenjangPendidikanCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
    }

    @When("Teacher click 'Unggah Foto' field")
    public void teacherClickUnggahFotoField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputPhoto();
    }

    @Then("Teacher Upload \"([^\"]*)\" with (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("Teacher Upload \"([^\"]*)\" with under (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithUnderXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("Teacher Upload \"([^\"]*)\" with over (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void teacherUploadWithOverXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputPhoto(photo);
    }

    @Then("'Date' field is enabled")
    public boolean dateFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        return updateTeacherPage.isPickerCalendarEnabled();

    }

    @Then("'Date' field can be Clicked")
    public void dateFieldCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }

    @And("Show Date Picker")
    public void showDatePicker() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerCalendar();
    }

    @Then("Teacher Click Date in 'Date' Picker")
    public void teacherClickDateInDatePicker() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setPickerCalendar("20/02/2023");

    }

    @And("Date Picker can be Clicked")
    public void datePickerCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }


    @Then("Teacher Click Back Date in 'Date' Picker")
    public boolean teacherClickBackDateInDatePicker() {
        if (dateFieldIsEnabled()) {
            updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
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
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
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
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
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
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @Then("'Time' field is enabled")
    public void timeFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isPickerJamEnabled();
    }

    @When("Teacher Click 'Time' field in 'Atur Waktu Mengajar'")
    public void teacherClickTimeFieldInAturWaktuMengajar() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @Then("'Time' field in 'Atur Waktu Mengajar' can be Clicked")
    public void timeFieldInAturWaktuMengajarCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isPickerJamEnabled();
    }

    @And("Show Time Picker")
    public void showTimePicker() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
        updateTeacherPage.setListJam("12:00 PM");
    }

    @Then("Teacher Click 'Time' in Time Picker")
    public void teacherClickTimeInTimePicker() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerJam();
    }

    @And("Time Picker can be Clicked")
    public void timePickerCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isPickerCalendarEnabled();
    }

    @When("Teacher click 'Gelar' field")
    public void teacherClickGelarField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isInputGelarEnabled();
    }

    @Then("'Gelar' field is enabled")
    public void gelarFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickGelar();
    }

    @Then("Teacher input with Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Character and Number like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterAndNumberLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Special Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithSpecialCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @Then("Teacher input with Character and Special Character like \"([^\"]*)\" in 'Gelar' field")
    public void teacherInputWithCharacterAndSpecialCharacterLikeInGelarField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputGelar(input);
    }

    @When("Teacher click 'Pengalaman' field")
    public void teacherClickPengalamanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputPengalaman();
    }

    @Then("'Pengalaman' field is enabled")
    public void pengalamanFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isInputPengalamanEnabled();
    }

    @When("Teacher click 'Lokasi Asal' field")
    public void teacherClickLokasiAsalField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickLokasiAsal();
    }

    @Then("'Lokasi Asal' field is enabled")
    public void lokasiAsalFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isSelectLokasiAsalEnabled();
    }

    @Then("Option from 'Lokasi Asal' Can be Clicked")
    public void optionFromLokasiAsalCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isSelectLokasiAsalEnabled();
    }

    @When("Teacher Click 'Offline' Checkbox Ketersediaan field")
    public void teacherClickOfflineCheckboxKetersediaanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputCheckboxOffline();
    }

    @Then("Offline Checkbox can be Clicked")
    public void offlineCheckboxCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isInputCheckboxOfflineEnabled();
    }

    @When("Teacher Click 'Online' Checkbox Ketersediaan field")
    public void teacherClickOnlineCheckboxKetersediaanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputCheckboxOnline();
    }

    @When("Teacher click 'Handphone' field")
    public void teacherClickHandphoneField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputHandphone();
    }

    @Then("Teacher input with valid number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithValidNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with not valid number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithNotValidNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithCharacterAndNumberLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Handphone' field")
    public void teacherInputWithSpecialCharacterLikeInHandphoneField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputHandphone(input);
    }

    @When("Teacher click 'Email' field")
    public void teacherClickEmailField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputEmail();
    }

    @Then("Teacher input with valid name like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithValidNameLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithCharacterAndNumberLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithNumberLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'Email' field")
    public void teacherInputWithSpecialCharacterLikeInEmailField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputEmail(input);
    }

    @When("Teacher click 'LinkedIn' field")
    public void teacherClickLinkedInField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickInputLinkedin();
    }

    @Then("'LinkedIn' field is enabled")
    public void linkedinFieldIsEnabled() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isInputLinkedinEnabled();
    }

    @Then("Teacher input with character like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithCharacterLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with number like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithNumberLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with character and number like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithCharacterAndNumberLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @Then("Teacher input with special character like \"([^\"]*)\" in 'LinkedIn' field")
    public void teacherInputWithSpecialCharacterLikeInLinkedInField(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.setInputLinkedin(input);
    }

    @When("Teacher click 'Atur Tempat Mengajar' button")
    public void teacherClickAturTempatMengajarButton() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickCheckboxMaps();
    }

    @Then("'Atur Tempat Mengajar' field can be Clicked")
    public void aturTempatMengajarFieldCanBeClicked() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isCheckboxMapsEnabled();
    }

    @And("Show OpenStreetMap")
    public void showOpenStreetMap() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.selectCheckboxMaps("Jakarta");
    }

    @When("Teacher fill all data form")
    public void teacherFillAllDataForm() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }



    @When("Teacher fill all data form but not on 'Tarif / Jam' field")
    public void teacherFillAllDataFormButNotOnTarifJamField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Specialis Mata Pelajaran' field")
    public void teacherFillAllDataFormButNotOnSpecialisMataPelajaranField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Jenjang Pendidikan' field")
    public void teacherFillAllDataFormButNotOnJenjangPendidikanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Unggah Ijazah' field")
    public void teacherFillAllDataFormButNotOnUnggahIjazahField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Unggah Foto' field")
    public void teacherFillAllDataFormButNotOnUnggahFotoField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Gelar' field")
    public void teacherFillAllDataFormButNotOnGelarField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Tentang Saya' field")
    public void teacherFillAllDataFormButNotOnTentangSayaField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Lokasi Saya' field")
    public void teacherFillAllDataFormButNotOnLokasiSayaField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Offline' button in Ketersediaan field")
    public void teacherFillAllDataFormButNotOnOfflineButtonInKetersediaanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Online' button in Ketersediaan field")
    public void teacherFillAllDataFormButNotOnOnlineButtonInKetersediaanField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Handphone' field")
    public void teacherFillAllDataFormButNotOnHandphoneField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'Email' field")
    public void teacherFillAllDataFormButNotOnEmailField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form but not on 'LinkedIn' field")
    public void teacherFillAllDataFormButNotOnLinkedInField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
    }

    @Then("Teacher click 'Tambah Jadwal Mengajar' button")
    public void teacherClickTambahJadwalMengajarButton() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.isCheckboxMapsEnabled();
        updateTeacherPage.clickCheckboxMaps();
        updateTeacherPage.selectCheckboxMaps();
        updateTeacherPage.clickInputTempatMengajar();
    }

    @Then("Teacher click 'Perbarui' button")
    public void teacherClickPerbaruiButton() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickBtnUpdateTeacher();
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Date in 'Atur Waktu Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnDateInAturWaktuMengajarField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Hour in 'Atur Waktu Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnHourInAturWaktuMengajarField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
    }

    @When("Teacher fill all data form 'Tambah Jadwal Mengajar' but not on Maps in 'Atur Tempat Mengajar' field")
    public void teacherFillAllDataFormTambahJadwalMengajarButNotOnMapsInAturTempatMengajarField() {
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickTarif();
        updateTeacherPage.setInputTarif("50000");
        updateTeacherPage.clickSpesialisMapel();
        updateTeacherPage.selectDropdown("Matematika");
        updateTeacherPage.clickJenjangPendidikan();
        updateTeacherPage.selectJenjangPendidikan("Sekolah Dasar");
        updateTeacherPage.clickIjazah();
        updateTeacherPage.setInputIjazah("Diploma");
        updateTeacherPage.clickInputPhoto();
        updateTeacherPage.setInputPhoto("uyuy.png");
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
        updateTeacherPage.setInputEmail("uyuyks@gmail.com");
        updateTeacherPage.clickInputLinkedin();
        updateTeacherPage.setInputLinkedin("uyuyks");
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
        updateTeacherPage updateTeacherPage = new updateTeacherPage(webDriver);
        updateTeacherPage.clickPickerCalendar();
    }
}




