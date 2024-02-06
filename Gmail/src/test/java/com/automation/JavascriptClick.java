package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class JavascriptClick {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Using WebElement click perform
		WebElement clk = driver.findElement(By.xpath("//input[@id = 'searchBtn']"));
		//clk.click();
		
		//Using JavaScript click perform
		JavascriptExecutor jce = (JavascriptExecutor)driver;
		//jce.executeScript("document.getElementById('searchBtn').click()");
		jce.executeScript("arguments[0].click()", clk);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}

}
