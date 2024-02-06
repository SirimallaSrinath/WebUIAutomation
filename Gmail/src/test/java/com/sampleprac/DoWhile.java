package com.sampleprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DoWhile {
	
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		do {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://restfulapi.net/");
			driver.close();
		}
		while(browser.equals("chrome"));
			
			
		
	}

}
