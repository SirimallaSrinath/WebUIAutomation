package com.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollIntoViewJSE {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor executor = ((JavascriptExecutor)driver);
		executor.executeScript("document.getElementsByName('submit')[0].scrollIntoView()");
		Thread.sleep(3000);
		WebElement scwe = driver.findElement(By.xpath("//input[@name = 'submit']"));
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Srinath\\Downloads\\screenshot\\img1.PNG");
		FileHandler.copy(source, desti);
		
		
	} 

}
