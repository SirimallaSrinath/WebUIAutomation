package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AssertionsHard {
	@Test
	public void assertMethods() throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		Assert.assertNull(driver);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		Assert.assertNotNull(driver);
		driver.get("https://restfulapi.net/");
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "What is REST?: REST API Tutorial";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.navigate().to("https://www.getpancard.com/apply-new-pan-card-online");
		
		WebElement gender = driver.findElement(By.id("rblGender_1"));
		gender.click();
		Boolean src = gender.isSelected();
		Thread.sleep(2000);
		Assert.assertTrue(src);
		
	}

}
