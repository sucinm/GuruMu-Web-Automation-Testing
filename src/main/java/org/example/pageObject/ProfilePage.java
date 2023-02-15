package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public static WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "//div[@class='bp4-tab text-[18px] font-semibold text-slate-500 lg:px-6 px-1']")
    private WebElement navbarProfil;

    @FindBy(xpath = "//div[@class='bp4-tab  text-center font-semibold text-lg text-slate-500 mt-2 pl-0 lg:pl-8 lg:pr-8 lg:-ml-0 -ml-2']")
    private WebElement navbarRiwayat;

    @FindBy(xpath = "//div[.='Sedang Berlangsung']")
    private WebElement navbarSedangBerlangsung;

    @FindBy(xpath = "//div[.='Detail Transaksi']")
    private WebElement navbarDetailTransaksi;

    @FindBy(id = "")
    private WebElement titleRiwayat;

    @FindBy(id = "")
    private WebElement titleSedangBerlangsung;

    @FindBy(id = "//td[@class='flex items-center text-component text-[16px] gap-1']")
    private WebElement linkTeacherNameForRating;

    public boolean isDisplayNavbarProfil() {
        return navbarProfil.isDisplayed();
    }

    public void clickNavbarRiwayat() {
        navbarRiwayat.click();
    }

    public void clickUlasanLinkByTeacher(String teacherName) {
        linkTeacherNameForRating.click();
    }
}
