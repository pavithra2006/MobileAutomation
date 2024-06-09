package org.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage{
WebDriver driver;
WebDriverWait wait;
    By searchApps = AppiumBy.xpath("//android.view.View[@content-desc=\"Search Google Play\"]");
    By searchAppsInputBox = AppiumBy.xpath("//android.widget.EditText");
    By firstOptionFromDropdown = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]");
    By appToBeListed = AppiumBy.xpath("//android.view.View[@content-desc=\"Temple Run\n" +
            "Imangi Studios\n" +
            "Action\n" +
            "Runner\n" +
            "Arcade\n" +
            "Star rating: 4.0\n" +
            "67 MB\n" +
            "Downloaded 500 million plus times\n" +
            "\"]");

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(5000));
    }
    public void searchApp(String appToBeSearched) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(searchApps));
        driver.findElement(searchApps).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchAppsInputBox))
                        .sendKeys(appToBeSearched);

        wait.until(ExpectedConditions.elementToBeClickable(firstOptionFromDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(appToBeListed)).click();


        Thread.sleep(5000);

    }
}
