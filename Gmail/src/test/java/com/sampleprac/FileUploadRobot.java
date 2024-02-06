package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class FileUploadRobot {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		WebElement fileup = driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions actionclick = new Actions(driver);
		actionclick.click(fileup).perform();
		StringSelection copypath = new StringSelection("C:\\Users\\Srinath\\Downloads\\Professional Resume 2024.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copypath, null);
		Robot cntlv = new Robot();
		cntlv.keyPress(KeyEvent.VK_CONTROL);
		cntlv.keyPress(KeyEvent.VK_V);
		
		cntlv.keyRelease(KeyEvent.VK_CONTROL);
		cntlv.keyRelease(KeyEvent.VK_V);
		
		cntlv.keyPress(KeyEvent.VK_ENTER);
		cntlv.keyRelease(KeyEvent.VK_ENTER);
		
		cntlv.delay(5000);
		
	}

}
