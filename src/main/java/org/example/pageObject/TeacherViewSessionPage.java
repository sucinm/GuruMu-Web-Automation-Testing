package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherViewSessionPage
{
    public static WebDriver driver;

    public TeacherViewSessionPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-cek-jadwal']")
    private WebElement buttonCekJadwalGuru;

    public void clickBtnCekJadwalGuru()
    {
        buttonCekJadwalGuru.click();
    }

    @FindBy(xpath = "//div[@class='bp4-tab  text-center  font-semibold text-lg text-slate-500 mt-2 pl-0 lg:pl-8 lg:pr-8 ']")
    private WebElement btnSedangBerlangsungGuru;

    public void clickBtnSedangBerlangsungGuru()
    {
        btnSedangBerlangsungGuru.click();
    }

    @FindBy(xpath = "//div[@class='bp4-tab text-center font-semibold text-lg text-slate-500 mt-2 lg:pl-8 lg:pr-8']")
    private WebElement btnRiwayatGuruPage;

    public boolean isDisplayBtnRiwayatGuru()
    {
        return btnRiwayatGuruPage.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Nama Murid']")
    private WebElement textNamaMuridRiwayat;

    public boolean isDisplayTextNamaMuridRiwayat()
    {
        return textNamaMuridRiwayat.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Jam']")
    private WebElement textJamRiwayatGuru;

    public boolean isDisplayTextJamRiwayatGuru()
    {
        return textJamRiwayatGuru.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Hari & Tanggal']")
    private WebElement textTanggalRiwayatGuru;

    public boolean isDisplayTextTanggalRiwayatGuru()
    {
        return textTanggalRiwayatGuru.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Link Google Meet']")
    private WebElement textGMeetRiwayatGuru;

    public boolean isDisplayTextGMeetRiwayatGuru()
    {
        return textGMeetRiwayatGuru.isDisplayed();
    }

    @FindBy(xpath = "//th[.='Status']")
    private WebElement textStatusRiwayatGuru;

    public boolean isDisplayTextStatusRiwayatGuru()
    {
        return textStatusRiwayatGuru.isDisplayed();
    }

    public void clickGMeetGuru()
    {
        textGMeetRiwayatGuru.click();
    }

    @FindBy(xpath = "//div[@class='bp4-tab  text-center  font-semibold text-lg text-slate-500 mt-2 pl-0 lg:pl-8 lg:pr-8 ']")
    private WebElement btnSdgBerlangsungGuruPage;

    public boolean isDisplayBtnSdgBerlangsungGuru()
    {
        return btnSdgBerlangsungGuruPage.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='bp4-tab  text-center font-semibold lg:text-lg text-slate-500 lg:mt-10 pl-0 lg:pl-8 lg:pr-8 ']")
    private WebElement btnJadwalMengajarGuruPage;

    public boolean isDisplayJadwalMengajarGuru()
    {
        return btnJadwalMengajarGuruPage.isDisplayed();
    }

    public void clickBtnJadwalMengajarGuru()
    {
        btnJadwalMengajarGuruPage.click();
    }
}
