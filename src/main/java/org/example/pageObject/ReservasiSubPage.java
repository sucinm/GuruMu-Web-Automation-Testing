package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservasiSubPage {

    public static WebDriver driver;

    public ReservasiSubPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "")
    private WebElement reservasiSubPage;

    @FindBy(id = "")
    private WebElement titleReservasi;

    @FindBy(id = "")
    private WebElement textLetsThriveWith;

    @FindBy(id = "")
    private WebElement textPerkenalkanDiri;

    @FindBy(id = "input-tentang-saya")
    private WebElement textOpsional;

    @FindBy(id = "")
    private WebElement perkenalkanDiriField;

    @FindBy(xpath = "//select[@class='select select-bordered w-11/12  mt-5 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement textFormatKursus;

    @FindBy(id = "")
    private WebElement tatapMukaButton;

    @FindBy(id = "")
    private WebElement onlineButton;

    @FindBy(css = "")
    private WebElement textTanggalKursusPertama;

    @FindBy(id = "")
    private WebElement tanggalField;

    @FindBy(css = ".mr-5")
    private WebElement pilihTanggalButton;

    @FindBy(id = "")
    private WebElement tanggalButton;

    @FindBy(xpath = "//select[@class='flex-1 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement pilihJamField;

    @FindBy(id = "")
    private WebElement pilihJamButton;

    @FindBy(id = "")
    private WebElement jamButton;

    @FindBy(id = "")
    private WebElement linkMap;

    @FindBy(id = "")
    private WebElement textInformasiKontak;

    @FindBy(id = "")
    private WebElement textKontakYangAndaBerikanHanyaAkanDibagikanKeGuruTerkait;

    @FindBy(id = "")
    private WebElement textAlamat;

    @FindBy(id = "input-alamat_siswa")
    private WebElement alamatField;

    @FindBy(id = "input-telepon")
    private WebElement textNoHp;

    @FindBy(id = "")
    private WebElement noHpField;

    @FindBy(id = "")
    private WebElement lanjutkanPembayaranButton;

    @FindBy(id = "")
    private WebElement profilPicture;

    @FindBy(id = "")
    private WebElement textUlasan;

    @FindBy(id = "")
    private WebElement textTarifBelajarPerJam;

    @FindBy(id = "")
    private WebElement textTarif;

    @FindBy(id = "")
    private WebElement textMataPelajaranDanTingkatan;

    @FindBy(id = "")
    private WebElement textNamaPelajaran;

    @FindBy(id = "")
    private WebElement textTingkatan;

    @FindBy(id = "")
    private WebElement textResponPesanGuru;

    @FindBy(xpath = "//select[@class='select select-bordered w-8/12 mt-5 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement textPilihMetodePembayaran;

    @FindBy(id = "")
    private WebElement textATMAtauBankTransfer;

    @FindBy(id = "")
    private WebElement textNamaBankTransfer;

    @FindBy(xpath = "//div[@class='modal-box w-11/12 max-w-5xl relative']/label[@class='btn btn-sm btn-circle absolute right-2 top-2']")
    private WebElement xButton;

    public boolean isDisplayReservasiSubPage() {
        return reservasiSubPage.isDisplayed();
    }

    public void clickperkenalkanDiriField() {
        perkenalkanDiriField.click();
    }

    public void clickTatapMukaButton() {
        tatapMukaButton.click();
    }

    public void clickPilihTanggalButton() {
        pilihTanggalButton.click();
    }

    public void clickPilihJamButton() {
        pilihJamButton.click();
    }

    public void clickTanggalButton() {
        tanggalButton.click();
    }

    public void clickJamButton() {
        jamButton.click();
    }

    public void clickXButton() {
        xButton.click();
    }

    public boolean isDisplayXButton(){
        return xButton.isDisplayed();
    }

    public boolean isDisplayFormatKhusus(){
        return textFormatKursus.isDisplayed();
    }

    public boolean isDisplayTextOptional(){
        return textOpsional.isDisplayed();
    }

    public boolean isDisplayTanggal(){
        return pilihTanggalButton.isDisplayed();
    }
    public boolean isDisplayJam(){
        return pilihJamField.isDisplayed();
    }

    public boolean isDisplayAlamat(){
        return alamatField.isDisplayed();
    }

    public boolean isDisplayNoHP(){
        return textNoHp.isDisplayed();
    }

    public boolean isDisplayMetodePembayaran(){
        return textPilihMetodePembayaran.isDisplayed();
    }


//on progress
}