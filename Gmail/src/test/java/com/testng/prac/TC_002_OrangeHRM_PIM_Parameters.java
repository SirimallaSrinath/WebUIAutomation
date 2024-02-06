package com.testng.prac;

import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_OrangeHRM_PIM_Parameters {

	private WebDriver driver = null;

	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		switch (browser) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;
		}

		//		if(browser.equals("chrome")) {
		//			WebDriverManager.chromedriver().setup();
		//			driver = new ChromeDriver();
		//			driver.manage().window().maximize();
		//			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		//			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		//		}
		//		else if(browser.equals("edge")) {
		//			WebDriverManager.edgedriver().setup();
		//			driver = new EdgeDriver();
		//			driver.manage().window().maximize();
		//			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		//			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		//		}
	}

	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String un,String pw) throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void PIM() throws Exception{
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void logout() throws Exception{
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
