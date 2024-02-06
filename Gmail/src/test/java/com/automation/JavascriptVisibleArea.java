package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class JavascriptVisibleArea {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('submit')[0].scrollIntoView()");
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('submit')[0].click()");
		Thread.sleep(2000);
		driver.close();
		
	}

}
