package com.orange.core;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserScript {

	protected WebDriver driver = null;

	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		switch(browser.toLowerCase()) {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	}
	
	@AfterTest
	public void closeBrowser() throws Exception{
		Thread.sleep(2000);
		driver.quit();
	}

}
