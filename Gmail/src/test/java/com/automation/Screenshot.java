package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('submit')[0].scrollIntoView()");
		Thread.sleep(3000);
		
		//WebElement Screenshot
		WebElement we = driver.findElement(By.xpath("//input[@name = 'submit']"));
		File source =  we.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Srinath\\Downloads\\screenshot\\image1.PNG");
		FileHandler.copy(source, destination);
		
		//Page Screenshot or browser screenshot
		File pagesource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File pagedestination = new File("C:\\Users\\Srinath\\Downloads\\screenshot\\image2.PNG");
		FileHandler.copy(pagesource, pagedestination);
		
		// Full page Screenshot using selenium shutterbug
		Shutterbug.shootPage(driver, Capture.FULL).save("C:\\Users\\Srinath\\Downloads\\screenshot\\FULLSCREEN.PNG");
		
	}

}
