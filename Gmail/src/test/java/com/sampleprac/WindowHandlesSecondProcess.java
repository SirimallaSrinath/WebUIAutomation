package com.sampleprac;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesSecondProcess {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.get("https://www.cypress.io/");
		driver.findElement(By.xpath("//a[text()=\" Log In \"]")).click();
		
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String childwindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
		
		driver.findElement(By.xpath("//span[text()=\"email\"]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(mainwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\" Log In \"]")).click();
	}

}
