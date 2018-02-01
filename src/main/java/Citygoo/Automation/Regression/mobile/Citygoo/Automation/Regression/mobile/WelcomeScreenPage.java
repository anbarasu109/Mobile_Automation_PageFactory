package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WelcomeScreenPage extends BaseSetup {
	
	

	public WelcomeScreenPage(AppiumDriver driver) {

		WelcomeScreenPage.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		

	}



	@AndroidFindBy(id = "connect")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement Loginbutton;

	@AndroidFindBy(id = "registerAccount")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement Registerbutton;

	@AndroidFindBy(id = "recoverPassword")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement ResetPasswordbutton;
	

	
	
	

	public void ClickLogin() {
		waitforElement(Loginbutton);
		Loginbutton.click();
	}

	public void ClickRegistration() {
		// driver.findElement(By.id("registerAccount")).click();
		waitforElement(Registerbutton);
		Registerbutton.click();
	}

	public void Resetpassword() {
		waitforElement(ResetPasswordbutton);
		ResetPasswordbutton.click();
	}

	public void backbutton() {
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
	}

	public void waitforElement(WebElement element) {
		// WebDriverWait wait = new WebDriverWait(driver,1000);
		// wait.until(ExpectedConditions.visibilityOf(Loginbutton));
	}
	

}
