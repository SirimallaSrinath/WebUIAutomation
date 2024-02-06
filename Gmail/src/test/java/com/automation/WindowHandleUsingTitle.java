package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class WindowHandleUsingTitle {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cypress.io/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Log In")).click();
		Set<String> wh = driver.getWindowHandles();
		for(String Window1:wh) {
			//if(driver.switchTo().window(Window1).getTitle().equals("cypress.io")) {

			if(driver.switchTo().window(Window1).getCurrentUrl().equals("https://cloud.cypress.io/login")) {
				break;
			}
		}
		driver.findElement(By.xpath("(//span[@class='pull-left'])[4]")).click();
		Thread.sleep(2000);

	}

}
