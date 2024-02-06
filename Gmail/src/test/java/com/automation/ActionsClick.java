package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsClick {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h5[text()='New to Timesjobs?']")).click();
		//Element not click able as it is a mouse action
		
		WebElement tjob = driver.findElement(By.xpath("//h5[text()='New to Timesjobs?']"));
		
		Actions action = new Actions(driver);
		action.click(tjob).perform();
		
		
	}

}
