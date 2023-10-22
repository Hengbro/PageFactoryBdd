package com.juaracoding.pages;

import com.juaracoding.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='post-8']/div/div/div/p[1]/a")
    private WebElement logoutButton;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
    public WebElement getWelcomeMessage() {
        return driver.findElement(By.xpath("//*[@id='noo-site']/section/div/div/h1"));
    }
}
