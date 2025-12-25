package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class LanguageSelectionPage extends BaseTest {

    @FindBy(id = "com.continuum.sip.calculator:id/iv_eng")
    WebElement langSelectEng;

    @FindBy(id = "com.continuum.sip.calculator:id/actionMenuCheck")
    WebElement actionMenuCheck;

    public LanguageSelectionPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public void setSelections()  {
        System.out.println("onboarding class selection method ---" + getDriver().currentActivity());

        if (clickElement(actionMenuCheck) &&  clickElement(langSelectEng)){
        if (Objects.equals(getDriver().currentActivity(), "projects.sip.activity.TutorialActivity") && !(Objects.equals(getDriver().currentActivity(), "projects.sip.activity.LanguageActivity"))) {
            System.out.println("SIPCalcPage class selection method ---" + getDriver().currentActivity());
            //projects.sip.activity.LanguageActivity
            new SIPCalcPage(getDriver());
        }  /*if ((Objects.equals(driver.currentActivity(), "projects.sip.activity.SubscriptionActivity")) && !(Objects.equals(driver.currentActivity(), "projects.sip.activity.LanguageActivity"))) {
            System.out.println("PurchasePrimumPage class selection method ---" + driver.currentActivity());
            new PurchasePrimumPage(driver);
          }*/
        }

      //  return "";
    }
}
