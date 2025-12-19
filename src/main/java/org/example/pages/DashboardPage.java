package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseTest {

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_emi\"]/android.widget.LinearLayout")
    public WebElement calculatorImg;

    public DashboardPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    // if you will stay on same page then return the object of the same page.
    public CalculateLoanPage gotoCalculateLoan() {
        clickElement(calculatorImg);
        return new CalculateLoanPage(driver);
    }
}
