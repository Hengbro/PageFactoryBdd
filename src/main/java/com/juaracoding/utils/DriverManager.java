package com.juaracoding.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Anda bisa menyesuaikan dengan driver yang sesuai (contoh: ChromeDriver atau FirefoxDriver)
            System.setProperty("webdriver.chrome.driver", "C:\\MyTolls\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
        }
        return driver;
    }


    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
