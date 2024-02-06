package com.practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class FileUploadRobot {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.findElement(By.xpath("//div[@class = 'heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(2000);
		WebElement Fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions action = new Actions(driver);
		action.click(Fileupload).build().perform();
		Thread.sleep(2000);
		StringSelection stringdata = new StringSelection("C:\\Users\\Srinath\\Downloads\\resume.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringdata, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.setAutoDelay(2000);
	}

}
