package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.example.pageObject.StudentViewSessionPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StudentViewSessionSteps
{
    private WebDriver webDriver;

    public StudentViewSessionSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Student click profile icon button")
    public void studentClickProfileIconButton() throws InterruptedException
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        studentViewSessionPage.clickProfileDropDownButton();
        studentViewSessionPage.clickProfileButtonIcon();
        webDriver.navigate().refresh();
        Thread.sleep(3000);
    }

    @When("Student click button Sedang Berlangsung")
    public void studentClickButtonSedangBerlangsung() throws InterruptedException
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        studentViewSessionPage.clickBtnSedangBerlangsung();
        Thread.sleep(3000);
    }

    @Then("Showing page Sedang Berlangsung")
    public void showingPageSedangBerlangsung()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayBtnSedangBerlangsung());
    }

    @And("Should show Nama Guru field")
    public void shouldShowNamaGuruField()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextNamaGuru());
    }

    @And("Should show jam field")
    public void shouldShowJamField()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextJam());
    }

    @And("Should show Hari & tanggal field")
    public void shouldShowHariTanggalField()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextTanggal());
    }

    @And("Should show status field")
    public void shouldShowStatusField()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextStatus());
    }

    @And("Should show Link google meet field")
    public void shouldShowLinkGoogleMeetField()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextGMeet());
    }

    @And("Student click google meet link")
    public void studentClickGoogleMeetLink()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextGMeetLink());
    }

    @When("Student click button Riwayat")
    public void studentClickButtonRiwayat() throws InterruptedException
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        studentViewSessionPage.clickBtnRiwayatSiswa();
        Thread.sleep(3000);
    }

    @Then("Showing page Riwayat")
    public void showingPageRiwayat()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayBtnRiwayatSiswa());
    }

    @And("Should show nama guru field in riwayat page")
    public void shouldShowNamaGuruFieldInRiwayatPage()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextNamaGuruRiwayat());
    }

    @And("Should show jam field in riwayat page")
    public void shouldShowJamFieldInRiwayatPage()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextJamRiwayatStudent());
    }

    @And("Should show Hari & tanggal field in riwayat page")
    public void shouldShowHariTanggalFieldInRiwayatPage()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextTanggalRiwayat());
    }

    @And("Should show status field in riwayat page")
    public void shouldShowStatusFieldInRiwayatPage()
    {
        StudentViewSessionPage studentViewSessionPage = new StudentViewSessionPage(webDriver);
        Assert.assertTrue(studentViewSessionPage.isDisplayTextTStatusRiwayat());
    }
}
