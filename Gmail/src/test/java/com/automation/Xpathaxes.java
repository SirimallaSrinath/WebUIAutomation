package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathaxes {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.findElement(By.xpath("//span[text()='Daily Quiz']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Daily Quiz']/following::span[text()='Doubt Clarification']/preceding::div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='j_idt109']/child::div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-12'][4]/descendant::textarea[@id='message']")).sendKeys("Srinath");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Send']/parent::button[@id='j_idt130']")).click();
	}
}
