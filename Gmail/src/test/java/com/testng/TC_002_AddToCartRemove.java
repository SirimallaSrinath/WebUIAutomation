package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_AddToCartRemove {
	
	private WebDriver driver = null;
	
	@BeforeTest
	public void openBrowser(){
		//open browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	}
	@BeforeMethod
	public void login() {
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(priority = 1)
	public void addToCart() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void removeFromCart() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn_secondary btn_inventory']")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void logoutBrowser() throws Exception{
		driver.findElement(By.xpath("//div[@class ='bm-burger-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id ='logout_sidebar_link']")).click();
	}
	@AfterTest
	public void closeBrowser() throws Exception{
		Thread.sleep(2000);
		driver.close();
	}
}
