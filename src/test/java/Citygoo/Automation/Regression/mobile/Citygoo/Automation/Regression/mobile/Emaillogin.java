package Citygoo.Automation.Regression.mobile.Citygoo.Automation.Regression.mobile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;


public class Emaillogin extends BaseSetup {
	@Test	
    public void EmailLoginTest() throws Exception {
    	
	   EmailLoginPage EmailLogin=new EmailLoginPage(driver);
	   EmailLogin.ClickLogin();
	   
	   //Inavlid user name and Invalid password(empty)
	   EmailLogin.LoginButton();   
	   EmailLogin.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Nom d'utilisateur, Mot de passe");   
	   EmailLogin.PopupOk();
	   
	   
	   //Valid Email id and empty password
	   EmailLogin.EnterEmail("anbarasuv@ihorsetechnologies.com");	   
	   EmailLogin.LoginButton();	   
	   EmailLogin.AssertWithoutAnyValue("Veuillez remplir tous les champs obligatoires: Mot de passe");	   
	   EmailLogin.PopupOk();
	   
	   
	   //Valid Email id and invalid password
	   EmailLogin.EnterEmail("anbarasuv@ihorsetechnologies.com");	   
	   EmailLogin.EnterPassword("456464464644");	   
	   EmailLogin.LoginButton(); 
	   EmailLogin.AssertWithoutAnyValue("Mauvais mot de passe");
	   EmailLogin.PopupOk();
	   
	   
	   //Invalid Email id and valid password
	   EmailLogin.EnterEmail("anbara@dfdffd.com");
	   EmailLogin.EnterPassword("123456");
	   EmailLogin.LoginButton();
	   EmailLogin.AssertWithoutAnyValue("Adresse e-mail invalide");
	   EmailLogin.PopupOk();
	   
	   //Valid user name and password 
	   EmailLogin.EnterEmail("anbarasuv@ihorsetechnologies.com");
	   EmailLogin.EnterPassword("123456");
	   EmailLogin.LoginButton();
   }
	

}
