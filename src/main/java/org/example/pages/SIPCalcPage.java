package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SIPCalcPage extends BaseTest {

    @FindBy(id = "com.continuum.sip.calculator:id/btnSkip")
    WebElement skipbutton;

    public SIPCalcPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public NumberFormatPage navigatetoDashboard() {
        clickElement(skipbutton);

        return new NumberFormatPage(getDriver());
    }

}
