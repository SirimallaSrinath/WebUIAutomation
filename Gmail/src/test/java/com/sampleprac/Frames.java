package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Frames {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		WebElement framefirst = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(framefirst);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//WebElement framesecond = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Count Frames']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement frameinn = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(frameinn);
		//WebElement frameinn1 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
