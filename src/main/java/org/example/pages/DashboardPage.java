package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class DashboardPage extends BaseTest {

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_emi\"]/android.widget.LinearLayout")
    private WebElement calculatorImg;

     @FindBy(xpath = "//android.widget.TextView[@text=\"Quick SIP Calculator\"]")
     private WebElement quickSIPImg;

     @FindBy(xpath = "//android.widget.TextView[@text=\"Advance SIP Calculator\"]")
     private WebElement advancedSIPImg;

     @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_compare_sip\"]/android.widget.LinearLayout/android.widget.ImageView")
     private WebElement compareSIPImg;

     @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_SWP\"]/android.widget.LinearLayout/android.widget.ImageView")
     private WebElement swpCalCulImg;

     @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_stp\"]/android.widget.LinearLayout/android.widget.ImageView")
     private WebElement stpCalImg;

     @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.continuum.sip.calculator:id/layout_retirement\"]/android.widget.LinearLayout/android.widget.ImageView")
     private WebElement retirementPlanImg;

    public DashboardPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    // if you will stay on same page then return the object of the same page.
    public Object dashboardSIPCalculators(CalculatorType type) {

         switch (type) {
             case SIP :
                 clickElement(calculatorImg);
                 System.out.println("method---"+calculatorImg);
                 return new CalculateSIPDashPage(getDriver());

             case QUICK_SIP:
                 System.out.println("method 2---");

                 return "";
         }

        return "";
    }
}
