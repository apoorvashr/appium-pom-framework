package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculateSIPDashPage extends BaseTest {

    @FindBy(id = "com.continuum.sip.calculator:id/radio_Sip")
    private WebElement tab1SIP;

    @FindBy(id = "com.continuum.sip.calculator:id/radio_Lumpsum")
    private WebElement tab2LumpSum;

    @FindBy(id = "com.continuum.sip.calculator:id/radio_plan")
    private WebElement tab3Plan;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etMonthlyAmount\"]")
    private WebElement monthlyInvEditTxt;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etInterest\"]")
    private WebElement expRetRateEditTxt;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etYears\"]")
    private WebElement periodYearsEditTxt;

    @FindBy(id = "com.continuum.sip.calculator:id/btnCalculate")
    private WebElement btnCalc;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etInvestAmount\"]")
    private WebElement totalEnvET;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.continuum.sip.calculator:id/etFinalAmount\"]")
    private WebElement targetET;

    @FindBy(xpath = "com.continuum.sip.calculator:id/btnReset")
    private WebElement btnReset;

    String done = "";
    public CalculateSIPDashPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public void calculateSIP(String type) {
        switch (type) {
            case  "sip" :
                if (!tab1SIP.isSelected() && !(done.equals("sip"))) {
                  clickElement(tab1SIP);
                    System.out.println("Reached in sip case");
                    simpleSIPTab1();
            }
            break;
            case "lumpsum":
                if (!tab2LumpSum.isSelected() && !(done.equals("lumpsum"))) {
                    clickElement(tab2LumpSum);
                    System.out.println("Reached in lumpsum case");
                    lumpsumSIPTab1();
                }
                break;

            case "plan" :
                if (!tab3Plan.isSelected() && !(done.equals("plan"))) {
                    clickElement(tab3Plan);
                    System.out.println("Reached in plan case");
                    planSIPTab3();
                }
                break;
        }
    }

    protected String simpleSIPTab1() {
        sendKeys(monthlyInvEditTxt,"2000");
        sendKeys(expRetRateEditTxt,"7");
        sendKeys(periodYearsEditTxt, "1");
        clickElement(btnCalc);
        if (clickElement(btnCalc)) done = "sip";
        return done;
    }

    protected String lumpsumSIPTab1() {
        sendKeys(totalEnvET,"500");
        sendKeys(expRetRateEditTxt,"5");
        sendKeys(periodYearsEditTxt, "2");
        clickElement(btnCalc);
        if (clickElement(btnCalc)) done = "lumpsum";
        return done;
    }

    protected String planSIPTab3() {
        sendKeys(targetET,"1000");
        sendKeys(expRetRateEditTxt,"9");
        sendKeys(periodYearsEditTxt, "1");
        clickElement(btnCalc);

        if (clickElement(btnCalc)) done = "plan";
        return done;
    }
}
