package com.practicea;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement langdpdw = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sellangdp = new Select(langdpdw);
		Thread.sleep(3000);
		sellangdp.selectByVisibleText("Puppeteer");
		Thread.sleep(2000);
		sellangdp.selectByIndex(2);
		
	}

}
