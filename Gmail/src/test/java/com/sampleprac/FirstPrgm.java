package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class FirstPrgm {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.get("https://www.lambdatest.com/");
		String pagetitle = driver.getTitle();
		System.out.println("Page Title : "+pagetitle);
		System.out.println("Page Url :"+driver.getCurrentUrl());
		//System.out.println("Page Source details : "+driver.getPageSource());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://kubernetes.io/");
		Thread.sleep(2000);
		driver.quit();
	}

}
