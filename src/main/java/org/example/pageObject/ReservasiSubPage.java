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

    @FindBy(id = "")
    private WebElement textOpsional;

    @FindBy(id = "")
    private WebElement perkenalkanDiriField;

    @FindBy(id = "")
    private WebElement textFormatKursus;

    @FindBy(id = "")
    private WebElement tatapMukaButton;

    @FindBy(id = "")
    private WebElement onlineButton;

    @FindBy(id = "")
    private WebElement textTanggalKursusPertama;

    @FindBy(id = "")
    private WebElement tanggalField;

    @FindBy(id = "")
    private WebElement pilihTanggalButton;

    @FindBy(id = "")
    private WebElement tanggalButton;

    @FindBy(id = "")
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

    @FindBy(id = "")
    private WebElement alamatField;

    @FindBy(id = "")
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

    @FindBy(id = "")
    private WebElement textPilihMetodePembayaran;

    @FindBy(id = "")
    private WebElement textATMAtauBankTransfer;

    @FindBy(id = "")
    private WebElement textNamaBankTransfer;

    @FindBy(id = "")
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

//on progress
}
