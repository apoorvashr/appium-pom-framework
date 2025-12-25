package org.example;

import org.example.pages.CalculateSIPDashPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculateSIPDashTest extends BaseTest {
    CalculateSIPDashPage calculateSIPDashPage;

    @BeforeMethod
    public void init() {
        calculateSIPDashPage = new CalculateSIPDashPage(getDriver());
    }

    @Test(description = "calculate the interest for sip")
    public void sipCalculatorBlue() {
        calculateSIPDashPage.calculateSIP("sip");
        calculateSIPDashPage.calculateSIP("lumpsum");
        calculateSIPDashPage.calculateSIP("plan");
    }
}
