package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WhileLoop {

	public static void main(String[] args) {

		String browser = "chrome";
		
		WebDriver driver = null;
		
		while(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://restfulapi.net/");
		driver.close();
		

	}

}
