package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
    public void verifyDisplay(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as email and input \"(.*)\" as password")
    public void inputCredential(String email, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText){
        LoginPage loginPage = new LoginPage((webDriver));
        Assert.assertEquals(errorText, loginPage.getErrorText());
    }
}
