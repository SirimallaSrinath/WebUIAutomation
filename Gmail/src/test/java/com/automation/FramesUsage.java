package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesUsage {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//		driver.switchTo().frame(0);
		//		driver.findElement(By.xpath("//button[@id = 'Click']")).click();
		//		Thread.sleep(3000);

		WebElement frameo = driver.findElement(By.xpath("//iframe[@src = 'default.xhtml']"));
		driver.switchTo().frame(frameo);
		driver.findElement(By.xpath("//button[@id = 'Click']")).click();
		Thread.sleep(3000);
		


	}

}
