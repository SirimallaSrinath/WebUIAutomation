package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		 */
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement mousedclick = driver.findElement(By.xpath("//span[text()='Double click the block']/preceding-sibling::div"));
		Actions mdc = new Actions(driver);
		Thread.sleep(5000);
		mdc.doubleClick(mousedclick).build().perform();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
