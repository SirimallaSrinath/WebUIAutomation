package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActionsAutocash {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));		
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		WebElement fromplace = driver.findElement(By.id("fromPlaceName"));
		Actions fpa = new Actions(driver);
		fpa.sendKeys(fromplace, "GOA").perform();
		Thread.sleep(5000);
		//fpa.sendKeys(Keys.ARROW_DOWN).perform();
		fpa.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		fpa.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
