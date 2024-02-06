package com.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {
	private WebDriver driver = null;
	
	@Given("open browser and enter application url")
	public void open_browser_and_enter_application_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("enter username,password and click on login")
	public void enter_username_password_and_click_on_login() throws Exception{
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	
	@When("enter {string},{string} and click on login")
	public void enter_and_click_on_login(String username, String password) throws Exception{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("verification for homepage")
	public void verification_for_homepage() {
		WebElement wb = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	    Assert.assertNotNull(wb);
	    System.out.println("Home page info: "+wb);
	}
	@When("click on profile icon and logout")
	public void click_on_profile_icon_and_logout() throws Exception{
	   driver.findElement(By.className("oxd-userdropdown-tab")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Logout")).click();
	}
	@When("close browser")
	public void close_browser() {
	    driver.close();
	}

}
