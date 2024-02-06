package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SyncImplicitWait {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.microfocus.com/");
		//Webdriver wait until page completely loads for max of 5 mins
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		
		//Webdriver waits until Webelement detects or found for max of 5 mins
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("login")).click();
		driver.findElement(By.xpath("//input[@id = 'username' ]")).sendKeys("SRINATH");
		
	}

}
