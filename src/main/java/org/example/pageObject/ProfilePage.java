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

    @FindBy(id = "bp4-tab-title_undefined_tab-2")
    private WebElement navbarRiwayat;

    @FindBy(xpath = "//div[.='Sedang Berlangsung']")
    private WebElement navbarSedangBerlangsung;

    @FindBy(xpath = "//div[.='Detail Transaksi']")
    private WebElement navbarDetailTransaksi;

    @FindBy(id = "")
    private WebElement titleRiwayat;

    @FindBy(id = "")
    private WebElement titleSedangBerlangsung;

    @FindBy(css = ".text-component")
    private WebElement linkTeacherNameForRating;

    public boolean isDisplayNavbarProfil() {
        return navbarProfil.isDisplayed();
    }

    public void clickNavbarRiwayat() {
        navbarRiwayat.click();
    }

    public boolean isActiveNavbarRiwayat() {
        return navbarRiwayat.getAttribute("aria-selected").equals("true");
    }

    public void clickUlasanLinkByTeacher() {
        linkTeacherNameForRating.click();
    }
}
