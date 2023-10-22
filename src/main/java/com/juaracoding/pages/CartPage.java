package com.juaracoding.pages;

import com.juaracoding.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(name = "login")
    private WebElement loginButton;
    @FindBy(xpath = "//*[@id='post-8']/div/div/nav/ul/li[2]/a")
    private WebElement btnOrders;
    @FindBy(xpath = "//*[@id='post-8']/div/div/div/div[2]/a")
    private WebElement btnBrows;
    @FindBy(xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
    private WebElement btnChoiceProduct;
    @FindBy(xpath = "//*[@id='pa_color']")
    private WebElement btnChoiceC;
    @FindBy(xpath = "//*[@id='pa_color']")
    private WebElement btnChoiceS;
    @FindBy(xpath = "//*[@id='product-1162']/div[1]/div[2]/form/div/div[2]/button")
    private WebElement btnAddCart;
    @FindBy(xpath = "//*[@id='product-1162']/div[3]/div/div[4]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
    private WebElement btnChoiceProductdua;
    @FindBy(xpath = "//*[@id='pa_color']")
    private WebElement btnChoiceCdua;
    @FindBy(xpath = "//*[@id='pa_color']")
    private WebElement btnChoiceSdua;
    @FindBy(xpath = "//*[@id='product-1162']/div[1]/div[2]/form/div/div[2]/button")
    private WebElement btnAddCartdua;
    @FindBy(xpath = "//*[@id='nav-menu-item-cart']/a/span/i")
    private WebElement btnCekCart;
    @FindBy(xpath = "//*[@id='post-6']/div/div/div[2]/div[2]/div/a")
    private WebElement btnCheckOut;


    public CartPage() {
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

    public void addtwocart() {
        btnOrders.click();
        btnBrows.click();
        btnChoiceProduct.click();
        btnChoiceC.click();
        btnChoiceS.click();
        btnAddCart.click();
        btnChoiceProductdua.click();
        btnChoiceCdua.click();
        btnChoiceSdua.click();
        btnAddCartdua.click();
        btnCekCart.click();
        btnCheckOut.click();
    }

    public WebElement getProduct() {
        return driver.findElement(By.xpath("//*[@id='noo-site']/section/div/div/h1"));
    }

}
