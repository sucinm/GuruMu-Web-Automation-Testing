package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.UpdateStudentPage;
import org.openqa.selenium.WebDriver;

public class UpdateStudentSteps {
    private WebDriver webDriver;
    UpdateStudentPage updateStudentPage;

    public UpdateStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        updateStudentPage = new UpdateStudentPage(webDriver);
    }

    @Given("Student already on Edit Profile page")
    public void studentAlreadyonEditProfilePage() {

    }

    @When("Student click 'Nama Lengkap' field")
    public void studentClickNamaLengkapField() {
        updateStudentPage.namaLengkapClicked();
    }

    @Then("'Nama Lengkap' field is enabled")
    public void namaLengkapFieldIsEnabled() {
        updateStudentPage.isInputNamaLengkapEnabled();
    }

    @Then("Student input with valid name like \"([^\"]*)\" in 'Nama Lengkap' field")
    public void studentInputWithValidNameLikeInNamaLengkapField(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap(name);
        throw new PendingException();
    }

    @Then("Student input with number like \"([^\"]*)\" in 'Nama Lengkap' field")
    public void studentInputWithNumberLikeInNamaLengkapField(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap(name);
        throw new PendingException();
    }

    @Then("Student input with character and number like \"([^\"]*)\" in 'Nama Lengkap' field")
    public void studentInputWithCharacterAndNumberLikeInNamaLengkapField(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap(name);
        throw new PendingException();
    }

    @Then("Student input with special character like \"([^\"]*)\" in 'Nama Lengkap' field")
    public void studentInputWithSpecialCharacterLikeInNamaLengkapField(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap(name);
        throw new PendingException();
    }

    @When("Student click 'Handphone' field")
    public void studentClickHandphoneField() {
        updateStudentPage.inputTeleponClicked();
    }

    @Then("'Handphone' field is enabled")
    public void handphoneFieldIsEnabled() {
        updateStudentPage.isInputTeleponEnabled();
    }

    @Then("Student input with valid number like \"([^\"]*)\" in 'Handphone' field")
    public void studentInputWithValidNumberLikeInHandphoneField(String telepon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Student input with not valid number like \"([^\"]*)\" in 'Handphone' field")
    public void studentInputWithNotValidNumberLikeInHandphoneField(String telepon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon(telepon);
        throw new PendingException();
    }

    @Then("Student input with number like \"([^\"]*)\" in 'Handphone' field")
    public void studentInputWithNumberLikeInHandphoneField(String telepon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon(telepon);
        throw new PendingException();
    }

    @Then("Student input with character and number like \"([^\"]*)\" in 'Handphone' field")
    public void studentInputWithCharacterAndNumberLikeInHandphoneField(String telepon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon(telepon);
        throw new PendingException();
    }

    @Then("Student input with special character like \"([^\"]*)\" in 'Handphone' field")
    public void studentInputWithSpecialCharacterLikeInHandphoneField(String telepon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon(telepon);
        throw new PendingException();
    }

    @When("Student click 'Email' field")
    public void studentClickEmailField() {
        updateStudentPage.inputEmailClicked();
    }

    @Then("'Email' field is enabled")
    public void emailFieldIsEnabled() {
        updateStudentPage.isInputEmailEnabled();
    }

    @Then("Student input with valid name like \"([^\"]*)\" in 'Email' field")
    public void studentInputWithValidNameLikeInEmailField(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail(email);
        throw new PendingException();
    }

    @Then("Student input with character and number like \"([^\"]*)\" in 'Email' field")
    public void studentInputWithCharacterAndNumberLikeInEmailField(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail(email);
        throw new PendingException();
    }

    @Then("Student input with number like \"([^\"]*)\" in 'Email' field")
    public void studentInputWithNumberLikeInEmailField(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail(email);
        throw new PendingException();
    }

    @Then("Student input with special character like \"([^\"]*)\" in 'Email' field")
    public void studentInputWithSpecialCharacterLikeInEmailField(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail(email);
        throw new PendingException();
    }

    @When("Student click 'Alamat' field")
    public void studentClickAlamatField() {
        updateStudentPage.inputAlamatClicked();
    }

    @Then("'Alamat' field is enabled")
    public void alamatFieldIsEnabled() {
        updateStudentPage.isInputAlamatEnabled();
    }

    @Then("Student input with character like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithCharacterLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @Then("Student input with number like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithNumberLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @Then("Student input with character and number like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithCharacterAndNumberLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @Then("Student input with not valid special character like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithNotValidSpecialCharacterLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @Then("Student input with special character like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithSpecialCharacterLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @Then("Student input with Valid Alamat like \"([^\"]*)\" in 'Alamat' field")
    public void studentInputWithValidAlamatLikeInAlamatField(String alamat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat(alamat);
        throw new PendingException();
    }

    @When("Student click 'Unggah Foto' field")
    public void studentClickUnggahFotoField() {
        updateStudentPage.inputPictureClicked();
    }

    @Then("'Unggah Foto' field is enabled")
    public void unggahFotoFieldIsEnabled() {
        updateStudentPage.isInputPictureEnabled();
    }

    @Then("Student Upload \"([^\"]*)\" with (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void studentUploadWithXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture(photo);
        throw new PendingException();
    }

    @Then("Student Upload \"([^\"]*)\" with under (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void studentUploadWithUnderXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture(photo);
        throw new PendingException();
    }

    @Then("Student Upload \"([^\"]*)\" with over (\\d+) x (\\d+) pixels in 'Unggah Foto' field")
    public void studentUploadWithOverXPixelsInUnggahFotoField(String photo, int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture(photo);
        throw new PendingException();
    }

    @When("Student click 'X' button")
    public void studentClickXButton() {
    }

    @When("Student fill all data form")
    public void studentFillAllDataForm() {
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap("Uyuy");
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon("082298007122");
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail("uyuyks@gmail.com");
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat("Jakarta Barat no 1-2");
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture("image.png");
        updateStudentPage.btnPerbaruiClicked();
    }

    @Then("Student click 'Perbarui' button")
    public void studentClickPerbaruiButton() {
        updateStudentPage.isBtnPerbaruiEnabled();
        updateStudentPage.btnPerbaruiClicked();
    }

    @When("Student fill all data form but not on 'Nama Lengkap' field")
    public void studentFillAllDataFormButNotOnNamaLengkapField() {
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon("082298007122");
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail("uyuyks@gmail.com");
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat("Jakarta Barat no 1-2");
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture("image.png");
        updateStudentPage.btnPerbaruiClicked();
    }

    @When("Student fill all data form but not on 'Handphone' field")
    public void studentFillAllDataFormButNotOnHandphoneField() {
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap("Uyuy");
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail("uyuyks@gmail.com");
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat("Jakarta Barat no 1-2");
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture("image.png");
        updateStudentPage.btnPerbaruiClicked();
    }

    @When("Student fill all data form but not on 'Email' field")
    public void studentFillAllDataFormButNotOnEmailField() {
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap("Uyuy");
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon("082298007122");
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat("Jakarta Barat no 1-2");
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture("image.png");
        updateStudentPage.btnPerbaruiClicked();
    }

    @When("Student fill all data form but not on 'Alamat' field")
    public void studentFillAllDataFormButNotOnAlamatField() {
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap("Uyuy");
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon("082298007122");
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail("uyuyks@gmail.com");
        updateStudentPage.isInputPictureEnabled();
        updateStudentPage.inputPictureClicked();
        updateStudentPage.setInputPicture("image.png");
        updateStudentPage.btnPerbaruiClicked();
    }

    @When("Student fill all data form but not on 'Unggah Foto' field")
    public void studentFillAllDataFormButNotOnUnggahFotoField() {
        updateStudentPage.isInputNamaLengkapEnabled();
        updateStudentPage.namaLengkapClicked();
        updateStudentPage.setInputNamaLengkap("Uyuy");
        updateStudentPage.isInputTeleponEnabled();
        updateStudentPage.inputTeleponClicked();
        updateStudentPage.setInputTelepon("082298007122");
        updateStudentPage.isInputEmailEnabled();
        updateStudentPage.inputEmailClicked();
        updateStudentPage.setInputEmail("uyuyks@gmail.com");
        updateStudentPage.isInputAlamatEnabled();
        updateStudentPage.inputAlamatClicked();
        updateStudentPage.setInputAlamat("Jakarta Barat no 1-2");
        updateStudentPage.btnPerbaruiClicked();
    }


}
