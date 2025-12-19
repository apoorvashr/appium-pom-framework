package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.DashboardPage;
import org.example.pages.SplashScreen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SplashTest extends BaseTest {

    AndroidDriver androidDriver;
    SplashScreen splashScreen;
    DashboardPage dashboardPage;

    //initalise the dahboard page here for all test
    @BeforeMethod
    public void initPages(Method method) {
        splashScreen = new SplashScreen(androidDriver);
        dashboardPage = new DashboardPage(androidDriver);
        System.out.println("\n" + "**** starting test :" + method.getName());
    }

    @Test
    public void test() {
        //waitForvisibility(dashboardPage.calculatorImg);
        // Assert.assertEquals(dashboardPage.gotoCalculateLoan(), "SIP Calculators");
    }
}
