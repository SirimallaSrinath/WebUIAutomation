package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptURLTitle {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/");
		
		// Load URL with Javascript
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("location = 'https://www.selenium.dev/'");
		
		// Get Title name without selenium methods
		System.out.println("Title : "+jse.executeScript("return document.title"));
		
		//Get Page url wihtout selenium methods
		System.out.println("Page URL : "+jse.executeScript("return document.URL"));
		
		// page forward backward refresh without navigate selenium method
		jse.executeScript("history.back()");
		
		Thread.sleep(2000);
		jse.executeScript("history.forward()");
		Thread.sleep(2000);
		jse.executeScript("history.go(0)");
		Thread.sleep(2000);
	}

}
