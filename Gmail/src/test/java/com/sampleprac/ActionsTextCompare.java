package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActionsTextCompare {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://text-compare.com/");
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("PlayWright - New Automation Tool");
		
		Actions keysact = new Actions(driver);
		
		//CNTL+A
		keysact.keyDown(Keys.CONTROL);
		keysact.sendKeys("A");
		keysact.keyUp(Keys.CONTROL);
		keysact.perform();
		
		//CNTL+C
		keysact.keyDown(Keys.CONTROL);
		keysact.sendKeys("C");
		keysact.keyUp(Keys.CONTROL);
		keysact.perform();
		
		//TAB
		
		keysact.keyDown(Keys.TAB);
		keysact.keyUp(Keys.TAB);
		keysact.perform();
		
		//CNTL+V
		keysact.keyDown(Keys.CONTROL);
		keysact.sendKeys("V");
		keysact.keyUp(Keys.CONTROL);
		keysact.perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text Matched!");
		}
		else {
			System.out.println("Text not Matched!");
		}
	}

}
