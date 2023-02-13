package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.example.pageObject.PenilaianUlasanPage;
import org.example.pageObject.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PenilaianUlasanSteps {
    private WebDriver webDriver;

    public PenilaianUlasanSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("Student already show penilaian dan ulasan popup")
    public void studentAlreadyShowPenilaianDanUlasanPopup() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.isDisplayPenilaianUlasanPage();
    }

    @And("Student input \"(.*)\" as ulasan")
    public void studentInputUlasanAsUlasan(String ulasan) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.setUlasan(ulasan);
    }

    @And("Student input \"(.*)\" as penilaian")
    public void studentInputPenilaianAsPenilaian(String penilaian) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.setPenilaian(penilaian);
    }

    @When("Student click button nilai")
    public void studentClickButtonNilai() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.clickButtonNilai();
    }

    @Then("Show success message \"(.*)\"")
    public void showMessage(String message) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.isDisplaySuccessMessage();
    }

    // Validation, Verify Penilaian & Ulasan Page
    @When("Student already on profile page")
    public void studentAlreadyOnProfilePage() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        ProfilePage profilePage = new ProfilePage(webDriver);
        if(berandaPage.successMessageIsDisplayed()) {
            berandaPage.clickButtonConfirmationSuccessMessage();
        }
        berandaPage.clickNavigation();
        profilePage.clickNavbarRiwayat();
    }

    @And("Click Riwayat and Sub menu Riwayat is active")
    public void subMenuRiwayatIsActive() throws InterruptedException {
        Thread.sleep(10000);
        BerandaPage berandaPage = new BerandaPage(webDriver);
        ProfilePage profilePage = new ProfilePage(webDriver);
//        if(berandaPage.successMessageIsDisplayed()) {
//            berandaPage.clickButtonConfirmationSuccessMessage();
//        }
        berandaPage.clickNavigation();
        profilePage.clickNavbarRiwayat();
    }

    @When("Student click link ulasan in row \"(.*)\" as teacher")
    public void studentClickLinkUlasanInRowAsTeacher(String teacherName) {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickUlasanLinkByTeacher(teacherName);
    }

    @Then("Show penilaian dan ulasan popup")
    public void showPenilaianDanUlasanPopup() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayPenilaianUlasanPage());
    }

    @And("Show \"(.*)\" on penilaian dan ulasan popup")
    public void showOnPenilaianDanUlasanPopup(String teacherName) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayNamaGuru());
    }

    @And("Show ulasan field")
    public void showUlasanField() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayInputUlasan());
    }

    @And("Show penilaian field")
    public void showPenilaianField() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayInputPenilaian());
    }

    @And("Show nilai button")
    public void showNilaiButton() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayButtonNilai());
    }

    @When("Student click ulasan field")
    public void studentClickUlasanField() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.clickUlasanField();
    }

    @Then("Ulasan field is enabled")
    public void ulasanFieldIsEnabled() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isEnabledUlasanField());
    }

    @When("Student input \"(.*)\" in ulasan field")
    public void studentInputInUlasanField(String ulasan) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.setUlasan(ulasan);
    }

    @Then("Ulasan field value is \"(.*)\"")
    public void ulasanFieldValueIs(String ulasan) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertEquals(ulasan, penilaianUlasanPage.getUlasan());
    }

    @Then("Ulasan field show alert \"(.*)\"")
    public void ulasanFieldShowAlert(String message) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertEquals(message, penilaianUlasanPage.getErrorInputUlasan());
    }

    @When("Student click penilaian field")
    public void studentClickPenilaianField() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.clickPenilaianField();
    }

    @Then("Penilaian field is enabled")
    public void penilaianFieldIsEnabled() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isEnabledPenilaianField());
    }

    @When("Student input \"(.*)\" in penilaian field")
    public void studentInputInPenilaianField(String penilaian) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.setPenilaian(penilaian);
    }

    @Then("Penilaian field value is \"(.*)\"")
    public void penilaianFieldValueIs(String penilaian) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertEquals(penilaian, penilaianUlasanPage.getPenilaian());
    }

    @Then("Penilaian field show alert \"(.*)\"")
    public void penilaianFieldShowAlert(String message) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertEquals(message, penilaianUlasanPage.getErrorInputPenilaian());
    }

    @When("User move to Profile Page")
    public void userMoveToProfilePage() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        if(berandaPage.successMessageIsDisplayed()) {
            berandaPage.clickButtonConfirmationSuccessMessage();
        }
        berandaPage.clickProfile();
    }
}
