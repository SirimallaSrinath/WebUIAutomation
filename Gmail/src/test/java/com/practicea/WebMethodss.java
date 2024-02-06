package com.practicea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMethodss {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://erail.com/");
		System.out.println("Page Title : "+driver.getTitle());
		System.out.println("Url address: "+driver.getCurrentUrl());
		System.out.println("Page Source: "+driver.getPageSource());
		Thread.sleep(5000);
		//driver.switchTo().newWindow(WindowType.TAB).get("https://selenium-by-arun.blogspot.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://datatables.net/");
		Thread.sleep(5000);
		driver.quit();
	}

}
