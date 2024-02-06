package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SyncExplicitWait1 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.microfocus.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		driver.findElement(By.id("username")).sendKeys("SRI ANAGHA");
		
		
	}

}
