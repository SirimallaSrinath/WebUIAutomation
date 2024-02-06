package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsMouseOver {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cypress.io/");
		driver.manage().window().maximize();
		WebElement linkdoc = driver.findElement(By.xpath("//button[@id = 'dropdownDocs']"));
		Actions actlinkdoc = new Actions(driver);
		actlinkdoc.moveToElement(linkdoc).build().perform();
		Thread.sleep(2000);
	}

}
