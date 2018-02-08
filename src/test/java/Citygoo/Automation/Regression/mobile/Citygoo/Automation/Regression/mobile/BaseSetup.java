package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseSetup {

	public URL url1;
	public static AppiumDriver driver = null;
	public static String platform = "iOS";

	@BeforeSuite
	public void initdriver() throws Exception {
		if (platform.equalsIgnoreCase("ANDROID")) {
			File androidApp = new File("/Users/mobileapps/Desktop/bugreport/build/app-local-debug.apk");
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability("fullReset", true);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			capabilities.setCapability(MobileCapabilityType.APP, androidApp.getAbsolutePath());
			capabilities.setCapability("appActivity", ".common.activities.NavigationMenuActivity_");
			capabilities.setCapability("appPackage", "com.citygoo");
			// capabilities.setCapability("automationName","UiAutomator2");
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			
		} else {
			File androidApp = new File("/Users/mobileapps/Desktop/bugreport/build/iOS/Citygoo.ipa");
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			capabilities.setCapability("fullReset", true);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.1.2");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ipad 4");
			capabilities.setCapability(MobileCapabilityType.APP, androidApp.getAbsolutePath());
			//capabilities.setCapability("appActivity", ".common.activities.NavigationMenuActivity_");
			capabilities.setCapability("appPackage", "fr.citygoo.citygoo");
			// capabilities.setCapability("automationName","UiAutomator2");
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}

	}

	 @AfterSuite
	 public void tearDown() {
	 BaseSetup.driver.quit();
	 }

}
