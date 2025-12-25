package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.SIPCalcPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SIPCalcTest extends BaseTest {

    AndroidDriver androidDriver;
    SIPCalcPage sipCalcPage;

    @BeforeMethod
    public void initPages() {
        sipCalcPage = new SIPCalcPage(getDriver());

    }

    @Test ()
    public void Test() {
        sipCalcPage.navigatetoDashboard();
    }

}
