package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		String SelTitle = driver.getTitle();
		System.out.println(SelTitle);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.switchTo().newWindow(WindowType.TAB).get("https://tirupatibalaji.ap.gov.in/#/login");
		Thread.sleep(7000);
		//driver.close();
		//Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.eclipse.org/downloads/");
		Thread.sleep(5000);
		driver.quit();

	}

}
