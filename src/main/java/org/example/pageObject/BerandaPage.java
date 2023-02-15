package org.example.pageObject;

import io.netty.util.internal.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BerandaPage {
    public static WebDriver driver;

    public BerandaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "input-pencarianMapel")
    private WebElement inputMataPelajaran;

    @FindBy(id = "input-pencarianLokasi")
    private WebElement inputLokasi;

    @FindBy(css = ".pt-0")
    private WebElement buttonIconCari;

    @FindBy(css = ".dropdown")
    private WebElement navbar;

    @FindBy(xpath = "//a[.='Home']")
    private WebElement berandaLink;

    @FindBy(css = ".dropdown")
    private WebElement navBar;

    @FindBy(id = "link-profil")
    private WebElement navbarProfile;

    @FindBy(css = ".gap-4")
    private WebElement gridListGuru;

    @FindBy(id = "")
    private WebElement alertNotFound;

    @FindBy(id = "input-pencarianMapel-alert")
    private WebElement alertErrorInputMataPelajaran;

    @FindBy(id = "input-pencarianLokasi-alert")
    private WebElement alertErrorInputLokasi;


    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement successMessage;

    @FindBy(css = ".swal2-confirm")
    private WebElement buttonConfirmSuccessMessage;



    public void setMataPelajaran(String mataPelajaran) {
        inputMataPelajaran.sendKeys(mataPelajaran);
    }

    public void setInputLokasi(String lokasi) {
        inputLokasi.sendKeys(lokasi);
    }


    public String getInputMataPelajaran() {
        return inputMataPelajaran.getAttribute("value");
    }

    public String getInputLokasi() {
        return inputLokasi.getAttribute("value");
    }

    public String getErrorInputMataPelajaran(){
        return alertErrorInputMataPelajaran.getText();
    }

    public String getErrorInputLokasi(){
        return alertErrorInputLokasi.getText();
    }

    public void clickIconButtonCari() {
        buttonIconCari.click();
    }

    public void clickNavigation(){
        navbar.click();
    }
    public void clickBerandaLink() {
        berandaLink.click();
    }

    public void clickInputMataPelajaran(){
        inputMataPelajaran.click();
    }

    public void clickInputLokasi(){
        inputLokasi.click();
    }

    public void clickProfile() throws InterruptedException {
        navbar.click();
        navbarProfile.click();
    }

    public void clickButtonConfirmationSuccessMessage(){
        buttonConfirmSuccessMessage.click();
    }
    public boolean isInputMataPelajaranEnabled(){
        return inputMataPelajaran.isEnabled();
    }

    public boolean isInputLokasiEnabled(){
        return inputLokasi.isEnabled();
    }
    public boolean isDisplayHomePage() {
        return inputMataPelajaran.isDisplayed() && inputLokasi.isDisplayed() && buttonIconCari.isDisplayed();
    }

    public boolean isDisplayInputMataPelajaran() {
        return inputMataPelajaran.isDisplayed();
    }

    public boolean isDisplayInputLokasi() {
        return inputLokasi.isDisplayed();
    }

    public boolean isDisplayButtonIconCari() {
        return buttonIconCari.isDisplayed();
    }

    public boolean isDisplayGridListGuru() {
        return gridListGuru.isDisplayed();
    }

    public boolean isDispayAlertNotFound() {
        return alertNotFound.isDisplayed();
    }

    public boolean isDisplayListGuruByMataPelajaran(String mataPelajaran) {
        boolean dataReturn = gridListGuru.findElement(By.xpath("//div[text()='" + mataPelajaran + "']")).isDisplayed();
        return dataReturn;
    }

    public boolean isDisplayListGuruByLokasi(String lokasi) {
        boolean dataReturn = gridListGuru.findElement(By.xpath("//p[.='" + lokasi + "']")).isDisplayed();
        return dataReturn;
    }

    public boolean isDisplayProfileMenu() {
        boolean dataReturn = navBar.findElement(By.id(navbarProfile.toString())).isDisplayed();
        return dataReturn;
    }

    public boolean successMessageIsDisplayed(){
        return successMessage.isDisplayed();
    }
}
