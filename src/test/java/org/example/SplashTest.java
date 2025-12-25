package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.pages.SplashScreen;

import java.lang.reflect.Method;

public class SplashTest extends BaseTest {

    SplashScreen splashScreen;

    //@BeforeMethod
    public void initPages() {
       // splashScreen = new SplashScreen(androidDriver);
    }

   // @BeforeClass()
    public void navigate() throws InterruptedException {
        try {
            splashScreen.navigatetoOnboarding();
        } catch (Exception e) {
            System.out.println("-----exception navigate splash---------------");
            }
        }






}
