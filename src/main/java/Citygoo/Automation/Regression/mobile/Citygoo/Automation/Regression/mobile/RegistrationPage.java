package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegistrationPage extends BaseSetup {
	public RegistrationPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		WelcomeScreenPage.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(id = "registerAccount")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement Registerbutton;
	@AndroidFindBy(id = "connect")
	MobileElement Loginbutton;
	@AndroidFindBy(id = "etFirstName")
	MobileElement FirstName;
	@AndroidFindBy(id = "etLastName")
	MobileElement LastName;
	@AndroidFindBy(id = "etEmail")
	MobileElement EmailId;
	@AndroidFindBy(id = "etEmailConfirmation")
	MobileElement ConfirmEmail;
	@AndroidFindBy(id = "etPhone")
	MobileElement PhoneNumber;
	@AndroidFindBy(id = "etPassword")
	MobileElement Password;
	@AndroidFindBy(id = "etPasswordConfirmation")
	MobileElement ConfirmPassword;
	@AndroidFindBy(id = "etSponsorshipCode")
	MobileElement PromoCode;
	@AndroidFindBy(id = "cbFemale")
	MobileElement FemaleSelect;
	@AndroidFindBy(id = "cbMale")
	MobileElement MaleSelect;
	@AndroidFindBy(id = "rbPassenger")
	MobileElement PassengerSelect;
	@AndroidFindBy(id = "rbDriver")
	MobileElement DriverSelect;
	@AndroidFindBy(id = "ibHelp")
	MobileElement HelpSelect;
	@AndroidFindBy(id = "webView")
	MobileElement WebViewDisplay;
	@AndroidFindBy(id = "title")
	MobileElement WebViewTitle;
	@AndroidFindBy(id = "btnValidate")
	MobileElement PassengerValider;
	@AndroidFindBy(id = "btnCgu")
	MobileElement CGULink;
	@AndroidFindBy(id = "etName")
	MobileElement BrandName;
	@AndroidFindBy(id = "etModel")
	MobileElement ModelName;
	@AndroidFindBy(id = "etYear")
	MobileElement ModelYear;
	@AndroidFindBy(id = "etColor")
	MobileElement CarColor;
	@AndroidFindBy(id = "etPlateNumber")
	MobileElement RegistrationNumber;
	@AndroidFindBy(id = "message")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement PopupMessage;
	
	@AndroidFindBy(id = "button1")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement PopupButton;
	
	@AndroidFindBy(id = "rbDriver")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement SelectDriver;
	
	@AndroidFindBy(id = "rbPassenger")
	// @iOSFindBy(id = "recoverPassword")
	MobileElement SelectPassenger;
	
	

	public void ClickRegistration() {
		//Click on the registration button from Welcome screen
		Registerbutton.click();
	}

	public void EnterFirstName(String Firstname) {
		//enter First name
		FirstName.clear();
		FirstName.sendKeys(Firstname);

	}

	public void EnterSecondName(String SecondName) {
		//Enter second name
		LastName.clear();
		LastName.sendKeys(SecondName);
	}

	public void EnterPassword(String password) {
		//Enter password
		Password.clear();
		Password.sendKeys(password);
	}

	public void EnterConfrimPassword(String confirmpassword) {
		//Enter confirmation password
		ConfirmPassword.clear();
		ConfirmPassword.sendKeys(confirmpassword);
	}

	public void EnterEmail(String emailid) {
		EmailId.clear();
		EmailId.sendKeys(emailid);
	}

	public void EnterConfirmEmailId(String confirmemailid) {
		ConfirmEmail.clear();
		ConfirmEmail.sendKeys(confirmemailid);
	}

	public void EnterPhoneNumber(String phonenumber) {
		PhoneNumber.clear();
		PhoneNumber.sendKeys(phonenumber);
	}

	public void EnterPromoCode(String promocode) {
		PromoCode.clear();
		PromoCode.sendKeys(promocode);
	}

	public void SelectFemale() {
		FemaleSelect.click();
	}

	public void SelectMale() {
		MaleSelect.click();
	}

	public void PassengerSelect() {
		PassengerSelect.click();
	}

	public void DriverSelect() {
		DriverSelect.click();
	}

	public void HelpSelect() {
		HelpSelect.click();
	}

	public void CGUClick() {
		CGULink.click();

	}

	public void AssertitleofCGU() {
		Assert.assertTrue(WebViewTitle.isDisplayed(), "Webview Oppened correctly");
	}

	public void PassengerValidation() {
		PassengerValider.click();
	}

	public void EnterBrandName(String brandname) {
		BrandName.clear();
		BrandName.sendKeys(brandname);
	}

	public void EnterBrandModel(String brandmodel) {
		ModelName.clear();
		ModelName.sendKeys(brandmodel);
	}

	public void EnterModelYear(String modelyear) {
		ModelYear.clear();
		ModelYear.sendKeys(modelyear);
	}

	public void EnterCarColor(String carcolor) {
		CarColor.clear();
		CarColor.sendKeys(carcolor);
	}

	public void EnterRegistrationNumber(String registrationnumber) {
		RegistrationNumber.clear();
		RegistrationNumber.sendKeys(registrationnumber);

	}

	public void backbutton() {
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);

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
	
	public void SelectDriver()
	{
		SelectDriver.click();
	}
	
	public void SelectPassenger()
	{
		SelectPassenger.click();
	}
}
