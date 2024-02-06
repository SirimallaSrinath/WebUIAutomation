package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec1 {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		//driver.get("https://www.selenium.dev/");

		JavascriptExecutor executor =	(JavascriptExecutor)driver;
		executor.executeScript("location = 'https://www.selenium.dev/'");
		Thread.sleep(3000);
		System.out.println(executor.executeScript("return document.title"));
		System.out.println(executor.executeScript("return document.URL"));
		Thread.sleep(3000);
		
		executor.executeScript("history.back()");
		Thread.sleep(2000);
		executor.executeScript("history.forward()");
		Thread.sleep(2000);
		executor.executeScript("history.go(0)");
		
	}

}
