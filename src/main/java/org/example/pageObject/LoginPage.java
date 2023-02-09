package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "btn-masuk")
    private WebElement btnLogin;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;


    public void setEmail(String eml){
        email.sendKeys(eml);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean isDisplayed(){
        email.isDisplayed();
        return true;
    }

    public String getErrorText(){
        return errorMessage.getText();
    }


}