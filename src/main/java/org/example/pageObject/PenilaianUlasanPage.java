package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PenilaianUlasanPage {
    public static WebDriver driver;

    public PenilaianUlasanPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".text-center")
    private WebElement displayPenilaianUlasanPage;

    @FindBy(xpath = "//p[@class='font-semibold pt-8 lg:pt-0 text-xl']")
    private WebElement displayNamaGuru;

    @FindBy(id = "")
    private WebElement displayErrorMessage;

    @FindBy(id = "")
    private WebElement displaySuccessMessage;


    @FindBy(id = "input-ulasan")
    private WebElement inputUlasan;

    @FindBy(id = "input-penilaian")
    private WebElement inputPenilaian;

    @FindBy(id = "btn-nilai")
    private WebElement buttonNilai;

    @FindBy(id = "")
    private WebElement errorMessageInputUlasan;
    @FindBy(id = "")
    private WebElement errorMessageInputPenilaian;

    public void setUlasan(String ulasan) {
        inputUlasan.sendKeys(ulasan);
    }

    public void setPenilaian(String penilaian) {
        inputPenilaian.sendKeys(penilaian);
    }

    public void clickButtonNilai() {
        buttonNilai.click();
    }

    public boolean isDisplayPenilaianUlasanPage() {
        return displayPenilaianUlasanPage.isDisplayed();
    }

    public boolean isDisplayNamaGuru() {
        return displayNamaGuru.isDisplayed();
    }

    public boolean isDisplayInputUlasan() {
        return inputUlasan.isDisplayed();
    }

    public boolean isDisplayInputPenilaian() {
        return inputPenilaian.isDisplayed();
    }

    public boolean isDisplayButtonNilai() {
        return buttonNilai.isDisplayed();
    }

    public boolean isDisplaySuccessMessage() {
        return displaySuccessMessage.isDisplayed();
    }

    public boolean isDisplayErrorMessage() {
        return displayErrorMessage.isDisplayed();
    }


    public void clickUlasanField() {
        inputUlasan.click();
    }

    public void clickPenilaianField() {
        inputPenilaian.click();
    }

    public boolean isEnabledUlasanField() {
        return inputUlasan.isEnabled();
    }

    public boolean isEnabledPenilaianField() {
        return inputPenilaian.isEnabled();
    }

    public String getUlasan() {
        return inputUlasan.getText();
    }

    public String getPenilaian() {
        return inputPenilaian.getText();
    }

    public String getErrorInputUlasan() {
        return errorMessageInputUlasan.getText();
    }

    public String getErrorInputPenilaian() {
        return errorMessageInputPenilaian.getText();
    }
}
