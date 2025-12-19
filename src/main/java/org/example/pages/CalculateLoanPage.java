package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculateLoanPage extends BaseTest {

    @FindBy(linkText = "SIP Calculators")
    private WebElement pageTitle;

    @FindBy(id = "com.continuum.sip.calculator:id/radio_Sip")
    private WebElement tabSIP;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etMonthlyAmount\"]")
    private WebElement monthlyStatement;

    @FindBy(id = "com.continuum.sip.calculator:id/etInterest")
    private WebElement expReturnRate;

    @FindBy(id = "com.continuum.sip.calculator:id/etYears")
    private WebElement periodYears;

    public CalculateLoanPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public String getTitle() {
        return getAttribute(pageTitle, "pagetitle");
    }

}
