package com.sampleprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchState {
	
	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		
		switch (browser){
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "chrome":	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		driver.get("https://restfulapi.net/");
		driver.close();
	}
}
