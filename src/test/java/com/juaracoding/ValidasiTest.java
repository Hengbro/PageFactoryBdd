package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidasiTest {

    private LoginPage loginPage = new LoginPage();
    @Test
    public void testValidLogin() {
        boolean validLogin = performValidLogin();
        Assert.assertTrue(validLogin, "Valid login failed.");;
    }

    @Test
    public void testInvalidLoginUsername() {
        boolean validLogin = performInvalidUsernameLogin();
        Assert.assertTrue(validLogin, "Invalid login.");;
    }

    private boolean performValidLogin() {
        loginPage.enterUsername("hengki");
        loginPage.enterPassword("VRTKEqf:PN3Hq!g");
        loginPage.clickLoginButton();
        return true; // Gantilah dengan logika sesungguhnya
    }

    private boolean performInvalidUsernameLogin() {
        loginPage.enterUsername("korosaki");
        loginPage.enterPassword("VRTKEqf:PN3Hq!g");
        loginPage.clickLoginButton();
        return true; // Gantilah dengan logika sesungguhnya
    }
}
