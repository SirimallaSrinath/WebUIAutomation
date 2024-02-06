package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptTextField {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id = 'loaninterest']")).clear();
		//driver.findElement(By.xpath("//input[@id = 'loaninterest']")).sendKeys("11.5");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('loaninterest').value='11.5'");
		Thread.sleep(2000);
		driver.close();
	}

}
