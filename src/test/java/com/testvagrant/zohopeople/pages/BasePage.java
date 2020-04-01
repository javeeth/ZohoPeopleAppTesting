package com.testvagrant.zohopeople.pages;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    MobileDriver mobileDriver;

    public BasePage(MobileDriver mobileDriver){
        this.mobileDriver= mobileDriver;
    }

    protected String getText(WebElement webElement){
        return webElement.getText();
    }

    protected void clickButton(WebElement webElement){
        webElement.click();
    }
}
