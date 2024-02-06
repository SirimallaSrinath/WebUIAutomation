package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ForEach {
	
	public static void main(String[] args) {
		
		String[] records = new String[3]; 
		
		for(String ehrd:records) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://restfulapi.net/");
			driver.close();
		}
		
	}

}
