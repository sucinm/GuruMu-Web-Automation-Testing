package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailPageTeacher_MuridPOVPage {
    public static WebDriver driver;

    @FindBy(css = ".bg-component")
    private WebElement reservationTeacher;

    public DetailPageTeacher_MuridPOVPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean isReservationDisplay(){
        return reservationTeacher.isDisplayed();
    }

    public void clickReservation(){
        reservationTeacher.click();
    }



}