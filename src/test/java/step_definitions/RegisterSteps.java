package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.AN;
import gherkin.lexer.Th;
import org.example.pageObject.LoginPage;
import org.example.pageObject.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class RegisterSteps {
    private WebDriver webDriver;
    RegisterPage registerPage;
    LoginPage loginPage;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        registerPage = new RegisterPage(webDriver);
        loginPage = new LoginPage(webDriver);
    }

    @Given("User already in GuruMu register pop-up form")
    public void alreadyInRegisterPage(){
        registerPage.avatarBtn();
    }


    @When("^User input all valid data for student$")
    public void userInputAllValidData() {
        registerPage.setNamaLengkap("Testing Murid Register");
        registerPage.setEmail("testingmurid@gmail.com");
        registerPage.setPassword("Passmurid123@#$");
    }

    @And("^User select \"(.*)\" in Peran field$")
    public void userSelectStudentInPeranField(String peran) throws InterruptedException {
        registerPage.selectPeran(peran);
        Thread.sleep(5000);
    }

    @Then("^User click Daftar Button$")
    public void userClickDaftarButton() throws InterruptedException {
        registerPage.daftarButton();
        Thread.sleep(5000);
    }

    @And("^User will redirect to Login Page$")
    public void userWillRedirectToLoginPage() {
        registerPage.succesIsDisplay();
        registerPage.okButtonAlert();
    }

    @When("^User input valid data except \"(.*)\" in Email field for student$")
    public void userInputValidDataExceptInEmailField(String email) {
        registerPage.setNamaLengkap("Testing Murid Register");
        registerPage.setEmail(email);
        registerPage.setPassword("Passmurid123@#$");
    }

    @Then("^User cant click Daftar Button$")
    public void userCantClickDaftarButton() throws InterruptedException {
        Assert.assertFalse(registerPage.daftarButtonDisp());
    }

    @When("^User input valid data except \"(.*)\" in Password field for student$")
    public void userInputValidDataExceptInPasswordField(String pass) {
        registerPage.setNamaLengkap("Testing Murid Register");
        registerPage.setEmail("testingmurid@gmail.com");
        registerPage.setPassword(pass);
    }

    @When("^User input valid data for student$")
    public void userInputValidData() {
        registerPage.setEmail("testingmurid@gmail.com");
        registerPage.setPassword("Passmurid123@#$");
    }

    @And("^User empty the Nama Lengkap field$")
    public void userEmptyTheNamaLengkapField() {
        registerPage.setNamaLengkap("");
    }

    @When("^User empty all data field$")
    public void userEmptyAllDataField() {
        registerPage.setNamaLengkap("");
        registerPage.setEmail("");
        registerPage.setPassword("");
    }

    @When("^User input all valid data for teacher$")
    public void userInputAllValidDataForTeacher() {
        registerPage.setNamaLengkap("Testing Guru Register");
        registerPage.setEmail("testingguru23@gmail.com");
        registerPage.setPassword("Passguru123@#$");
    }

    @When("^User input valid data except \"(.*)\" in Email field for teacher$")
    public void userInputValidDataExceptInEmailFieldForTeacher(String email) {
        registerPage.setNamaLengkap("Testing Guru Register");
        registerPage.setEmail(email);
        registerPage.setPassword("Passguru123@#$");
    }

    @When("^User input valid data except \"(.*)\" in Password field for teacher$")
    public void userInputValidDataExceptInPasswordFieldForTeacher(String pass) {
        registerPage.setNamaLengkap("Testing Guru Register");
        registerPage.setEmail("testingguru@gmail.com");
        registerPage.setPassword(pass);
    }

    @When("^User input valid data for teacher$")
    public void userInputValidDataForTeacher() {
        registerPage.setEmail("testingguru@gmail.com");
        registerPage.setPassword("Passguru123@#$");
    }

    @And("^User will see alert message \"(.*)\"$")
    public void userWillSeeAlertMessages (String errorAlert) throws InterruptedException {
        Assert.assertEquals(errorAlert,registerPage.failedIsDisplay());
        registerPage.okButtonAlert();
        Thread.sleep(5000);
    }

    @Given("^User already in GuruMu Selesaikan profil anda pop-up form$")
    public void userAlreadyInGuruMuSelesaikanProfilAndaPopUpForm() throws InterruptedException {
        loginPage.avatarBtn();
        loginPage.setEmail("qatestregisterguru11@gmail.com");
        loginPage.setPassword("Qatestguru@123");
        loginPage.clickLogin();
        Thread.sleep(3000);
        loginPage.setOkBtn();
        loginPage.refresh();
        Thread.sleep(3000);
    }

    @When("^User input all valid data in selesaikan profil anda form$")
    public void userInputAllValidDataInSelesaikanProfilAndaForm() {
        registerPage.setLinkedin("LinkedIn/BudiSusanto");
        registerPage.setAlamat("Jakarta");
        registerPage.setNomor("085197884309");
        registerPage.setDeskripsiDiri("Saya lulusan dari universitas blabla");
    }

    @And("^User select \"(.*)\" in Pemilihan Jenjang Pengajaran field$")
    public void userSelectInPemilihanJenjangPengajaranField(String jenjang) throws InterruptedException {
        registerPage.setJenjang(jenjang);
        Thread.sleep(3000);
    }

    @And("^User upload photo and ijazah with valid requirement$")
    public void userUploadPhotoAndIjazahWithValidRequirement() throws InterruptedException {
        registerPage.setUploadFoto("/images/400x400px.jpg");
        registerPage.setUploadIjazah("/images/file400kb.pdf");
        Thread.sleep(5000);
    }

    @Then("^User click Update data Button$")
    public void userClickUpdateDataButton() throws InterruptedException {
        registerPage.daftarButton();
        Thread.sleep(3000);
    }

    @When("^User input valid data but empty alamat field$")
    public void userInputValidDataButEmptyAlamatField() {
        registerPage.setLinkedin("LinkedIn/BudiSusanto");
        registerPage.setAlamat("");
        registerPage.setNomor("085197884309");
        registerPage.setDeskripsiDiri("Saya lulusan dari universitas blabla");
    }

    @When("^User input valid data but invalid \"(.*)\" in Handphone field$")
    public void userInputValidDataButInvalidInHandphoneField(String nomor) {
        registerPage.setLinkedin("LinkedIn/BudiSusanto");
        registerPage.setAlamat("Jakarta");
        registerPage.setNomor(nomor);
        registerPage.setDeskripsiDiri("Saya lulusan dari universitas blabla");
    }

    @When("^User input valid data but empty phone number field$")
    public void userInputValidDataButEmptyPhoneNumberField() {
        registerPage.setLinkedin("LinkedIn/BudiSusanto");
        registerPage.setAlamat("Jakarta");
        registerPage.setNomor("");
        registerPage.setDeskripsiDiri("Saya lulusan dari universitas blabla");
    }

    @When("^User input valid data but empty Deskripsi diri field$")
    public void userInputValidDataButEmptyDeskripsiDiriField() {
        registerPage.setLinkedin("LinkedIn/BudiSusanto");
        registerPage.setAlamat("Jakarta");
        registerPage.setNomor("085197884309");
        registerPage.setDeskripsiDiri("");
    }

    @When("^User input valid data but empty Linkedin profile$")
    public void userInputValidDataButEmptyLinkedinProfile() {
        registerPage.setLinkedin("");
        registerPage.setAlamat("Jakarta");
        registerPage.setNomor("085197884309");
        registerPage.setDeskripsiDiri("Saya lulusan dari universitas blabla");
    }

    @And("^User upload ijazah with valid requirement except photo$")
    public void userUploadIjazahWithValidRequirementExceptPhoto() {
        registerPage.setUploadFoto("/images/over600px.jpg");
        registerPage.setUploadIjazah("/images/file400kb.pdf");
    }

    @And("^User upload photo with valid requirement except ijazah$")
    public void userUploadPhotoWithValidRequirementExceptIjazah() {
        registerPage.setUploadFoto("/images/400x400px.jpg");
        registerPage.setUploadIjazah("/images/file4mb.pdf");
    }

    @And("^User not select any choice in Pemilihan Jenjang Pengajaran field$")
    public void userNotSelectChoice(){
        registerPage.emptyJenjang();
    }

    @When("^User input valid data for student but empty the password$")
    public void userInputValidDataForStudentButEmptyThePassword() {
        registerPage.setNamaLengkap("Agus Budikarya");
        registerPage.setEmail("Agus@gmail.com");
        registerPage.setPassword("");
    }

    @When("^User input valid data for student but empty the email$")
    public void userInputValidDataForStudentButEmptyTheEmail() {
        registerPage.setNamaLengkap("Agus Budikarya");
        registerPage.setEmail("");
        registerPage.setPassword("!atestguru@123");
    }

    @When("^User input registered user data$")
    public void userInputRegisteredUserData() {
        registerPage.setNamaLengkap("Sudah Daftar");
        registerPage.setEmail("qatestregisterguru7@gmail.com");
        registerPage.setPassword("Qatestguru@123");
    }

    @Given("^User already in GuruMu Selesaikan profil pop-up form$")
    public void userAlreadyInGuruMuSelesaikanProfilPopUpForm() throws InterruptedException {
        loginPage.avatarBtn();
        loginPage.setEmail("qatestregisterguru12@gmail.com");
        loginPage.setPassword("Qatestguru@123");
        loginPage.clickLogin();
        Thread.sleep(3000);
        loginPage.setOkBtn();
        loginPage.refresh();
        Thread.sleep(3000);
    }
}
