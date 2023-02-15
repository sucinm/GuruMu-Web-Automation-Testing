package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.ReservasiSubPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website GuruMu")
    public void userOpenTheWebsiteGuruMu() {
        LandingPage landingPage= new LandingPage(webDriver);
        landingPage.isDisplayButtonPilihGuruDisini();
    }

    @Given("User already in GuruMu login page")
    public void userAlreadyInGuruMuLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.avatarBtn();
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as email and input \"(.*)\" as password")
    public void inputCredential(String email, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.getErrorText());
    }

    @Then("User clicked masuk button")
    public void userClickMasukButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("User cant clicked masuk button")
    public void userCantClickedMasukButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.disableBtn();
    }

    @And("Alert pop-up will shown with message \"(.*)\"")
    public void alertPopUpWillShownWithMessage(String alertMsg) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(alertMsg,loginPage.getAlert());
        loginPage.alertBtn();
    }

    @Then("User will see \"(.*)\" in beranda page")
    public void userWillSeeSuccesAlertInBerandaPage(String succesAlert) {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        Assert.assertEquals(succesAlert, berandaPage.successMessageIsDisplayed());
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
