package com.cucumberprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsSwag {
	WebDriver driver = null;
	
	@Given("user launch url")
	public void user_launch_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new EdgeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	}

	@When("user provide login password and click submit")
	public void user_provide_login_password_and_click_submit() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   driver.findElement(By.id("login-button")).click();
	}

	@When("user provide {string} {string} and click submit")
	public void user_provide_and_click_submit(String string, String string2) {
		driver.findElement(By.id("user-name")).sendKeys(string);
		   driver.findElement(By.id("password")).sendKeys(string2);
		   driver.findElement(By.id("login-button")).click();
	}
	
	@Then("user check Homepage title")
	public void user_check_homepage_title() {
	  String actualurl = driver.getCurrentUrl();
	  String expurl = "https://www.saucedemo.com/v1/inventory.html";
	  Assert.assertEquals(actualurl, expurl);
	}

	@And("click on profile and logout")
	public void click_on_profile_and_logout() throws Exception{
	   driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	   driver.close();
	}


}
