package com.testng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005_Dataprovider {
	
	private WebDriver driver = null;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "getTestData" )
	public void login(String username,String password) throws Exception{
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "getTestData")
	public String[][] getTestData() {
		String[][] data = new String[3][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";
		data[1][0] = "standard_user";
		data[1][1] = "secret_sauce";
		data[2][0] = "problem_user";
		data[2][1] = "secret_sauce";
		
		return data;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
}
