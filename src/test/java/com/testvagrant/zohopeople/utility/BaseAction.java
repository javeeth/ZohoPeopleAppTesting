package com.testvagrant.zohopeople.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseAction {

    protected AppiumDriver appiumDriver;
    protected AppiumDriverLocalService service;

    public void setup(){

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "/Users/javeethbasha/Downloads/Zoho.apk");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel");

        try{
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
            appiumDriver = new AndroidDriver(service.getUrl(), desiredCapabilities);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void endSession(){
        appiumDriver.quit();
        service.stop();
    }
}
