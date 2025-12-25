package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.CalculateLoanPage;
import org.example.pages.CalculatorType;
import org.example.pages.DashboardPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DashboradTest extends BaseTest {

    DashboardPage dashboardPage;

    //initalise the dahboard page here for all test
    @BeforeMethod
    public void initPages() {
        dashboardPage = new DashboardPage(getDriver());
    }

    @Test ()
    public void SIPCalculator() {
         dashboardPage.dashboardSIPCalculators(CalculatorType.SIP);
    }

}
