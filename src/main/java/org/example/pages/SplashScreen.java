package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SplashScreen extends BaseTest {

     @FindBy(xpath = "//android.widget.ProgressBar[@text=\"0.0\"]")
    public WebElement progressBar;

    public SplashScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public void navigatetoOnboarding() throws Exception {
        waitForInVisibility(progressBar);

       // return new LanguageSelectionPage(driver);
    }
}