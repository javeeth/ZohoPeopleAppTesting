package com.testvagrant.zohopeople.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseAction {

    protected AppiumDriver appiumDriver;

    public void setup(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "/Users/javeethbasha/Downloads/Zoho.apk");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel");

        try{
            AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

            service.start();

            appiumDriver = new AndroidDriver(service.getUrl(), desiredCapabilities);
            service.stop();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
