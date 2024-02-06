package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calendar2 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		WebElement monthpick = driver.findElement(By.xpath("//Select[@class='ui-datepicker-month']"));
		Select select = new Select(monthpick);
		//select.selectByIndex(1);
		//select.selectByVisibleText("Apr");
		select.selectByValue("4");
		
	}

}
