package com.testvagrant.zohopeople.test;

import com.testvagrant.zohopeople.pages.LoginPage;
import com.testvagrant.zohopeople.utility.BaseAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZohoAppTest extends BaseAction {

    @BeforeTest
    void initialize(){
        setup();
    }

    @Test
    void loginToHome() throws InterruptedException {
        Thread.sleep(5000);
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.loginToSignInPage();
    }

    @AfterTest
    void tearDown(){
        endSession();
    }
}

