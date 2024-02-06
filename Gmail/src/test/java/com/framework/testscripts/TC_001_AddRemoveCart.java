package com.framework.testscripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alight.helper.ExcelReadData;
import com.framework.core.FrameworkScript;
import com.framework.helper.ExcelHelper;

public class TC_001_AddRemoveCart extends FrameworkScript{

	@Test(dataProvider = "getTestData")
	public void addRemove(String userName,String password) throws Exception {
		
		//Login
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys(userName);

		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);

		// Add to cart

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		Thread.sleep(2000);

		// Remove From Cart

		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

		Thread.sleep(2000);
		
		// Logout

		driver.findElement(By.id("react-burger-menu-btn")).click();

		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

	@DataProvider(name = "getTestData")
	public String[][] getTestData() throws Exception {
		return ExcelHelper.getTestData("C:\\Testdata.xlsx", "Sheet1");
	}
	

}
