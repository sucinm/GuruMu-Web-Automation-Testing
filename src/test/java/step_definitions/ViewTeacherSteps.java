package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.ViewTeacherPage;
public class ViewTeacherSteps {

    private WebDriver webDriver;
    ViewTeacherPage viewTeacherPage;

    public ViewTeacherSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        viewTeacherPage = new ViewTeacherPage(webDriver);
    }

    @Given("Teacher already on Beranda / Home")
    public void teacherAlreadyOnBerandaHome() {
    }

    @When("Teacher click 'user' button")
    public void teacherClickUserButton() {
        viewTeacherPage.isUserDisplayed();
        viewTeacherPage.userClicked();
    }

    @Then("Teacher Click 'Profile' option")
    public void teacherClickProfileOption() {
        viewTeacherPage.isUserDisplayed();
        viewTeacherPage.userClicked();
        viewTeacherPage.isMenuDisplayed();
        viewTeacherPage.isLinkProfilCanBeClicked();
    }

    @And("Go to Teacher Profile")
    public void goToTeacherProfile() {
        viewTeacherPage.isProfileDisplayed();
        viewTeacherPage.isProfileCanBeClick();
    }

    @Given("Teacher already on User's Profile Page")
    public void teacherAlreadyOnUserSProfilePage() {
        viewTeacherPage.isUserDisplayed();
        viewTeacherPage.userClicked();
        viewTeacherPage.isMenuDisplayed();
        viewTeacherPage.isLinkProfilCanBeClicked();
    }

    @When("Teacher verifies 'Profile Picture'")
    public void teacherVerifiesProfilePicture() {
        viewTeacherPage.isGetProfileDisplayed();
    }

    @When("Teacher verifies 'Teacher Name'")
    public void teacherVerifiesTeacherName() {
        viewTeacherPage.isTeacherNameDisplayed();
    }

    @Then("Teacher name is displayed")
    public void teacherNameIsDisplayed() {
        viewTeacherPage.isTeacherNameDisplayed();
    }

    @When("Teacher verifies 'Rating'")
    public void teacherVerifiesRating() {

    }

    @Then("Rating is displayed")
    public void ratingIsDisplayed() {
        viewTeacherPage.isRatingDisplayed();
    }

    @When("Teacher verifies 'Tarif Belajar'")
    public void teacherVerifiesTarifBelajar() {

    }

    @Then("Tarif Belajar is displayed")
    public void tarifBelajarIsDisplayed() {
        viewTeacherPage.isTarifBelajarDisplayed();
    }

    @When("Teacher verifies 'Mata Pelajaran dan Tingkatan'")
    public void teacherVerifiesMataPelajaranDanTingkatan() {

    }

    @Then("Mata Pelajaran dan Tingkatan is displayed")
    public void mataPelajaranDanTingkatanIsDisplayed() {
        viewTeacherPage.isMataPelajaranDisplayed();
        viewTeacherPage.isTingkatanDisplayed();
    }

    @When("Teacher verifies 'Spesialis Mata Pelajaran'")
    public void teacherVerifiesSpesialisMataPelajaran() {
    }

    @Then("Spesialis Mata Pelajaran is displayed")
    public void spesialisMataPelajaranIsDisplayed() {
        viewTeacherPage.isMataPelajaranDisplayed();
    }

    @When("Teacher verifies 'Jenjang Pendidikan'")
    public void teacherVerifiesJenjangPendidikan() {
        viewTeacherPage.isTingkatanDisplayed();
    }

    @Then("Jenjang Pendidikan is displayed")
    public void jenjangPendidikanIsDisplayed() {
        viewTeacherPage.isAboutCourseDisplayed();
    }

    @When("Teacher verifies 'Degree'")
    public void teacherVerifiesDegree() {
    }

    @Then("Degree is displayed")
    public void degreeIsDisplayed() {
        viewTeacherPage.isDegreeDisplayed();
    }

    @When("Teacher verifies 'Tentang Saya'")
    public void teacherVerifiesTentangSaya() {
    }

    @Then("Tentang Saya is displayed")
    public void tentangSayaIsDisplayed() {
        viewTeacherPage.isAboutMeDisplayed();
    }

    @When("Teacher verifies 'Pengalaman'")
    public void teacherVerifiesPengalaman() {
    }

    @Then("Pengalaman is displayed")
    public void pengalamanIsDisplayed() {
        viewTeacherPage.isExperienceDisplayed();
    }

    @When("Teacher click 'Selengkapnya' button")
    public void teacherClickSelengkapnyaButton() {
        viewTeacherPage.isBacaSelengkapnyaCanBeClicked();
    }

    @And("Show 'Selengkapnya' modal")
    public void showSelengkapnyaModal() {
        viewTeacherPage.isBacaSelengkapnyaDisplayed();
        viewTeacherPage.isBacaSelengkapnyaCanBeClicked();
        viewTeacherPage.isModalSelengkapnyaDisplayed();
    }

    @When("Teacher verifies 'Lokasi Saya'")
    public void teacherVerifiesLokasiSaya() {

    }

    @Then("Lokasi Saya is displayed")
    public void lokasiSayaIsDisplayed() {
        viewTeacherPage.isLokasiAsalDisplayed();
    }

    @When("Teacher verifies 'Offline'")
    public void teacherVerifiesOffline() {
    }

    @Then("Ketersediaan in 'Offline' is displayed")
    public void ketersediaanInOfflineIsDisplayed() {
        viewTeacherPage.isOfflineDisplayed();
    }

    @When("Teacher verifies 'Online'")
    public void teacherVerifiesOnline() {
    }

    @Then("Ketersediaan in 'Online' is displayed")
    public void ketersediaanInOnlineIsDisplayed() {
        viewTeacherPage.isOnlineDisplayed();
    }

    @When("Teacher verifies 'Ulasan'")
    public void teacherVerifiesUlasan() {
    }

    @Then("Ulasan is displayed")
    public void ulasanIsDisplayed() {
        viewTeacherPage.isUlasanDisplayed();
    }

    @When("Teacher click 'Lihat Lebih Banyak' button")
    public void teacherClickLihatLebihBanyakButton() {
        viewTeacherPage.isLihatLebihBanyakDisplayed();
        viewTeacherPage.isLihatLebihBanyakCanBeClicked();
    }

    @When("Teacher click 'Cek Jadwal' button")
    public void teacherClickCekJadwalButton() {
        viewTeacherPage.isCekJadwalDisplayed();
        viewTeacherPage.isCekJadwalCanBeClicked();
    }



}
