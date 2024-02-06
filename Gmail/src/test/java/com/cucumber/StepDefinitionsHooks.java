package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsHooks {
	private WebDriver driver = null;

	@Before
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeStep
	public void login() throws Exception{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("addEmployee")
	public void add_employee() {
	    System.out.println("Add Employee");
	}
	@When("editEmployee")
	public void edit_employee() {
	    System.out.println("Edit Employee");
	}

	@When("deleteEmployee")
	public void delete_employee() {
	    System.out.println("Delete Employee");
	}
	

	@AfterStep
	public void click_on_profile_icon_and_logout() throws Exception{
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@After
	public void close_browser() {
		driver.close();
	}

}
