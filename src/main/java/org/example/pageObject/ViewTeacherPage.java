package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTeacherPage {

    public WebDriver driver;

    public ViewTeacherPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost btn-circle avatar']")
    private WebElement user;

    @FindBy(xpath = "//ul[@class='mt-3 p-2 shadow menu menu-compact dropdown-content bg-base-100 rounded-box w-52']")
    private WebElement menu;
    @FindBy(id = "link-profil")
    private WebElement linkProfil;

    @FindBy(id = "bp4-tab-title_undefined_1")
    private WebElement profile;

    @FindBy(id = "bp4-tab-title_undefined_2")
    private WebElement editProfile;

    @FindBy(xpath = "//div[@class='flex flex-col w-11/12 lg:h-[30rem] items-center rounded-3xl pb-4 bg-white text-[#424242] shadow-xl']/div[1]/img[@alt='profil.webp']")
    private WebElement getProfile;

    @FindBy(xpath = "//p[@class='lg:text-[36px] text-[28px] font-semibold mt-5 mb-5']")
    private WebElement teacherName;

    @FindBy(xpath = "//p[@class='text-[14px]']")
    private WebElement teacherRating;

    @FindBy(xpath = "//p[@class='font-semibold lg:text-[16px] text-[14px] pr-8 mb-5']")
    private WebElement tarifBelajar;

    @FindBy(xpath = "//p[@class='py-1 px-2 bg-[#b3b3b3] rounded-lg']")
    private WebElement mataPelajaran;

    @FindBy(xpath = "//p[@class='py-1 px-2 bg-[#b3b3b3]  rounded-lg']")
    private WebElement tingkatan;

    @FindBy(xpath = "//p[@class='px-5 py-3 text-lg  bg-white shadow-lg rounded-3xl mt-5']")
    private WebElement aboutCourse;

    @FindBy(xpath = "//p[@class='px-5 py-3 text-lg  bg-white shadow-lg rounded-3xl mt-5']")
    private WebElement degree;

    @FindBy(xpath = "//p[@class='text-[14px] text-zinc-500 mt-5']")
    private WebElement aboutMe;

    @FindBy(xpath = "//ul[@class='lg:text-[16px] text-[15px]']")
    private WebElement experience;

    @FindBy(id = "my-modal-3")
    private WebElement bacaSelengkapnya;

    @FindBy(xpath = "//div[@class='modal-box relative']")
    private WebElement modalSelengkapnya;



    @FindBy(xpath = "//div[@class='flex gap-2 py-2 px-5 rounded-2xl lg:-mb-0 -mb-5 bg-white shadow-lg']")
    private WebElement lokasiAsal;

    @FindBy(xpath = "//div[@class='flex gap-2 py-2 px-5 rounded-2xl bg-white shadow-lg']")
    private WebElement offline;

    @FindBy(xpath = "//p[@class='mt-5 flex w-64 gap-2 py-2 px-5 rounded-2xl bg-white shadow-lg']")
    private WebElement online;

    @FindBy(xpath = "//div[@class='bg-white rounded-xl py-4 px-10 text-[16px] mb-5 pb-10 pt-10']")
    private WebElement ulasan;

    @FindBy(xpath = "//p[@class='mt-5']")
    private WebElement lihatLebihBanyak;

    @FindBy(xpath = "//div[@class='flex flex-col w-11/12 lg:h-[30rem] items-center rounded-3xl pb-4 bg-white text-[#424242] shadow-xl']")
    private WebElement cekJadwal;


    public boolean isUserDisplayed(){
        return user.isDisplayed();
    }

    public void userClicked(){
        user.click();
    }

    public boolean isMenuDisplayed(){
        return menu.isDisplayed();
    }
    public void isLinkProfilCanBeClicked(){
        linkProfil.click();
    }

    public boolean isProfileDisplayed(){
        return profile.isDisplayed();
    }

    public boolean isEditProfileDisplayed(){
        return editProfile.isDisplayed();
    }

    public boolean isRatingDisplayed(){
        return teacherRating.isDisplayed();
    }
    public void isProfileCanBeClick() {
        profile.click();
    }

    public void isEditProfileCanBeClick() {
        editProfile.click();
    }

    public boolean isGetProfileDisplayed() {
        return getProfile.isDisplayed();
    }

    public boolean isTeacherNameDisplayed() {
        return teacherName.isDisplayed();
    }

    public boolean isTarifBelajarDisplayed() {
        return tarifBelajar.isDisplayed();
    }

    public boolean isMataPelajaranDisplayed() {
        return mataPelajaran.isDisplayed();
    }

    public boolean isTingkatanDisplayed() {
        return tingkatan.isDisplayed();
    }

    public boolean isAboutCourseDisplayed() {
        return aboutCourse.isDisplayed();
    }

    public boolean isDegreeDisplayed() {
        return degree.isDisplayed();
    }

    public boolean isAboutMeDisplayed(){
        return aboutMe.isDisplayed();
    }

    public boolean isExperienceDisplayed(){
        return experience.isDisplayed();
    }

    public boolean isBacaSelengkapnyaDisplayed(){
        return bacaSelengkapnya.isDisplayed();
    }

    public void isBacaSelengkapnyaCanBeClicked(){
        bacaSelengkapnya.click();
    }

    public boolean isModalSelengkapnyaDisplayed(){
        return modalSelengkapnya.isDisplayed();
    }


    public boolean isLokasiAsalDisplayed(){
        return lokasiAsal.isDisplayed();
    }

    public boolean isOfflineDisplayed(){
        return offline.isDisplayed();
    }

    public boolean isOnlineDisplayed(){
        return online.isDisplayed();
    }

    public boolean isUlasanDisplayed(){
        return ulasan.isDisplayed();
    }

    public boolean isLihatLebihBanyakDisplayed(){
        return lihatLebihBanyak.isDisplayed();
    }

    public void isLihatLebihBanyakCanBeClicked(){
        lihatLebihBanyak.click();
    }

    public boolean isCekJadwalDisplayed() {
        return cekJadwal.isDisplayed();
    }

    public void isCekJadwalCanBeClicked(){
        cekJadwal.click();
    }
}
