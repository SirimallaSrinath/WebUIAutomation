package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWait2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		 */
		driver.findElement(By.linkText("Create an account")).click();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sirimalla.srianish@gmail.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))).sendKeys("sirimalla.srianish@gmail.com");
		
	}

}
