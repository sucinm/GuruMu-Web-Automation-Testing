package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//h1[.='Penilaian & ulasan']")
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

    @FindBy(id = "swal2-html-container")
    private WebElement successMessage;

    @FindBy(css = ".flex-col")
    private WebElement formPenilaianUlasan;

    public void setUlasan(String ulasan) {
        inputUlasan.sendKeys(ulasan);
    }

    public void setPenilaian(String penilaian) {
        inputPenilaian.sendKeys(penilaian);
    }

    public void clickButtonNilai() {
        buttonNilai.click();
    }

    public boolean isEnableButtonNilai(){
        return buttonNilai.isEnabled();
    }

    public boolean isDisplayPenilaianUlasanPage() {
        return displayPenilaianUlasanPage.isDisplayed();
    }

    public boolean isDisplayNamaGuru() {
        return displayNamaGuru.isDisplayed();
    }

    public boolean isDisplayNamaGuru(String teacherName) {
        return formPenilaianUlasan.findElement(By.xpath("//p[.='"+ teacherName +"']")).isDisplayed();
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
        return inputUlasan.getAttribute("value");
    }

    public String getPenilaian() {
        return inputPenilaian.getAttribute("value");
    }

    public String getErrorInputUlasan() {
        return errorMessageInputUlasan.getText();
    }

    public boolean isInputPenilaianValid() {
        boolean isValid = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", inputPenilaian);
        return isValid;
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }


}
