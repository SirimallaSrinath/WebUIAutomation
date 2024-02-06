package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Ifcondition {

	public static void main(String[] args) {

		System.out.println("START");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		String browser = "chrome";

		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://restfulapi.net/");
		}
		System.out.println("END");
		driver.close();
	}

}
