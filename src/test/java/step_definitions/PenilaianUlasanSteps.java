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
    public void studentClickButtonNilai() throws InterruptedException {
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

    @When("Student click link ulasan in row")
    public void studentClickLinkUlasanInRowAsTeacher( ) {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickUlasanLinkByTeacher();
    }

    @Then("Show penilaian dan ulasan popup")
    public void showPenilaianDanUlasanPopup() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayPenilaianUlasanPage());
    }

    @And("Show \"(.*)\" on penilaian dan ulasan popup")
    public void showOnPenilaianDanUlasanPopup(String teacherName) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(penilaianUlasanPage.isDisplayNamaGuru(teacherName));
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
    public void studentInputInPenilaianField(String penilaian) throws InterruptedException {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        penilaianUlasanPage.setPenilaian(penilaian);
    }

    @Then("Penilaian field value is \"(.*)\"")
    public void penilaianFieldValueIs(String penilaian) {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertEquals(penilaian, penilaianUlasanPage.getPenilaian());
    }

    @Then("Penilaian field show alert")
    public void penilaianFieldShowAlert() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(!penilaianUlasanPage.isInputPenilaianValid());
    }

    @When("User move to Profile Page")
    public void userMoveToProfilePage() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        if(berandaPage.successMessageIsDisplayed()) {
            berandaPage.clickButtonConfirmationSuccessMessage();
        }
        berandaPage.clickProfile();
    }

    @When("User move to History Murid Page")
    public void userMoveToHistoryMuridPage() throws InterruptedException {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        if(berandaPage.successMessageIsDisplayed()) {
            berandaPage.clickButtonConfirmationSuccessMessage();
        }

        berandaPage.clickButtonHistoryMurid();
    }

    @And("Student click Riwayat submenu")
    public void studentClickRiwayatSubmenu() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        webDriver.navigate().refresh();
        profilePage.clickNavbarRiwayat();
    }

    @Then("Button nilai is disabled")
    public void buttonNilaiIsDisabled() {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Assert.assertTrue(!penilaianUlasanPage.isEnableButtonNilai());
    }

    @And("Sub menu Riwayat is active")
    public void subMenuRiwayatIsActive() {
        ProfilePage profilePage = new ProfilePage(webDriver);
        Assert.assertTrue(profilePage.isActiveNavbarRiwayat());
    }

    @Then("Student will see \"(.*)\" in beranda page")
    public void studentWillSeeInBerandaPage(String message) throws InterruptedException {
        PenilaianUlasanPage penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        Thread.sleep(10000);
        Assert.assertEquals(message, penilaianUlasanPage.getSuccessMessage());
    }

    @Then("Student will see alert \"(.*)\" in beranda page")
    public void studentWillSeeAlertInBerandaPage(String message) throws InterruptedException {
        String alert = webDriver.switchTo().alert().getText();
        Assert.assertEquals(message, alert);
    }
}
