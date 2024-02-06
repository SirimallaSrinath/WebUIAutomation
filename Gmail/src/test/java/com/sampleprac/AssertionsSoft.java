package com.sampleprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsSoft {

	@Test	
	public void assertSoftMethods() throws Exception{
		SoftAssert softassert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		
		softassert.assertNull(driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		softassert.assertNotNull(driver);
		driver.get("https://restfulapi.net/");
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "SRI KRISHNA";
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		driver.navigate().to("https://www.getpancard.com/apply-new-pan-card-online");

		WebElement gender = driver.findElement(By.id("rblGender_1"));
		gender.click();
		Boolean src = gender.isSelected();
		Thread.sleep(2000);
		softassert.assertTrue(src);
		softassert.assertAll();

	}

}
