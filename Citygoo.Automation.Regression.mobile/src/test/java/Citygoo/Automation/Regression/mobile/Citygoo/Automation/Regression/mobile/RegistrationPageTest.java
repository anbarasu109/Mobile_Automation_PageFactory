package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;

import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseSetup {

	@Test
	public void RegistrationTest() throws Exception {

		RegistrationPage registrationpage = new RegistrationPage(driver);
		
		//navigate to registration page
		registrationpage.ClickRegistration();
		
		//Click on validation to check the validation message
		registrationpage.PassengerValidation();
		
		//Assertion check for popup message wihtout enter the value
		registrationpage.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Prénom, Nom, Email, Numéro de téléphone, Mot de passe");
		
		//Click on popup OK 
		registrationpage.PopupOk();
		
		//Enter the First name
		registrationpage.EnterFirstName("Automation");
		
		//Click on validation to check the validation message
		registrationpage.PassengerValidation();
				
		//Assertion check for popup message after enter the first name
		registrationpage.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Nom, Email, Numéro de téléphone, Mot de passe");
				
		//Click on popup OK 
		registrationpage.PopupOk();
		
		//Enter the second name
		registrationpage.EnterSecondName("Mobile");
		
		//Click on validation to check the validation message
		registrationpage.PassengerValidation();
						
		//Assertion check for popup message after enter the first name and second name
		registrationpage.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Email, Numéro de téléphone, Mot de passe");
						
		//Click on popup OK 
		registrationpage.PopupOk();
		
		//Enter the mail id
		String Email="Automation@t.com";
		registrationpage.EnterEmail(Email);
		
		//Enter confirmation mail id
		registrationpage.EnterConfirmEmailId(Email);
		
		//Click on validation to check the validation message
		registrationpage.PassengerValidation();
						
		//Assertion check for popup message after enter the first name and second name and mail
		registrationpage.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Numéro de téléphone, Mot de passe");
						
		//Click on popup OK 
		registrationpage.PopupOk();		
		
		//Enter mobile number
		registrationpage.EnterPhoneNumber("9631245898");
		
		registrationpage.PassengerValidation();
		
		//Assertion check for popup message after enter the first name, second name, mail,number
		registrationpage.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Mot de passe");
						
		//Click on popup OK 
		registrationpage.PopupOk();	
		
		//Enter the password
		int password=123456;
		String pass=Integer.toString(password);
		registrationpage.EnterPassword(pass);
		
		registrationpage.PassengerValidation();
		
		//Assertion check for popup message after enter the first name, second name, mail,number,password
		registrationpage.AssertWithoutAnyValue("Les emails ne correspondent pas, veuillez corriger svp");
						
		//Click on popup OK 
		registrationpage.PopupOk();			
		
		//Enter the wrong password in confirmation password
		registrationpage.EnterPassword("1234");
		
		registrationpage.PassengerValidation();
		
		//Assertion check for popup message after enter the first name, second name, mail,number,password
		registrationpage.AssertWithoutAnyValue("Les emails ne correspondent pas, veuillez corriger svp");
						
		//Click on popup OK 
		registrationpage.PopupOk();	
		
		//Enter correct password in confirmation password 
		registrationpage.EnterConfrimPassword(pass);
		
		registrationpage.EnterPromoCode("Testpromo");
		
		registrationpage.SelectMale();
		
		registrationpage.SelectFemale();
		
		registrationpage.HelpSelect();
		
		registrationpage.backbutton();
		
		registrationpage.SelectDriver();
		
		registrationpage.SelectPassenger();
		
		registrationpage.SelectDriver();
		
		registrationpage.PassengerValidation();
		
		registrationpage.EnterBrandName("Audi");
		
		registrationpage.EnterBrandModel("RS6 Avant");
		
		registrationpage.EnterModelYear("2016");
		
		registrationpage.EnterCarColor("Black");
		
		registrationpage.EnterRegistrationNumber("PY 01 CC 9266"); 
		
		
	}	

}
