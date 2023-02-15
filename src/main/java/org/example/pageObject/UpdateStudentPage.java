package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateStudentPage {

    private WebDriver webDriver;

    UpdateStudentPage updateStudentPage;
    private CharSequence email;

    public UpdateStudentPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(id = "input-avatar")
    private WebElement inputPicture;

    @FindBy(id = "input-nama-lengkap")
    private WebElement inputNamaLengkap;

    @FindBy(id = "input-telepon")
    private WebElement inputTelepon;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-alamat")
    private WebElement inputAlamat;

    @FindBy(id = "btn-perbarui")
    private WebElement btnPerbarui;

    @FindBy(id = "modal-profil-murid")
    private WebElement modalProfilMurid;

    public boolean isInputPictureEnabled() {
        return inputPicture.isEnabled();
    }

    public void inputPictureClicked(){
        inputPicture.click();
    }
    public void setInputPicture(String photo) {
        inputPicture.sendKeys(photo);
    }

    public boolean isInputNamaLengkapEnabled() {
        return inputNamaLengkap.isEnabled();
    }

    public void setInputNamaLengkap(String name) {
        inputNamaLengkap.sendKeys(name);
    }

    public void namaLengkapClicked(){
        inputNamaLengkap.click();
    }
    public boolean isInputTeleponEnabled() {
        return inputTelepon.isEnabled();
    }

    public void inputTeleponClicked(){
        inputTelepon.click();
    }
    public void setInputTelepon(String telepon) {
        inputTelepon.sendKeys(telepon);
    }

    public boolean isInputEmailEnabled(){
        return inputEmail.isEnabled();
    }
    
    public void inputEmailClicked(){
        inputEmail.click();
    }
    
    public void setInputEmail(String email){
        inputEmail.sendKeys(email);
    }
    public boolean isInputAlamatEnabled(){
        return inputAlamat.isEnabled();
    }

    public void inputAlamatClicked(){
        inputAlamat.click();
    }
    public void setInputAlamat(String alamat) {
        inputAlamat.sendKeys(alamat);
    }

    public boolean isBtnPerbaruiEnabled() {
        return btnPerbarui.isEnabled();
    }

    public void btnPerbaruiClicked() {
        btnPerbarui.click();
    }

    public void openEditProfileModal() {
        modalProfilMurid.click();
    }

}
