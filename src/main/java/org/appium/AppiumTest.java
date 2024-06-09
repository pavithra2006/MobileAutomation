package org.appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.Test;

public class AppiumTest {
    @Test
    public void firstScript() {
//it is e2e learning
        //for ios use XCUITestOptions class
        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("RZ8R81DWFKW");

        options.setCapability("appium:appPackage", "com.android.vending");
        options.setCapability("appium:appActivity", "com.android.vending.AssetBrowserActivity");
//        options.setCapability("platformName", "Android"); //optional defaulty it is available
        options.setPlatformName("Android");
        options.setCapability("appium:platformVersion", "13.0");
//        options.setCapability("appium:automationName", "uiautomator2"); //optional defaulty it is available
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); // automationName is an interface

        try {
            // this url is appium server hosted url
            //for ios use IOSDriver
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            Thread.sleep(3000);
        } catch (MalformedURLException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}