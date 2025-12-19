package org.example.pages;

import io.appium.java_client.AppiumDriver;

public class SplashScreen {
    AppiumDriver driver;
    //  By splash = By.id("splash_screen_id"); // optional, if you can identify it
    // By homeElement = By.id("home_screen_element_id");

    public SplashScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    public void waitForSplashToDisappear() throws InterruptedException {
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        Thread.sleep(6600);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(homeElement));
    }
}