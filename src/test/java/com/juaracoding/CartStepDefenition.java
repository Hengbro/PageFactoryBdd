package com.juaracoding;

import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartStepDefenition {
    private WebDriver driver;
    private CartPage cartpage;

    @Before
    public void setUp(){
        // Inisialisasi WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\MyTolls\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/my-account/");
        cartpage = new CartPage();
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

    @When("User logs in")
    public void user_logs_in() {
        cartpage.enterUsername("hengki");
        cartpage.enterPassword("VRTKEqf:PN3Hq!g");
        cartpage.clickLoginButton();
    }

    @When("User add to cart")
    public void user_add_to_cart() {
        cartpage.addtwocart();
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        WebElement berhasil = cartpage.getProduct();

        if (berhasil.isDisplayed() && berhasil.getText().equals("CHECKOUT")) {
            System.out.println("Pengguna berhasil order.");
        } else {
            System.out.println("Pengguna gagal order.");
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
