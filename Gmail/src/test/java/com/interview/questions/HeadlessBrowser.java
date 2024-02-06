package com.interview.questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions option = new
		 * ChromeOptions(); option.setHeadless(true);
		 * System.out.println(option.getBrowserName()); WebDriver driver = new
		 * ChromeDriver(option); driver.get("https://www.carwale.com/");
		 * System.out.println(driver.getTitle()); driver.close();
		 */

		WebDriverManager.edgedriver().setup();

		EdgeOptions opt = new EdgeOptions(); 
		opt.setHeadless(true);

		WebDriver driver = new EdgeDriver(opt);
		driver.get("https://www.carwale.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
