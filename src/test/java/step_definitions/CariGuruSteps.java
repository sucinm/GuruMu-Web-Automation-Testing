package step_definitions;

import com.sun.jndi.ldap.Ber;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CariGuruSteps {
    private WebDriver webDriver;
    BerandaPage berandaPage;

    public CariGuruSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        berandaPage = new BerandaPage(webDriver);
    }

    @Given("Student already on home page")
    public void studentAlreadyOnHomePage() {
        berandaPage.isDisplayHomePage();
    }

    @And("Student input \"(.*)\" as mata pelajaran")
    public void studentInputAsMataPelajaran(String mataPelajaran) {
        berandaPage.setMataPelajaran(mataPelajaran);
    }

    @And("Student input \"(.*)\" as lokasi")
    public void studentInputAsLokasi(String lokasi) {
        berandaPage.setInputLokasi(lokasi);
    }

    @When("Student click button Search")
    public void studentClickButtonSearch() {
        berandaPage.clickIconButtonCari();
    }

    @Then("Should show teacher list")
    public void shouldShowTeacherList() {
        Assert.assertTrue(berandaPage.isDisplayGridListGuru());
    }

    @Then("Shouldn't show teacher list")
    public void shouldnTShowTeacherList() {
        Assert.assertTrue(berandaPage.isDisplayGridListGuru());
    }

    @And("Show notification not found")
    public void showNotificationNotFound() {
        Assert.assertTrue(berandaPage.isDispayAlertNotFound());
    }

    @And("Verify teacher mata pelajaran \"(.*)\"")
    public void verifyTeacherMataPelajaran(String mataPelajaran) {
        Assert.assertTrue(berandaPage.isDisplayListGuruByMataPelajaran(mataPelajaran));
    }

    @And("Verify teacher lokasi \"(.*)\"")
    public void verifyTeacherLokasi(String lokasi) {
        Assert.assertTrue(berandaPage.isDisplayListGuruByLokasi(lokasi));
    }

    //     BerandaPage Verify & Validation
    @Given("Student already login")
    public void studentAlreadyLogin() {
        berandaPage.isDisplayProfileMenu();
    }

    @When("Student click menu Beranda")
    public void studentClickMenuBeranda() {
        berandaPage.clickBerandaLink();
    }

    @Then("Should show home page")
    public void shouldShowHomePage() {
        Assert.assertTrue(berandaPage.isDisplayHomePage());
    }

    @And("Should show mata pelajaran field")
    public void shouldShowMataPelajaranField() {
        Assert.assertTrue(berandaPage.isDisplayInputMataPelajaran());
    }

    @And("Should show lokasi field")
    public void shouldShowLokasiField() {
        Assert.assertTrue(berandaPage.isDisplayInputLokasi());
    }

    @And("Should show cari button")
    public void shouldShowCariButton() {
        Assert.assertTrue(berandaPage.isDisplayButtonIconCari());
    }

    @When("Student click mata pelajaran field")
    public void studentClickMataPelajaranField() {
        berandaPage.getInputMataPelajaran();
    }

    @Then("Mata pelajaran field is enabled")
    public void mataPelajaranFieldIsEnabled() {
        Assert.assertTrue(berandaPage.isInputMataPelajaranEnabled());
    }

    @Then("Mata pelajaran field value is \"(.*)\"")
    public void mataPelajaranFieldValueIs(String value) {
        Assert.assertEquals(berandaPage.getInputMataPelajaran(), value);
    }

    @Then("Mata pelajaran field show alert \"(.*)\"")
    public void mataPelajaranFieldShowAlert(String alert) {
        Assert.assertEquals(berandaPage.getErrorInputMataPelajaran(), alert);
    }

    @When("Student click lokasi field")
    public void studentClickLokasiField() {
        berandaPage.clickInputLokasi();
    }

    @Then("Lokasi field is enabled")
    public void lokasiFieldIsEnabled() {
        Assert.assertTrue(berandaPage.isInputMataPelajaranEnabled());
    }

    @Then("Lokasi field value is \"(.*)\"")
    public void lokasiFieldValueIs(String value) {
        Assert.assertEquals(berandaPage.getInputLokasi(), value);
    }

    @Then("Lokasi field show alert \"(.*)\"")
    public void lokasiFieldShowAlert(String alert) {
        Assert.assertEquals(berandaPage.getErrorInputLokasi(), alert);
    }
}
