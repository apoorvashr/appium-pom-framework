package org.example.pages;

import com.beust.ah.A;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class NumberFormatPage extends BaseTest {

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.continuum.sip.calculator:id/imgSelection\"])[2]")
    WebElement setRadiobuttonFormat;

    @FindBy(id = "com.continuum.sip.calculator:id/img_ok")
    WebElement imgOk;

    public NumberFormatPage (AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public PurchasePrimumPage setNumberFormat() {
        if (Objects.equals(getDriver().currentActivity(), "projects.sip.activity.NumberFormatActivity")) {
              if (setRadiobuttonFormat.isEnabled()) {
                  clickElement(imgOk);
              }
        }
       /* if ( Objects.equals(driver.currentActivity(), "projects.sip.activity.SubscriptionActivity")) {
            return new PurchasePrimumPage(driver);
        }*/
       return new PurchasePrimumPage(getDriver());
    }
}
