package com.orange.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.core.BrowserScript;
import com.orange.helper.ExcelHelper;
import com.orange.screens.HomePage;
import com.orange.screens.LoginPage;

public class TC_001_PptLogin extends BrowserScript{

	@Test(dataProvider = "readExcel")
	public void PptLogin(String username, String password) throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		LoginPage login  = new LoginPage(driver);
		login.login(username,password);
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.clickProfilePicture();
		Thread.sleep(2000);
	}

	@DataProvider(name= "readExcel")
	public String[][] readExcel() throws Exception{
		return ExcelHelper.getTestData("C:\\Automation Workspace\\OrangeHRM\\Testdata\\Testdata.xlsx", "Sheet1");
	}

}
