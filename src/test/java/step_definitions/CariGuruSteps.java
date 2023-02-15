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

    public CariGuruSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Student input \"(.*)\" as mata pelajaran")
    public void studentInputAsMataPelajaran(String mataPelajaran)  {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.setMataPelajaran(mataPelajaran);
    }

    @And("Student input \"(.*)\" as lokasi")
    public void studentInputAsLokasi(String lokasi) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.setInputLokasi(lokasi);
    }

    @Then("Should show teacher list")
    public void shouldShowTeacherList() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayGridListGuru());
    }

    @Then("Shouldn't show teacher list")
    public void shouldnTShowTeacherList() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(!berandaPage.isDisplayGridListGuru());
    }

    @And("Verify teacher lokasi \"(.*)\"")
    public void verifyTeacherLokasi(String lokasi) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayListGuruByLokasi(lokasi));
    }

    //     BerandaPage Verify & Validation
    @When("Student click menu Beranda")
    public void studentClickMenuBeranda() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        if(berandaPage.successMessageIsDisplayed()) {
            berandaPage.clickButtonConfirmationSuccessMessage();
        }
        berandaPage.clickNavigation();
        berandaPage.clickBerandaLink();
    }

    @Then("Should show home page")
    public void shouldShowHomePage() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayHomePage());
    }

    @And("Should show mata pelajaran field")
    public void shouldShowMataPelajaranField() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayInputMataPelajaran());
    }

    @And("Should show lokasi field")
    public void shouldShowLokasiField() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayInputLokasi());
    }

    @And("Should show cari button")
    public void shouldShowCariButton() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isDisplayButtonIconCari());
    }

    @When("Student click mata pelajaran field")
    public void studentClickMataPelajaranField() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.getInputMataPelajaran();
    }

    @Then("Mata pelajaran field is enabled")
    public void mataPelajaranFieldIsEnabled() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isInputMataPelajaranEnabled());
    }

    @Then("Mata pelajaran field value is \"(.*)\"")
    public void mataPelajaranFieldValueIs(String value) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertEquals(value, berandaPage.getInputMataPelajaran());
    }

    @Then("Mata pelajaran field show alert \"(.*)\"")
    public void mataPelajaranFieldShowAlert(String alert) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertEquals(alert, berandaPage.getErrorInputMataPelajaran());
    }

    @When("Student click lokasi field")
    public void studentClickLokasiField() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.clickInputLokasi();
    }

    @Then("Lokasi field is enabled")
    public void lokasiFieldIsEnabled() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertTrue(berandaPage.isInputMataPelajaranEnabled());
    }

    @Then("Lokasi field value is \"(.*)\"")
    public void lokasiFieldValueIs(String value) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertEquals(value, berandaPage.getInputLokasi());
    }

    @Then("Lokasi field show alert \"(.*)\"")
    public void lokasiFieldShowAlert(String alert) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertEquals(alert, berandaPage.getErrorInputLokasi());
    }
}
