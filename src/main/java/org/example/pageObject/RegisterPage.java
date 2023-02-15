package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    public static WebDriver driver;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//label[@class='btn btn-ghost btn-circle avatar']")
    private WebElement avatarButton;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement dropDownAvatar;

    @FindBy(xpath = "//input[@id='input-nama-lengkap']")
    private WebElement namaLengkap;

    @FindBy(id = "input-role")
    private WebElement peran;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btn-daftar']")
    private WebElement daftarBtn;

    @FindBy(xpath = "//input[@id='input-alamat']")
    private WebElement alamat;

    @FindBy(xpath = "//input[@id='input-no-hp']")
    private WebElement handphone;

    @FindBy(xpath = "//select[@id='input-jenjang-pengajaran']")
    private WebElement pilihJenjang;

    @FindBy(xpath = "//textarea[@id='input-bio']")
    private WebElement deskripsiDiri;

    @FindBy(xpath = "//input[@id='input-avatar']")
    private WebElement unggahFoto;

    @FindBy(xpath = "//input[@id='input-linkedin']")
    private WebElement linkedinProfile;

    @FindBy(xpath = "//input[@id='input-ijazah']")
    private WebElement uploadIjazah;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement daftarSuksesDisp;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okeButtonalert;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement failedAlertDisp;

    public void setNamaLengkap(String nama){
        namaLengkap.sendKeys(nama);
    }

    public void selectPeran (String pilih){
        Select murid = new Select(peran);
        murid.selectByVisibleText(pilih);
    }

    public void setEmail(String eml){
        email.sendKeys(eml);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void daftarButton(){
        daftarBtn.click();
    }

    public boolean daftarButtonDisp(){
        return daftarBtn.isEnabled();
    }

    public void setAlamat (String alamat){
        this.alamat.sendKeys(alamat);
    }

    public void setNomor (String nomor){
        handphone.sendKeys(nomor);
    }

    public void setJenjang (String pilih){
        Select jenjang = new Select(pilihJenjang);
        jenjang.selectByValue(pilih);
    }

    public void emptyJenjang (){
        Select empty = new Select(pilihJenjang);
        empty.selectByIndex(0);
    }

    public void setDeskripsiDiri(String deskripsi){
        deskripsiDiri.sendKeys(deskripsi);
    }

    public void setUploadFoto(String photo){
        unggahFoto.sendKeys(System.getProperty("user.dir") + photo);
    }

    public void setLinkedin(String user){
        linkedinProfile.sendKeys(user);
    }

    public void setUploadIjazah(String file){
        uploadIjazah.sendKeys(System.getProperty("user.dir") + file);
    }

    public void avatarBtn() {
        avatarButton.click();
        dropDownAvatar.click();
    }

    public void succesIsDisplay(){
        daftarSuksesDisp.isDisplayed();
    }

    public void okButtonAlert(){
        okeButtonalert.click();
    }

    public String failedIsDisplay(){
        return failedAlertDisp.getText();
    }


}
