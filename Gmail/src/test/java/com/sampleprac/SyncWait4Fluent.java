package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SyncWait4Fluent {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		 */
		driver.get("https://github.com/login");
		driver.findElement(By.linkText("Create an account")).click();


		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));


		WebElement foo = wait.until(new Function<WebDriver, WebElement>() { 
			public WebElement apply(WebDriver driver) { 
				
				WebElement elem = driver.findElement(By.xpath("//input[@id='email']"));
				System.out.println("Searching for element");
				elem.sendKeys("Srianish.Sirimalla@gmail.com");
				System.out.println("Element Found!");
				return elem;
				
			} });



		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Srianish.Sirimalla@gmail.com");	
	}

}
