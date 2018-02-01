package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WelcomeScreen extends BaseSetup {

	@Test
	public void WelcomescreenTest() throws Exception {

		WelcomeScreenPage welcompage = new WelcomeScreenPage(driver);
		welcompage.ClickLogin();
		welcompage.backbutton();
		welcompage.ClickRegistration();
		welcompage.backbutton();
		welcompage.Resetpassword();
		welcompage.backbutton();
	}

}
