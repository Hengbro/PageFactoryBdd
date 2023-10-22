package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

import static java.sql.DriverManager.*;

public class LoginStepDefenition {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        // Inisialisasi WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\MyTolls\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/my-account/");
        loginPage = new LoginPage();
    }

    @After
    public void finish(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Given("User is on the login page")
    public void user_is_on_login_page() {

    }

    @When("User input username password click button login")
    public void user_input_username_password_click_button_login() {
        loginPage.enterUsername("hengki");
        loginPage.enterPassword("VRTKEqf:PN3Hq!g");
        loginPage.clickLoginButton();
        delay(5000);
        loginPage.clickLogoutButton();
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        WebElement welcomeMessage = loginPage.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("MY ACCOUNT")) {
            System.out.println("Pengguna berhasil login.");
        } else {
            System.out.println("Pengguna gagal login.");
        }
    }



    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
