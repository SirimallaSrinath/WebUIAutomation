package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsDragDrop {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		
		act.clickAndHold(drag).release(drop).build().perform();
		Thread.sleep(2000);
	
	}

}
