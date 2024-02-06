package com.sampleprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExec2 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		//driver.get("https://emicalculator.net/");
		/*
		 * driver.findElement(By.xpath("//input[@id='loaninterest']")).clear();
		 * driver.findElement(By.xpath("//input[@id='loaninterest']")).sendKeys("12");
		 */

		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("location = 'https://emicalculator.net/'");
		Thread.sleep(3000);
		executor.executeScript("document.getElementById('loaninterest').value = '18'");;


	}

}
