package com.testvagrant.zohopeople.test;

import com.testvagrant.zohopeople.utility.BaseAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZohoAppTest extends BaseAction {

    @BeforeTest
    void initialize() {
        setup();
    }

    @Test
    void loginToHome(){

    }

    @AfterTest
    void tearDown(){
        endSession();
    }
}

