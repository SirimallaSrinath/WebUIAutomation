package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptWebElementHighlight {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thepancard.com/newpancard.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jce = (JavascriptExecutor)driver;
		jce.executeScript("document.getElementById('txtDOB').style.border = '5px solid red'");
		Thread.sleep(2000);
		jce.executeScript("document.getElementById('txtDOB').style.background = 'Green'");
		Thread.sleep(2000);
		driver.close();
	}

}
