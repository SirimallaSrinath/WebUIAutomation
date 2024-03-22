package com.orange.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.core.BrowserScript;
import com.orange.helper.ExcelHelper;
import com.orange.screens.AdminPage;
import com.orange.screens.HomePage;
import com.orange.screens.LoginPage;

public class TC_002_AdminSelect extends BrowserScript{
	@Test(dataProvider = "getExcelData")
	public void adminSelect(String username,String password) throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.link_Mainmenu_Admin();
		Thread.sleep(2000);
		AdminPage admin = new AdminPage(driver); 
		admin.select_dd_Admin();
		Thread.sleep(2000);
		admin.clickProfilePicture_admin();
	}
	
	@DataProvider(name="getExcelData")
	public String[][] getExcelData() throws Exception{
		return ExcelHelper.getTestData("C:\\Automation Workspace\\OrangeHRM\\Testdata\\Testdata.xlsx", "Sheet1");
	}

}
