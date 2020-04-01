package com.testvagrant.zohopeople.pages;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "loginTextView")
    private WebElement signInButton;

    public LoginPage(MobileDriver mobileDriver){
        super(mobileDriver);
        PageFactory.initElements(mobileDriver, this);
    }

    public void loginToSignInPage(){
        clickButton(signInButton);
    }

}
