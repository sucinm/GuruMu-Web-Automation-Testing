package step_definitions;

import cucumber.api.PendingException;
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

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website GuruMu")
    public void verifyDisplay() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.isDisplayListTahapanGuruMu();
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
        LoginPage loginPage = new LoginPage((webDriver));
        Assert.assertEquals(errorText, loginPage.getErrorText());
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
//        Thread.sleep(3000);
    }

    @When("User click avatar navigation")
    public void userClickAvatarNavigation() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickNavbar();
//        Thread.sleep(3000);
    }
}
