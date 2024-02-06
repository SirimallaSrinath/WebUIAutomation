package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ForLopp {
	
	public static void main(String[] args) {
		//Chrome Browser
		String browser = "chrome";
		
		for(int index = 1;index<=3;index++) {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://restfulapi.net/");
				driver.close();
			}
		}
		
		
	}

}
