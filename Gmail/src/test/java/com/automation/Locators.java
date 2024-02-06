package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.name("fromPlaceName")).sendKeys("Jagtial");
		//driver.findElement(By.xpath("//input[@name = 'fromPlaceName']")).sendKeys("hyderabad");
		
		driver.findElement(By.cssSelector("input[name = 'fromPlaceName']")).sendKeys("chennai");
		Thread.sleep(3000);
		driver.close();
	}

}
