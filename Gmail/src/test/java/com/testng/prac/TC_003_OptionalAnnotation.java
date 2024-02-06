package com.testng.prac;

import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003_OptionalAnnotation {

	WebDriver driver = null;

	@Test
	public void openBrowser(@Optional("chrome")  String Browser) throws Exception{


		switch(Browser) { 
		case "chrome": 
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


		/*
		 * if(Browser.equals("chrome")) { WebDriverManager.chromedriver().setup();
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5)); } else
		 * if(Browser.equals("edge")) { WebDriverManager.edgedriver().setup(); driver =
		 * new EdgeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5)); }
		 */

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.close();
	}

}
