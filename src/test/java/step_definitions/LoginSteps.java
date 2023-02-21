package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    LoginPage loginPage;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        loginPage = new LoginPage(webDriver);
    }

    @Given("User already in GuruMu login page")
    public void userAlreadyInGuruMuLoginPage() throws InterruptedException {
        loginPage.avatarBtn();
        loginPage.isDisplayed();
        Thread.sleep(5000);
    }

    @Given("User open the website GuruMu")
    public void userOpenTheWebsiteGuruMu() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Thread.sleep(3000);
        landingPage.isDisplayListTahapanGuruMu();
    }

    @When("User input \"(.*)\" as email and input \"(.*)\" as password")
    public void inputCredential(String email, String password) throws InterruptedException {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText){
        Assert.assertEquals(errorText, loginPage.getErrorText());
    }

    @Then("User clicked masuk button")
    public void userClickMasukButton() throws InterruptedException {
        loginPage.clickLogin();
    }

    @Then("User cant clicked masuk button")
    public void userCantClickedMasukButton() {
        Assert.assertFalse(loginPage.disableBtn());
    }

    @And("Alert pop-up will shown with message \"(.*)\"")
    public void alertPopUpWillShownWithMessage(String alertMsg) {
        Assert.assertEquals(alertMsg,loginPage.getAlert());
        loginPage.alertBtn();
    }

    @Then("User will see \"(.*)\" in beranda page")
    public void userWillSeeSuccesAlertInBerandaPage(String succesAlert) {
        Assert.assertEquals(succesAlert, loginPage.getSucces());
        //loginPage.setOkBtn();
    }

    @Then("User show popup message")
    public void userShowPopupMessage()  {
        BerandaPage berandaPage = new BerandaPage((webDriver));
        Assert.assertTrue(berandaPage.successMessageIsDisplayed());
        berandaPage.clickButtonConfirmationSuccessMessage();
    }

    @When("User click menu Masuk")
    public void userClickMenuMasuk() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickNavbarSubMenuMasuk();
    }

    @When("User click avatar navigation")
    public void userClickAvatarNavigation() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickNavbar();
    }
}
