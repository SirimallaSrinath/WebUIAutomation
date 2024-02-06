package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SyncExplicitWait2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign up")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'email']")));
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("SRIANAGHA.SIRIMALLA@GMAIL.COM");
		
	}

}
