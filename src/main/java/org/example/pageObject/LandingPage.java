package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "")
    private WebElement navbar;

    @FindBy(id = "")
    private WebElement navbarSubMenuMasuk;

    @FindBy(id = "")
    private WebElement navbarSubMenuDaftar;

    @FindBy(id = "")
    private WebElement buttonPilihGuruDisini;

    @FindBy(id = "")
    private WebElement gridListPenilaianGuru;

    @FindBy(id = "")
    private WebElement gridListTahapanGuruMu;

    public void clickNavbar(){
        navbar.click();
    }

    public void clickNavbarSubMenuMasuk(){
        navbarSubMenuMasuk.click();
    }

    public void clickNavbarSubMenuDaftar(){
        navbarSubMenuDaftar.click();
    }

    public void clickButtonPilihGuruDisini(){
        buttonPilihGuruDisini.click();
    }

    public boolean isDisplayNavbar(){
        return navbar.isDisplayed();
    }

    public boolean isDisplayNavbarSubMenuMasuk(){
        return navbarSubMenuMasuk.isDisplayed();
    }

    public boolean isDisplayNavbarSubMenuDaftar(){
        return navbarSubMenuDaftar.isDisplayed();
    }

    public boolean isDisplayButtonPilihGuruDisini(){
        return buttonPilihGuruDisini.isDisplayed();
    }

    public boolean isDiplayGridPenilaianGuru(){
        return gridListPenilaianGuru.isDisplayed();
    }

    public boolean isDisplayListTahapanGuruMu(){
        return gridListTahapanGuruMu.isDisplayed();
    }
}
