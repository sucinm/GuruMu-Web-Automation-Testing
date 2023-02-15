package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;

    @Before // yang dilakukan sebelum menjalankan test (import cucumber.api.java.Before)
    public void openBrowser(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+  "/driver/chromedriver.exe");


        webDriver = new ChromeDriver(options);
        String appUrl = "https://guru-mu.vercel.app/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After // yang dilakukan setelah menjalankan test (import cucumber.api.java.After)
    public void closeBrowser(){
        webDriver.quit();
    }
}
