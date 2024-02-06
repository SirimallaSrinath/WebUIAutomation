package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class ActionsMouseOver {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cypress.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement doc = driver.findElement(By.xpath("//a[@id='dropdownDocs']"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(doc).build().perform();
		driver.findElement(By.xpath("//a[text()='API']")).click();;
	}

}
