package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewStudentPage {
    public WebDriver driver;

    public viewStudentPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
    }

    @FindBy(xpath = "//div[@class='dropdown dropdown-end']")
    private WebElement user;

    @FindBy(id = "link-profil")
    private WebElement linkProfil;

    @FindBy(id = "bp4-tab-title_undefined_tab-profil")
    private WebElement profil;

    @FindBy(id = "bp4-tab-title_undefined_tab-2")
    private WebElement riwayat;

    @FindBy(id = "bp4-tab-title_undefined_tab-3")
    private WebElement sedangBerlangsung;

    @FindBy(xpath = "//div[@class=' w-32 h-32 lg:mt-10 mt-14 border border-[#EFEFEF] rounded-full overflow-hidden mt- bg-no-repeat bg-cover']")
    private WebElement profilPicture;

    @FindBy(xpath = "//p[@class='mt-2 lg:text-[36px] text-[24px] font-semibold text-[#112B3C]']")
    private WebElement studentName;

    @FindBy(xpath = "//span[@class=' pl-[16px] font-normal']")
    private WebElement email;

    @FindBy(xpath = "//span[@class=' pl-[6px] font-normal']")
    private WebElement handphone;

    @FindBy(xpath = "//p[@class='block font-semibold']")
    private WebElement alamat;

    @FindBy(id = "modal-profil-murid")
    private WebElement editProfil;

    @FindBy(xpath = "//label[@class='btn btn-sm btn-circle absolute right-2 top-2']")
    private WebElement modalClose;


    public boolean isUserDisplayed(){
        return user.isDisplayed();
    }

    public void userClicked(){
        user.click();
    }

    public boolean isLinkProfilDisplayed(){
        return linkProfil.isDisplayed();
    }

    public void linkProfilClicked(){
        linkProfil.click();
    }

    public boolean isProfilDisplayed(){
        return profil.isDisplayed();
    }

    public void profilClicked(){
        profil.click();
    }

    public boolean isRiwayatDisplayed(){
        return riwayat.isDisplayed();
    }

    public void riwayatClicked(){
        riwayat.click();
    }

    public boolean isSedangBerlangsungDisplayed(){
        return sedangBerlangsung.isDisplayed();
    }

    public void sedangBerlangsungClicked(){
        sedangBerlangsung.click();
    }

    public boolean isModalCloseDisplayed(){
        return modalClose.isDisplayed();
    }

    public boolean isModalCloseCanBeClicked(){
        return modalClose.isEnabled();
    }

    public boolean isProfilPictureDisplayed(){
        return profilPicture.isDisplayed();
    }

    public boolean isStudentNameDisplayed(){
        return studentName.isDisplayed();
    }

    public boolean isEmailDisplayed(){
        return email.isDisplayed();
    }

    public boolean isHandphoneDisplayed(){
        return handphone.isDisplayed();
    }

    public boolean isAlamatDisplayed(){
        return alamat.isDisplayed();
    }

    public boolean isEditProfilDisplayed(){
        return editProfil.isDisplayed();
    }

    public void editProfilClicked(){
        editProfil.click();
    }

    public boolean isHomeDisplayed() {
        return profil.isDisplayed() && profilPicture.isDisplayed();
    }
}
