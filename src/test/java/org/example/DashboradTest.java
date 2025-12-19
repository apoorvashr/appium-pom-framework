package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.CalculateLoanPage;
import org.example.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DashboradTest extends BaseTest {

    DashboardPage dashboardPage;
    CalculateLoanPage calculateLoanPage;
    AndroidDriver androidDriver;

    //initalise the dahboard page here for all test
    @BeforeMethod
    public void initPages(Method method) {
        dashboardPage = new DashboardPage(androidDriver);
        System.out.println("\n" + "**** starting test :" + method.getName());
    }

    @Test
    public void test() {
        calculateLoanPage = dashboardPage.gotoCalculateLoan();
        calculateLoanPage.getTitle();
        Assert.assertEquals(calculateLoanPage.getTitle(), "SIP Calculators");
    }
}
