package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SyncExplicitWait3 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'searchBtn']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}

}
