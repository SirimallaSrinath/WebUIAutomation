package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleMulitpleWindows {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cypress.io/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(5000);
		Set<String> wh = driver.getWindowHandles();
		List<String> who = new ArrayList<String>(wh);
		
		driver.switchTo().window(who.get(1));
		driver.findElement(By.xpath("(//span[@class='pull-left'])[4]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
