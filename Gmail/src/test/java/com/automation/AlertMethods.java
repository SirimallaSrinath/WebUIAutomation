package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertMethods {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.id("j_idt88:j_idt91")).click();
	    Thread.sleep(2000);
		Alert ASC = driver.switchTo().alert();
		System.out.println("Alert Info : "+ASC.getText());
		ASC.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id = 'simple_result']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert APD = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(APD.getText());
		APD.sendKeys("Srinath");
		Thread.sleep(5000);
		APD.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText());
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert APDD = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(APDD.getText());
		APDD.dismiss();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText());
	}

}
