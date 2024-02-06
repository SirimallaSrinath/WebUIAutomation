package com.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Ifoneway {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		String browser = "chrome";
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/@RATANIT/videos");
			driver.manage().window().maximize();
			driver.close();
			
		}
		
		System.out.println("End");
	}

}
