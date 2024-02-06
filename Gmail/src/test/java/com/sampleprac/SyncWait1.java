package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWait1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://my.microfocus.com/");
		driver.findElement(By.partialLinkText("login")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SRI RAM");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("SRI RAM");
		
	}	
}
