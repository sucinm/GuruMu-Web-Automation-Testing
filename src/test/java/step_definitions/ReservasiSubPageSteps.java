package step_definitions;

import cucumber.api.java.en.Given;
import org.example.pageObject.*;
import org.example.pageObject.DetailPageTeacher_MuridPOVPage;
import org.openqa.selenium.WebDriver;

public class ReservasiSubPageSteps {

    private WebDriver webDriver;

    ReservasiSubPage reservasiSubPage;

    DetailPageTeacher_MuridPOVPage detailPageTeacher_MuridPOVPage;

    public ReservasiSubPageSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        reservasiSubPage = new ReservasiSubPage(webDriver);
        detailPageTeacher_MuridPOVPage = new DetailPageTeacher_MuridPOVPage(webDriver);
    }

    @Given("Student At Detail Page Teacher Murid POV")
    public void StudentAtDetailPageTeacherMuridPOV() {
//        detailPageTeacher_MuridPOVPage.isDisplayDetailPageTeacher_MuridPOVPage();
    }


//    @Given("User open the website GuruMu")
//    public void verifyDisplay(){
//        ReservasiSubPage reservasiSubPage= new ReservasiSubPage(webDriver);
//        reservasiSubPage.isDisplayReservasiSubPage();
//    }

    @Given("Student at pop up Reservasi")
    public void StudentAtPopUpReservasi() {
        reservasiSubPage.isDisplayReservasiSubPage();
    }
}
