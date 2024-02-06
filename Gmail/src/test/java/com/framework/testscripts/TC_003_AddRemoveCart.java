package com.framework.testscripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.helper.ExcelHelper;
import com.framework.screens.HomePage;
import com.framework.screens.LoginPage;
import com.framework.screens.LogoutPage;

public class TC_003_AddRemoveCart extends FrameworkScript{

	@Test(dataProvider = "getTestData")
	public void addRemove(String userName,String password) throws Exception {
		
		// launch URL
		driver.get("https://www.saucedemo.com/");

		//Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(userName,password);
		
		// Add & Remove from cart
		HomePage homePage = new HomePage(driver);
		homePage.transaction();

		
		// Logout
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.logout();
		
	}

	@DataProvider(name = "getTestData")
	public String[][] getTestData() throws Exception {
		return ExcelHelper.getTestData("C:\\Testdata.xlsx","Sheet1");
	}
	

}
