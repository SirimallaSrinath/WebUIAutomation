package com.practicea;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsElement {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.findElement(By.name("fromPlaceName")).sendKeys("KARIMNAGAR");
		Thread.sleep(5000);
		driver.findElement(By.name("fromPlaceName")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("SIDDIPET");
		Thread.sleep(5000);
		driver.quit();
	}

}
