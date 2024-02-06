package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar1 {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'first_date_picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[4]//td[5]")).click();
		//Second Calendar of Previous month of one click
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Prev")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[3]//td[3]")).click();
		Thread.sleep(3000);
		//second calendar month change to June of 22nd date
		for(int i = 7;i>=1;i--) {
			driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
	
			driver.findElement(By.linkText("Prev")).click();
			Thread.sleep(2000);
			String m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(m.equals("June")) {
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[4]//td[5]")).click();
				break;
			}
		}
		
	}
}
