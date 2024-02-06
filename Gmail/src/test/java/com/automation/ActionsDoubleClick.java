package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsDoubleClick {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByTagName('div')[0].scrollIntoView()");
		Thread.sleep(2000);
		WebElement divtag = driver.findElement(By.tagName("div"));
		Actions actdc = new Actions(driver);
		actdc.doubleClick(divtag).build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
