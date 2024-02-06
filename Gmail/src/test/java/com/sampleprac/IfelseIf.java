package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfelseIf {
	
	public static void main(String[] args) {
		
		System.out.println("START");
		
		String browser = "chrome";
		
		WebDriver driver = null;
		
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		/*
		 * else if(browser.equals("firefox")) { driver = new FirefoxDriver(); } else
		 * if(browser.equals("chrome")){ driver = new ChromeDriver(); }
		 */
		
		driver.get("https://restfulapi.net/");
		driver.close();
		System.out.println("END");
	}

}
