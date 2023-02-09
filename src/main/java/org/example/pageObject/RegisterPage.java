package org.example.pageObject;

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

    @FindBy(xpath = "")
    private WebElement namaLengkap;

    @FindBy(xpath = "")
    private WebElement peran;

    @FindBy(xpath = "")
    private WebElement email;

    @FindBy(xpath = "")
    private WebElement password;

    @FindBy(xpath = "")
    private WebElement daftarBtn;

    @FindBy(xpath = "")
    private WebElement alamat;

    @FindBy(xpath = "")
    private WebElement handphone;

    @FindBy(xpath = "")
    private WebElement pilihJenjang;

    @FindBy(xpath = "")
    private WebElement deskripsiDiri;

    @FindBy(xpath = "")
    private WebElement unggahFoto;

    @FindBy(xpath = "")
    private WebElement linkedinProfile;

    @FindBy(xpath = "")
    private WebElement uploadIjazah;

    @FindBy(xpath = "")
    private WebElement daftarBtnTeacher;

    public void setNamaLengkap(String nama){
        namaLengkap.sendKeys(nama);
    }

    public void selectMurid(String pilih){
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

    public void setAlamat (String alamat){
        this.alamat.sendKeys(alamat);
    }

    public void setNomor (String nomor){
        handphone.sendKeys(nomor);
    }

    public void setJenjang (String pilih){
        Select jenjang = new Select(pilihJenjang);
        jenjang.selectByVisibleText(pilih);
    }

    public void setDeskripsiDiri(String deskripsi){
        deskripsiDiri.sendKeys(deskripsi);
    }

    public void setUploadFoto(){
        unggahFoto.sendKeys("");
    }

    public void setLinkedin(String user){
        linkedinProfile.sendKeys(user);
    }

    public void setUploadIjazah(){
        uploadIjazah.sendKeys("");
    }

    public void daftarBtnTeacher(){
        daftarBtnTeacher.click();
    }
}
