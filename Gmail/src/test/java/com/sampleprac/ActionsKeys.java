package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActionsKeys {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement volv = driver.findElement(By.xpath("//option[@value='volvo']"));
		WebElement audi = driver.findElement(By.xpath("//option[@value='audi']"));
		Actions keys = new Actions(driver);
		keys.keyDown(Keys.CONTROL);
		keys.click(volv);
		Thread.sleep(3000);
		keys.click(audi);
		Thread.sleep(2000);
		keys.keyUp(Keys.CONTROL);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("Webpage Title : "+driver.getTitle());
		driver.close();
	}

}
