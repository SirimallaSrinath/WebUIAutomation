package com.practicea;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class FileUploadRobot {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		
		Actions action = new Actions(driver);
		action.click(uploadfile).build().perform();
		Thread.sleep(2000);
		StringSelection selection = new StringSelection("C:\\Users\\HP\\Desktop\\Jio Phone Number.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

}
