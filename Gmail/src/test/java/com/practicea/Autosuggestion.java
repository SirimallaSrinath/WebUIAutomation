package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("playwright");
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class='G43f7e']/child::li[@class='sbct']//div[@class='pcTkSc']//div[contains(@class,'wM6W7d')]//span"));
		System.out.println("playright count: "+list.size());
		
		for(WebElement listec:list) {
			System.out.println(listec.getText());
		}
		
		for(WebElement eclist:list) {
			if(eclist.getText().contains("automation")) {
				eclist.click();
				break;
			}
		}
	}

}
