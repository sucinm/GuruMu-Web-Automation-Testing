package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.*;
import org.example.pageObject.DetailPageTeacher_MuridPOVPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ReservasiSubPageSteps {

    private WebDriver webDriver;

    ReservasiSubPage reservasiSubPage;

    DetailPageTeacher_MuridPOVPage detailPageTeacher_MuridPOVPage;

    public ReservasiSubPageSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        reservasiSubPage = new ReservasiSubPage(webDriver);
        detailPageTeacher_MuridPOVPage = new DetailPageTeacher_MuridPOVPage(webDriver);
    }

    @Given("Student At Detail Page Teacher Murid POV")
    public void StudentAtDetailPageTeacherMuridPOV() {
//        detailPageTeacher_MuridPOVPage.isDisplayDetailPageTeacher_MuridPOVPage();
    }

    @Given("Student at pop up Reservasi")
    public void StudentAtPopUpReservasi() {
        reservasiSubPage.isDisplayReservasiSubPage();
    }

    @When("Student click Guru")
    public void studentClickGuru() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.clickGuru();
    }

    @Then("Should show Guru Details")
    public void shouldShowGuruDetails() throws InterruptedException {
        Thread.sleep(3000);
        DetailPageTeacher_MuridPOVPage detailPageTeacher_muridPOVPage = new DetailPageTeacher_MuridPOVPage(webDriver);
        Assert.assertTrue(detailPageTeacher_muridPOVPage.isReservationDisplay());
    }


    @And("Click Reservation")
    public void clickReservation() throws InterruptedException {
        DetailPageTeacher_MuridPOVPage detailPageTeacher_muridPOVPage = new DetailPageTeacher_MuridPOVPage(webDriver);
        detailPageTeacher_muridPOVPage.clickReservation();
        Thread.sleep(3000);
    }

    @Then("show 'X' button")
    public void showXButton() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayXButton());
    }

    @Then("show payment method")
    public void showPaymentMethod() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayMetodePembayaran());
    }

    @Then("show pesan saya")
    public void showPesanSaya() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayTextOptional());
    }

    @Then("show metode belajar")
    public void showMetodeBelajar() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayFormatKhusus());

    }

    @Then("show tanggal reservasi")
    public void showTanggalReservasi() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayTanggal());
    }

    @Then("show jam reservasi")
    public void showJamReservasi() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayJam());
    }

    @Then("show alamat")
    public void showAlamat() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayAlamat());
    }

    @Then("show nomor HP")
    public void showNomorHP() {
        ReservasiSubPage reservasiSubPage1 = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage1.isDisplayNoHP());
    }
}