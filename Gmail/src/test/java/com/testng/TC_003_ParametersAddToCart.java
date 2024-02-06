package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003_ParametersAddToCart {
	
private WebDriver driver = null;
	
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		//openBrowser
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	}

	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String un,String pw) throws Exception{
		//login
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void addToCart() throws Exception{
		//addToCart
				driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
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
