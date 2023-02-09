package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DetailPageTeacher_MuridPOVPage {
    public static WebDriver driver;

    public DetailPageTeacher_MuridPOVPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
