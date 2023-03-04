package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver webDriver;

    @Before // yang dilakukan sebelum menjalankan test (import cucumber.api.java.Before)
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        webDriver = new ChromeDriver(options);
        webDriver.navigate().to("https://guru-mu.vercel.app");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
    }

    @After // yang dilakukan setelah menjalankan test (import cucumber.api.java.After)
    public void closeBrowser(){
        webDriver.quit();
    }
}
