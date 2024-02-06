package com.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitionsHRM {
	WebDriver driver = null;
	
	@Given("launch Browser and enter HRM Application URL")
	public void launch_browser_and_enter_hrm_application_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	    }

	@When("enter Username Password and click login")
	public void enter_username_password_and_click_login() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("verify Homepage Title")
	public void verify_homepage_title() {
	    String ActualUrl = driver.getCurrentUrl();
	    String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    
	    String title = driver.getTitle();
	    
	    if(ActualUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
	    	
	    	Assert.assertEquals(ActualUrl, ExpectedUrl);
	    }
	}

	@When("click Profile Icon and Logout")
	public void click_profile_icon_and_logout() throws Exception{
	    
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	@And("close the Browser")
	public void close_the_browser() throws Exception{
	    Thread.sleep(2000);
	    driver.close();
	}

}
