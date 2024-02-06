package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethds {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		 */
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String sinfo = alert.getText();
		System.out.println("Alert warning info: "+sinfo);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Thread.sleep(3000);
		Alert confirdig = driver.switchTo().alert();
		confirdig.dismiss();
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(2000);
		Alert prompalt = driver.switchTo().alert();
		prompalt.sendKeys("Hello World");
		Thread.sleep(5000);
		prompalt.accept();
		driver.close();
		
	}

}
