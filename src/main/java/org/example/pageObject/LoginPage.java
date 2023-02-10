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

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btn-masuk']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;

    @FindBy(xpath = "//label[@class='btn btn-ghost btn-circle avatar']")
    private WebElement avatarButton;

    @FindBy(xpath = "//button[@id='btn-auth']")
    private WebElement dropDownAvatar;

    @FindBy(css = ".swal2-title")
    private WebElement succesLogin;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okBtn;

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

    public void avatarBtn() {
        avatarButton.click();
        dropDownAvatar.click();
    }

    public boolean disableBtn(){
        return btnLogin.isEnabled();
    }

    public String getAlert(){
        return driver.switchTo().alert().getText();
    }

    public void alertBtn(){
        driver.switchTo().alert().accept();
    }

    public String getSucces(){
        return succesLogin.getText();
    }

    public void setOkBtn(){
        okBtn.click();
    }
}