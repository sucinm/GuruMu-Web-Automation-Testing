package step_definitions;

import org.example.pageObject.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    private WebDriver webDriver;
    RegisterPage registerPage;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        registerPage = new RegisterPage(webDriver);
    }


}
