package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDrop {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement framedemo = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framedemo);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions dragdrop = new Actions(driver);
		Thread.sleep(2000);
		//dragdrop.dragAndDrop(drag, drop).build().perform();
		dragdrop.clickAndHold(drag).release(drop).build().perform();
		
	}

}
