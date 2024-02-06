package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_001_RemoveFromCart {

	private WebDriver driver = null;
	
	@BeforeTest
	public void openBrowser() {
		//openBrowser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	}

	@BeforeMethod
	public void login() throws Exception{
		//login
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void removeFromCart() throws Exception{
		//removeFromCart
				driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@class='btn_secondary btn_inventory']")).click();
				Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logout() throws Exception{
		//logout
				driver.findElement(By.xpath("//div[@class ='bm-burger-button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id ='logout_sidebar_link']")).click();
				Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeBrowser(){
		//close browser
		
		driver.close();

	}


}
