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

    @FindBy(id = "link-profil")
    private WebElement navbarProfil;

    @FindBy(id = "")
    private WebElement navbarRiwayat;

    @FindBy(id = "")
    private WebElement navbarSedangBerlangsung;

    @FindBy(id = "")
    private WebElement titleRiwayat;

    @FindBy(id = "")
    private WebElement titleSedangBerlangsung;

    @FindBy(id = "")
    private WebElement linkTeacherNameForRating;

    public boolean isDisplayNavbarProfil() {
        return navbarProfil.isDisplayed();
    }

    public void clickNavbarRiwayat() {
        navbarRiwayat.click();
    }

    public boolean isActiveNavbarRiwayat() {
        return titleRiwayat.isDisplayed();
    }

    public void clickUlasanLinkByTeacher(String teacherName) {
        linkTeacherNameForRating.findElement(By.xpath("" + teacherName)).click();
    }
}
