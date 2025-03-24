package smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateRegistration extends BaseTest {
	
	@Test
	public void validateRegistrationTest()
	{
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.launchApp();
		
		app.click("newUserRegister_linktext");
		
		app.verifyTitle("Adactin.com - New User Registration");
		
		app.type("register_username_textbox", "kiran2403");
		
		app.type("register_password_textbox", "kiran123");
		
		app.type("register_confirmPassword_textbox", "kiran123");
		
		app.type("register_fullName_textbox", "Kiran Kumar");
		
		app.type("register_email_textbox", "kiran123@gmail.com");
		
		app.type("register_captcha_textbox", "India");
		
		
		
		
		
	}

}