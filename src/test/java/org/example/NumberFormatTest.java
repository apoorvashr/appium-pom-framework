package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.NumberFormatPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberFormatTest extends BaseTest {

    NumberFormatPage numberFormatPage;

    @BeforeMethod
    public void initPages() {
        numberFormatPage = new NumberFormatPage(getDriver());
    }

    @Test
    public void SetNumberFormat(){
        numberFormatPage.setNumberFormat();
     }
}
