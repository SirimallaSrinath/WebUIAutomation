package com.testng.prac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TC_005_Dataprovider1 {
	private WebDriver driver = null;

	@BeforeTest
	public void openBrowser(@Optional("chrome") String Browser ) {
		switch (Browser) {
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			break;
		}
	}

	public  void login(String un,String pw) throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("Logged In");
	}

	@Test(dataProvider = "getTestData")
	public void PIM(String un,String pw) throws Exception{
		login(un, pw);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("ganesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		logout();
	}

	public void logout() throws Exception{
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("Logged Out");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "getTestData")
	public String[][] getTestData(){
		String[][] data = new String[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		return data;
	}
}
