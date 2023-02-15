package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class UpdateTeacherPage {

    public WebDriver driver;

    public UpdateTeacherPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
    }

    @FindBy(id = "input-tarif")
    private WebElement inputTarif;

    @FindBy(id = "input-photo")
    private WebElement inputPhoto;

    @FindBy(xpath = "//input[@class='input flex justify-center p-2 w-10/12 lg:w-6/12 mx-auto bg-white border-2 border-gray-300']")
    private WebElement specialisMapel;

    @FindBy(xpath = "//input[@id='input-pendidikan']")
    private WebElement jenjangPendidikan;

    @FindBy(id = "input-ijazah")
    private WebElement inputIjazah;

    @FindBy(id = "date")
    private WebElement pickerCalendar;

    @FindBy(id = "time")
    private WebElement pickerJam;

    @FindBy(xpath = "//ul[@class='react-datepicker__time-list']")
    private WebElement listJam;


    @FindBy(id = "checkbox")
    private WebElement checkboxMaps;

    @FindBy(id = "input-tempat-mengajar")
    private WebElement inputTempatMengajar;

    @FindBy(id = "input-gelar")
    private WebElement inputGelar;

    @FindBy(id = "input-tentang-saya")
    private WebElement inputTentangSaya;

    @FindBy(id = "input-pengalaman")
    private WebElement inputPengalaman;

    @FindBy(id="input-lokasi")
    private WebElement selectLokasiasal;

    @FindBy(id="input-role")
    private WebElement inputCheckboxOnline;

    @FindBy(id="input-role")
    private WebElement inputCheckboxOffline;

    @FindBy(id="input-handphone")
    private WebElement inputHandphone;

    @FindBy(id="input-email")
    private WebElement inputEmail;

    @FindBy(id="input-linkedin")
    private WebElement inputLinkedin;

    @FindBy (id="btn-update-teacher")
    private WebElement btnUpdateTeacher;

    @FindBy(xpath = "//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']")
    private WebElement btnPreviousMonth;

    @FindBy(xpath = "//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']")
    private WebElement btnNextMonth;

    @FindBy(xpath = "//div[@class='bp4-tab pl-12 pr-12 pb-2 font-bold text-xl lg:ml-60 mx-auto']")
    private WebElement editProfile;

    public boolean isInputTarifEnabled(){
        return inputTarif.isEnabled();
    }

    public void clickTarif() {
        inputTarif.click();
    }

    public void setInputTarif(String input) {
        inputTarif.sendKeys(input);
    }

    public boolean isinputPhotoEnabled(){
        return inputPhoto.isEnabled();
    }

    public void setInputPhoto(String photo) {
        inputPhoto.sendKeys(photo);
    }

    public void clickInputPhoto(){
        inputPhoto.click();
    }

    public boolean isSpesialisMapelEnabled() {
        return specialisMapel.isEnabled();
    }

    public void clickSpesialisMapel() {
        specialisMapel.click();
    }

    public void selectDropdown(String sorting) {
        Select select = new Select(specialisMapel);
        select.selectByVisibleText(sorting);
    }

    public boolean isJenjangPendidikanEnabled(){
        return jenjangPendidikan.isEnabled();
    }

    public void clickJenjangPendidikan(){
        jenjangPendidikan.click();
    }

    public void selectJenjangPendidikan(String choice){
        Select select = new Select(jenjangPendidikan);
        select.selectByVisibleText(choice);
    }

    public boolean isInputIjazahEnabled() {
        return inputIjazah.isEnabled();
    }

    public void setInputIjazah(String ijazah) {
        inputIjazah.sendKeys(ijazah);
    }

    public void clickIjazah(){
        inputIjazah.click();
    }

    public boolean isPickerCalendarEnabled() {
        return pickerCalendar.isEnabled();
    }

    public void clickPickerCalendar() {
        pickerCalendar.click();
    }

    public void setPickerCalendar(String date){
        pickerCalendar.sendKeys(date);
    }

    public boolean isPickerJamEnabled() {
        return pickerJam.isEnabled();
    }

    public void clickPickerJam() {
        pickerJam.click();
    }

    public void setListJam(String hour) {
        try {
            if (listJam.isDisplayed()) {
                listJam.sendKeys(hour);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element 'listJam' is not found");
        }
    }

    public boolean isCheckboxMapsEnabled() {
        return checkboxMaps.isEnabled();
    }

    public void clickCheckboxMaps() {

        checkboxMaps.click();
    }

    public void clickInputTempatMengajar(){
        inputTempatMengajar.click();
    }

    public void selectCheckboxMaps(String location) {
        checkboxMaps.sendKeys(location);
        Instant wait = Instant.parse(location);
        Temporal start = (Temporal) ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".leaflet-control-geocoder-results a"));
        TemporalUnit end = (TemporalUnit) ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".leaflet-control-geocoder-results a"));
        wait.until(start, end);
        List<WebElement> locationResults = driver.findElements(By.cssSelector(".leaflet-control-geocoder-results a"));
        locationResults.get(0).click();
    }

    public boolean isInputGelarEnabled() {
        return inputGelar.isEnabled();
    }

    public void setInputGelar(String gelar) {
        inputGelar.sendKeys(gelar);
    }

    public void clickGelar() {
        inputGelar.click();
    }

    public boolean isInputTentangSayaEnabled() {
        return inputTentangSaya.isEnabled();
    }

    public void setInputTentangSaya(String tentangSaya) {
        inputTentangSaya.sendKeys(tentangSaya);
    }

    public boolean isInputPengalamanEnabled(){
        return inputPengalaman.isEnabled();
    }

    public void setInputPengalaman(String pengalaman) {
        inputPengalaman.sendKeys(pengalaman);
    }

    public void clickInputPengalaman() {
        inputPengalaman.click();
    }

    public boolean isSelectLokasiAsalEnabled() {
        return selectLokasiasal.isEnabled();
    }

    public void clickLokasiAsal() {
        selectLokasiasal.click();
    }

    public boolean isInputCheckboxOnlineEnabled() {
        return inputCheckboxOnline.isEnabled();
    }

    public void clickInputCheckboxOnline() {
        inputCheckboxOnline.click();
    }

    public boolean isInputCheckboxOfflineEnabled() {
        return  inputCheckboxOffline.isEnabled();
    }

    public void clickInputCheckboxOffline() {
        inputCheckboxOffline.click();
    }

    public boolean isInputHandphoneEnabled() {
        return inputHandphone.isEnabled();
    }

    public void setInputHandphone(String handphone) {
        inputHandphone.sendKeys(handphone);
    }

    public void clickInputHandphone() {
        inputHandphone.click();
    }

    public boolean isInputEmailEnabled() {
        return inputEmail.isEnabled();
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void clickInputEmail() {
        inputEmail.click();
    }

    public boolean isInputLinkedinEnabled() {
        return inputLinkedin.isEnabled();
    }

    public void setInputLinkedin(String linkedin) {
        inputLinkedin.sendKeys(linkedin);
    }

    public void clickInputLinkedin() {
        inputLinkedin.click();
    }

    public boolean isBtnUpdateTeacherEnabled() {
        return btnUpdateTeacher.isEnabled();
    }

    public void clickBtnUpdateTeacher() {
        btnUpdateTeacher.click();
    }

    public boolean isHomeDisplayed() {
        return inputTentangSaya.isDisplayed() && inputLinkedin.isDisplayed() && inputEmail.isDisplayed();
    }

    public void selectCheckboxMaps() {
        checkboxMaps.sendKeys();
    }

    public void clickPreviousMonth(){
        btnPreviousMonth.click();
    }

    public void clickNextMonth(){
        btnNextMonth.click();
    }

    public void toEditProfile() {editProfile.click();}
}
