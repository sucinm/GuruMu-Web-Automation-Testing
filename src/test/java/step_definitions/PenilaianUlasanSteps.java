package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.PenilaianUlasanPage;
import org.example.pageObject.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PenilaianUlasanSteps {
    private WebDriver webDriver;
    PenilaianUlasanPage penilaianUlasanPage;
    ProfilePage profilePage;

    public PenilaianUlasanSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        penilaianUlasanPage = new PenilaianUlasanPage(webDriver);
        profilePage = new ProfilePage(webDriver);
    }

    @Given("Student already show penilaian dan ulasan popup")
    public void studentAlreadyShowPenilaianDanUlasanPopup() {
        penilaianUlasanPage.isDisplayPenilaianUlasanPage();
    }

    @And("Student input \"(.*)\" as ulasan")
    public void studentInputUlasanAsUlasan(String ulasan) {
        penilaianUlasanPage.setUlasan(ulasan);
    }

    @And("Student input \"(.*)\" as penilaian")
    public void studentInputPenilaianAsPenilaian(String penilaian) {
        penilaianUlasanPage.setPenilaian(penilaian);
    }

    @When("Student click button nilai")
    public void studentClickButtonNilai() {
        penilaianUlasanPage.clickButtonNilai();
    }

    @Then("Show success message \"(.*)\"")
    public void showMessage(String message) {
        penilaianUlasanPage.isDisplaySuccessMessage();
    }

    // Validation, Verify Penilaian & Ulasan Page
    @Given("Student already on profile page")
    public void studentAlreadyOnProfilePage() {
        profilePage.isDisplayNavbarProfil();
    }

    @And("Sub menu Riwayat is active")
    public void subMenuRiwayatIsActive() {
        profilePage.isActiveNavbarRiwayat();
    }

    @When("Student click link ulasan in row \"(.*)\" as teacher")
    public void studentClickLinkUlasanInRowAsTeacher(String teacherName) {
        profilePage.clickUlasanLinkByTeacher(teacherName);
    }

    @Then("Show penilaian dan ulasan popup")
    public void showPenilaianDanUlasanPopup() {
        penilaianUlasanPage.isDisplayPenilaianUlasanPage();
    }

    @And("Show \"(.*)\" on penilaian dan ulasan popup")
    public void showOnPenilaianDanUlasanPopup(String teacherName) {
    }

    @And("Show ulasan field")
    public void showUlasanField() {
        Assert.assertTrue(penilaianUlasanPage.isDisplayInputUlasan());
    }

    @And("Show penilaian field")
    public void showPenilaianField() {
        Assert.assertTrue(penilaianUlasanPage.isDisplayInputPenilaian());
    }

    @And("Show nilai button")
    public void showNilaiButton() {
        Assert.assertTrue(penilaianUlasanPage.isDisplayButtonNilai());
    }

    @When("Student click ulasan field")
    public void studentClickUlasanField() {
        penilaianUlasanPage.clickUlasanField();
    }

    @Then("Ulasan field is enabled")
    public void ulasanFieldIsEnabled() {
        Assert.assertTrue(penilaianUlasanPage.isEnabledPenilaianField());
    }

    @When("Student input \"(.*)\" in ulasan field")
    public void studentInputInUlasanField(String ulasan) {
        penilaianUlasanPage.setUlasan(ulasan);
    }

    @Then("Ulasan field value is \"(.*)\"")
    public void ulasanFieldValueIs(String ulasan) {
        Assert.assertEquals(penilaianUlasanPage.getUlasan(), ulasan);
    }

    @Then("Ulasan field show alert \"(.*)\"")
    public void ulasanFieldShowAlert(String message) {
        Assert.assertEquals(penilaianUlasanPage.getErrorInputUlasan(), message);
    }

    @When("Student click penilaian field")
    public void studentClickPenilaianField() {
        penilaianUlasanPage.clickPenilaianField();
    }

    @Then("Penilaian field is enabled")
    public void penilaianFieldIsEnabled() {
        Assert.assertTrue(penilaianUlasanPage.isEnabledPenilaianField());
    }

    @When("Student input \"(.*)\" in penilaian field")
    public void studentInputInPenilaianField(String penilaian) {
        penilaianUlasanPage.setPenilaian(penilaian);
    }

    @Then("Penilaian field value is \"(.*)\"")
    public void penilaianFieldValueIs(String penilaian) {
        Assert.assertEquals(penilaianUlasanPage.getPenilaian(), penilaian);
    }

    @Then("Penilaian field show alert \"(.*)\"")
    public void penilaianFieldShowAlert(String message) {
        Assert.assertEquals(penilaianUlasanPage.getErrorInputPenilaian(), message);
    }
}
