package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadRobot1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.foundit.in/");
		// Click on Upload Resume
		driver.findElement(By.xpath("//div[@class = 'heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		WebElement FileUpload = driver.findElement(By.xpath("//input[@id = 'file-upload']"));
		Thread.sleep(2000);
		FileUpload.sendKeys("C:\\Users\\Srinath\\Downloads\\resume.docx");
		Thread.sleep(2000);
		
	}
	

}
