package com.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ActionsMouse {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//h5[text()='New to Timesjobs?']")).click();
		//WebElement not clickable as it is routing to Window.
		
		WebElement we = driver.findElement(By.xpath("//h5[text()='New to Timesjobs?']"));
		Actions action =  new Actions(driver);
		action.click(we).build().perform();
		
	}

}
