package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.PurchasePrimumPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class PurchasePrimumTest extends BaseTest {

   PurchasePrimumPage purchasePrimumPage;

   @BeforeMethod
    public void initPages(){
       purchasePrimumPage = new PurchasePrimumPage(getDriver());
   }

   @Test ()
    public void onboarding() {
       purchasePrimumPage.skipPurchasePrimium();
   }
}
