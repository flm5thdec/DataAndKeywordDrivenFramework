package smoke;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateRegistrationUsingDataProvider extends BaseTest {
	
	@Test(dataProvider = "getTestData")
	public void validateRegistrationTest(HashMap<String, String> testDataMap)
	{
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.launchApp();
		
		app.click("newUserRegister_linktext");
		
		app.verifyTitle(testDataMap.get("expTitle"));
		
		app.type("register_username_textbox", testDataMap.get("username"));
		
		app.type("register_password_textbox", testDataMap.get("password"));
		
		app.type("register_confirmPassword_textbox", testDataMap.get("confirm Password"));
		
		app.type("register_fullName_textbox",testDataMap.get("Full  Name") );
		
		app.type("register_email_textbox", testDataMap.get("email id"));
		
		app.type("register_captcha_textbox", testDataMap.get("captcha"));
		
		
		
		
		
	}
	
	@DataProvider
	public Object[][] getTestData()
	{
		
		Object [][] data=new Object[1][1];
		
		 data[0][0]=UtilKit.getTestDataFromExcel("TC-003");
		
		
		return data;
		
	}


}