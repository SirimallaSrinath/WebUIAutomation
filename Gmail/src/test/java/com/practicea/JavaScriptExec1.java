package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExec1 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("location='https://www.selenium.dev/'");
		System.out.println(executor.executeScript("return document.title"));
		System.out.println(executor.executeScript("return document.URL"));
		Thread.sleep(2000);
		executor.executeScript("location='https://www.google.com'");
		Thread.sleep(2000);
		executor.executeScript("history.back()");
		executor.executeScript("history.go(0)");
		
		executor.executeScript("location='https://emicalculator.net/'");
		Thread.sleep(2000);
		executor.executeScript("document.getElementById('loaninterest').value = 11.5");
		executor.executeScript("document.getElementById('loaninterest').style.border='2px solid red'");
		executor.executeScript("document.getElementById('loaninterest').style.background = 'green'");
	}

}
