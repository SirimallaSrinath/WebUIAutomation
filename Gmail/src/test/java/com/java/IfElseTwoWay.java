package com.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseTwoWay {

	public static void main(String[] args) throws Exception{

		WebDriver driver = null;
		String browser = "chrome";
		if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.google.com/maps");
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
