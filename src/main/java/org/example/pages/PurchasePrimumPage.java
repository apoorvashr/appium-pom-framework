package org.example.pages;
import com.google.common.base.Objects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePrimumPage extends BaseTest {

    @FindBy(id = "com.continuum.sip.calculator:id/closeActivity")
    WebElement closeImg;

   public PurchasePrimumPage(AndroidDriver driver) {
       PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
   }

   public void skipPurchasePrimium() {
       System.out.println("------Primimium------"+ getDriver().currentActivity());
           clickElement(closeImg);
   }
}




 /* if (driver.getTitle() == "SIP Calculator") {
          clickElement(closeActivityBtn);
      }

      if (driver.getTitle() == "SIP (Systematic Investment Plan)") {
          clickElement(buttonSkip);
      }*/
// return new PurchasePrimumPage(driver);