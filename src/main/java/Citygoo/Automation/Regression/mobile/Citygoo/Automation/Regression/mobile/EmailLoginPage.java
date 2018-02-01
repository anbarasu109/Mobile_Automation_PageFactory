package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EmailLoginPage {

	public EmailLoginPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		WelcomeScreenPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "connect")
	MobileElement Loginbutton;
	@AndroidFindBy(id = "email")
	MobileElement emailLogin;
	@AndroidFindBy(id = "password")
	MobileElement password;
	@AndroidFindBy(id = "login")
	MobileElement Login;
	@AndroidFindBy(id = "message")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement PopupMessage;
	@AndroidFindBy(id = "button1")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement PopupButton;

	public void ClickLogin() {
		Loginbutton.click();
	}

	public void EnterEmail(String Username) {
		emailLogin.clear();
		emailLogin.sendKeys(Username);
	}

	public void EnterPassword(String PassWord) {
		password.clear();
		password.sendKeys(PassWord);
	}

	public void LoginButton() {
		Login.click();
	}
	
	public void AssertWithoutAnyValue(String Expected)
	{
		
		String actual=PopupMessage.getText();
		Assert.assertEquals(actual, Expected);
	}
	public void PopupOk()
	{
		PopupButton.click();
	}

}
