package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    private static AppiumDriverLocalService service;

    @FindBy(xpath = "//android.widget.ProgressBar[@text=\"0.0\"]")
    public WebElement progressBar;

    public BaseTest() {
    }

    protected AndroidDriver getDriver() {
        return driver;
    }

    @Parameters({"platformName", "platformVersion", "deviceName"})
    @BeforeClass(alwaysRun = true)
    public void setuDriver(String platformName, String platformVersion, String deviceName) throws MalformedURLException {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName(deviceName);
            options.setAppPackage(ConfigReader.get("appPackage"));
            options.setAppActivity(ConfigReader.get("appActivity"));
            options.setPlatformName(platformName);
            options.setAutomationName(ConfigReader.get("automationName"));
            options.setPlatformVersion(platformVersion);

            driver = new AndroidDriver(new URL(ConfigReader.get("url")), options);
        }
    }


    @Parameters({"platformName", "platformVersion", "deviceName"})
    @BeforeSuite(alwaysRun = true)
    public void setupServer() {
        try {
            if (service == null || !service.isRunning()) {
                service = new AppiumServiceBuilder()
                        .usingPort(4723)
                        .withIPAddress("127.0.0.1")
                        .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                        .withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                        .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
                        .build();
                service.start();
                //splash screen
                waitForInVisibility(progressBar);
               // Thread.sleep(2000);
                System.out.println("Server Started successfully");

            } else {
                System.out.println("Service is already running");
            }
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    public void waitForvisibility(WebElement element)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForInVisibility(WebElement element)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

   /* public void sendKeys(WebElement element, String text) {
       try {
           waitForvisibility(element);
           element.sendKeys(text);
       } catch (Exception e) {
           System.out.println(" catch sendkeys");
       }
    }*/

    public String getAttribute(WebElement element, String attribute) {
        try {
            waitForvisibility(element);

        } catch (Exception e) {
            System.out.println(" catch sendkeys");
        }

        return element.getAttribute(attribute);
    }
    public boolean clickElement(WebElement element) {
     boolean click = false;
      try {
        waitForvisibility(element);
         element.click();
          click =true;
          System.out.println(" click element value" + click);
    } catch (Exception e) {
        System.out.println(" click element exception basetest" );
       // click = false;
    }
      return click;
}

    public String getFocusedActivity() {
        return ((AndroidDriver) driver).currentActivity();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownServer() {
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium Server stopped");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void teardownDriver() {
        if (driver != null) driver.quit();
    }
}
