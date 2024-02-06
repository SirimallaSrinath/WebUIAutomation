package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec3 {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		JavascriptExecutor executor =  (JavascriptExecutor)driver;
		executor.executeScript("location = 'https://emicalculator.net/'");
		Thread.sleep(5000);
		executor.executeScript("document.getElementById('loanterm').value = '15'");
		Thread.sleep(3000);
		executor.executeScript("document.getElementById('loanterm').style.border = '5px solid Green'");
		Thread.sleep(3000);
		executor.executeScript("document.getElementById('loanterm').style.background = 'Yellow'");
		Thread.sleep(5000);
		executor.executeScript("document.getElementById('ecalprintandsharetext').scrollIntoView()");
}}
