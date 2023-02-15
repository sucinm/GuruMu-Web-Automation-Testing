package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.StudentViewSessionPage;
import org.example.pageObject.TeacherViewSessionPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TeacherViewSessionSteps
{
    private WebDriver webDriver;

    public TeacherViewSessionSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("Teacher click Cek Jadwal button on profile page")
    public void teacherClickCekJadwal() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        teacherViewSessionPage.clickBtnCekJadwalGuru();
        Thread.sleep(3000);
    }

    @Then("Show page Riwayat in guru session")
    public void showPageRiwayatinGuruSession() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayBtnRiwayatGuru());
        Thread.sleep(3000);
    }

    @Then("Show page Riwayat in guru session without delay 3s")
    public void showPageRiwayatinGuruSessionWithoutDelay()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayBtnRiwayatGuru());
    }

    @And("Should show Nama Murid field")
    public void shouldShowNamaMuridField()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayTextNamaMuridRiwayat());
    }

    @And("Should show jam field in teacher page")
    public void shouldShowJamFieldInTeacherPage()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayTextJamRiwayatGuru());
    }

    @And("Should show Hari & tanggal field in teacher page")
    public void shouldShowHariTanggalFieldInTeacherPage()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayTextTanggalRiwayatGuru());
    }

    @And("Should show status field in teacher page")
    public void shouldShowStatusFieldInTeacherPage()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayTextStatusRiwayatGuru());
    }

    @And("Should show Link google meet field in teacher page")
    public void shouldShowLinkGoogleMeetFieldInTeacherPage()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayTextGMeetRiwayatGuru());
    }

    @And("Teacher click google meet link")
    public void teacherClickGoogleMeetLink()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        teacherViewSessionPage.clickGMeetGuru();
    }

    @Then("Teacher click Sedang Berlangsung button")
    public void teacherClickSedangBerlangsungButton() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        teacherViewSessionPage.clickBtnSedangBerlangsungGuru();
        Thread.sleep(3000);
    }

    @And("Show page Sedang Berlangsung in guru session")
    public void showPageSedangBerlangsungInGuruSession() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayBtnSdgBerlangsungGuru());
        Thread.sleep(3000);
    }

    @And("Show page Sedang Berlangsung in guru session without delay")
    public void showPageSedangBerlangsungInGuruSessionWithoutDelay()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayBtnSdgBerlangsungGuru());
    }

    @Then("Teacher click Jadwal Mengajar button in guru session")
    public void teacherClickJadwalMengajarButtonInGuruSession() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        teacherViewSessionPage.clickBtnJadwalMengajarGuru();
        Thread.sleep(3000);
    }

    @And("Show page Jadwal Mengajar in guru session")
    public void showPageJadwalMengajarInGuruSession() throws InterruptedException
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayJadwalMengajarGuru());
        Thread.sleep(3000);
    }

    @And("^Show page Jadwal Mengajar in guru session without delay$")
    public void showPageJadwalMengajarInGuruSessionWithoutDelay()
    {
        TeacherViewSessionPage teacherViewSessionPage = new TeacherViewSessionPage(webDriver);
        Assert.assertTrue(teacherViewSessionPage.isDisplayJadwalMengajarGuru());
    }
}
