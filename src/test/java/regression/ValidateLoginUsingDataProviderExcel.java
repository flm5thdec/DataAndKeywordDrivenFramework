package regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateLoginUsingDataProviderExcel extends BaseTest  {
	
	@Test(description="To validate login ",dataProvider="getTestData")
	public void validateLoginTest1(HashMap<String, String> testDataMap)
	{
		System.out.println(testDataMap.get("username"));
		System.out.println(testDataMap.get("password"));
		System.out.println(testDataMap.get("expTitle"));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testDataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(testDataMap.get("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), testDataMap.get("expTitle"));
		
			
	}
	
	
	@DataProvider
	public Object[][] getTestData()
	{
		
		Object [][] data=new Object[1][1];
		
		 data[0][0]=UtilKit.getTestDataFromExcel("TC-001");
		
		
		return data;
		
	}


}
