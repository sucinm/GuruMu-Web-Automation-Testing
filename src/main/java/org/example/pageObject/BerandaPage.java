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

    @FindBy(id = "")
    private WebElement inputMataPelajaran;

    @FindBy(id = "")
    private WebElement inputLokasi;

    @FindBy(id = "")
    private WebElement buttonIconCari;

    @FindBy(id = "")
    private WebElement berandaLink;

    @FindBy(id = "")
    private WebElement navBar;

    @FindBy(id = "")
    private WebElement navbarProfile;

    @FindBy(id = "")
    private WebElement gridListGuru;

    @FindBy(id = "")
    private WebElement alertNotFound;

    @FindBy(id = "")
    private WebElement alertErrorInputMataPelajaran;

    @FindBy(id = "")
    private WebElement alertErrorInputLokasi;


    public void setMataPelajaran(String mataPelajaran) {
        inputMataPelajaran.sendKeys(mataPelajaran);
    }

    public void setInputLokasi(String lokasi) {
        inputLokasi.sendKeys(lokasi);
    }


    public String getInputMataPelajaran() {
        return inputMataPelajaran.getText();
    }

    public String getInputLokasi() {
        return inputLokasi.getText();
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

    public void clickBerandaLink() {
        berandaLink.click();
    }

    public void clickInputMataPelajaran(){
        inputMataPelajaran.click();
    }

    public void clickInputLokasi(){
        inputLokasi.click();
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
        boolean dataReturn = gridListGuru.findElement(By.xpath("//div[text()='" + lokasi + "']")).isDisplayed();
        return dataReturn;
    }

    public boolean isDisplayProfileMenu() {
        boolean dataReturn = navBar.findElement(By.id(navbarProfile.toString())).isDisplayed();
        return dataReturn;
    }


}
