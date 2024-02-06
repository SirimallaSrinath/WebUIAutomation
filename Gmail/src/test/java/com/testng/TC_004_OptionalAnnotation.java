package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class TC_004_OptionalAnnotation {

	private WebDriver driver = null;
	
	
	@Test
	public void openBrowser(@Optional("chrome")String browser) throws Exception{
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;
		}

		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.close();
	}

}
