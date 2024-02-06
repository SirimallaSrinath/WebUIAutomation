package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SelectClassMethods {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UIAT = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select UIATS = new Select(UIAT);
		System.out.println("Mutiple Selection : "+UIATS.isMultiple());
		UIATS.selectByIndex(2);
		Thread.sleep(2000);
		UIATS.selectByVisibleText("Puppeteer");
		Thread.sleep(2000);
		System.out.println("Total Automation Tools Count :"+UIATS.getOptions().size());
				
	}
}
