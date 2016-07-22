package com.yourcompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Local_SampleSauceTest {

	@Test
    public static void main() throws MalformedURLException {

		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("deviceName", "Nexus_5X_API_23");
		 capabilities.setCapability("platformVersion", "4.4");
		 capabilities.setCapability("app", "C:\\Users\\SauceTraining\\Downloads\\ApiDemos-debug.apk");
		 capabilities.setCapability("newCommandTimeout", "120");
		 //newCommandTimeOut adds or shortens the default amount of time (60s) the server will wait for a new command to come through
		 
		 AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(
                 new URL("http://localhost:4723/wd/hub"),
                 capabilities);
		 		 
		 WebElement graphic_btn = driver.findElementByAccessibilityId("Graphics");
         driver.tap(1,graphic_btn,750);
         //1 finger, webelement, 750ms duration
         
         
         //WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElementById("title")));
		  		 
         /*
		 TouchAction eye1 = new TouchAction(driver);
		 TouchAction eye2 = new TouchAction(driver);
		 TouchAction smile = new TouchAction(driver);
		*/
		
		 /*smile.press(100,200)
		 .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .perform();		
         */
		 
		 driver.quit();
		 
    }
}

