package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentViewSessionPage
{
    public static WebDriver driver;

    public StudentViewSessionPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='dropdown dropdown-end']/label[@class='btn btn-ghost btn-circle avatar']")
    private WebElement buttonProfileDropDown;

    @FindBy(xpath = "//button[@id='link-profil']")
    private WebElement buttonProfileIcon;

    public void clickProfileDropDownButton()
    {
        buttonProfileDropDown.click();
    }

    public void clickProfileButtonIcon()
    {
        buttonProfileIcon.click();
    }

    @FindBy(xpath = "//div[.='Sedang Berlangsung']")
    private WebElement btnSedangBerlangsung;

    public boolean isDisplayBtnSedangBerlangsung()
    {
        return btnSedangBerlangsung.isDisplayed();
    }

    public void clickBtnSedangBerlangsung()
    {
        btnSedangBerlangsung.click();
    }

    @FindBy(xpath = "//th[.='Nama Guru']")
    private WebElement textNamaGuru;

    public boolean isDisplayTextNamaGuru()
    {
        return textNamaGuru.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Jam']")
    private WebElement textJam;

    public boolean isDisplayTextJam()
    {
        return textJam.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Hari & Tanggal']")
    private WebElement textTanggal;

    public boolean isDisplayTextTanggal()
    {
        return textTanggal.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Link Google Meet']")
    private WebElement textGMeet;

    public boolean isDisplayTextGMeet()
    {
        return textGMeet.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Status']")
    private WebElement textStatus;

    public boolean isDisplayTextStatus()
    {
        return textStatus.isDisplayed();
    }

    @FindBy(xpath = "//td[.='meet.google.com/tes-tes-tes']")
    private WebElement getTextGMeetLink;

    public boolean isDisplayTextGMeetLink()
    {
        return getTextGMeetLink.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='bp4-tab  text-center font-semibold text-lg text-slate-500 mt-2 pl-0 lg:pl-8 lg:pr-8 lg:-ml-0 -ml-2']")
    private WebElement btnRiwayatSiswa;

    public boolean isDisplayBtnRiwayatSiswa()
    {
        return btnRiwayatSiswa.isDisplayed();
    }

    public void clickBtnRiwayatSiswa()
    {
        btnRiwayatSiswa.click();
    }

    @FindBy(xpath = "//th[.='Nama Guru']")
    private WebElement textNamaGuruRiwayat;

    public boolean isDisplayTextNamaGuruRiwayat()
    {
        return textNamaGuruRiwayat.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Jam']")
    private WebElement textJamRiwayatStudent;

    public boolean isDisplayTextJamRiwayatStudent()
    {
        return textJamRiwayatStudent.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Hari & Tanggal']")
    private WebElement textTanggalRiwayat;

    public boolean isDisplayTextTanggalRiwayat()
    {
        return textTanggalRiwayat.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Status']")
    private WebElement textStatusRiwayat;

    public boolean isDisplayTextTStatusRiwayat()
    {
        return textStatusRiwayat.isDisplayed();
    }
}
