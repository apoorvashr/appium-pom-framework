package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.LanguageSelectionPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LanguageSelectionTest extends BaseTest {

    LanguageSelectionPage languageSelectionPage;

    @BeforeMethod
    public void initPages() {
        languageSelectionPage = new LanguageSelectionPage(getDriver());
    }

    @Test ()
    public void setLanguageSelection()  {
        languageSelectionPage.setSelections();
    }

}
