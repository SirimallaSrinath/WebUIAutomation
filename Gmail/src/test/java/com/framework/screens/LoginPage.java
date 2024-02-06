package com.framework.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "user-name")
	private WebElement txtUserName = null;

	@FindBy(id = "password")
	private WebElement txtPassword = null;

	@FindBy(id = "login-button")
	private WebElement btnLogin = null;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String userName,String password) throws Exception{
		txtUserName.sendKeys(userName);
		Thread.sleep(2000);
		txtPassword.sendKeys(password);
		Thread.sleep(2000);
		btnLogin.click();
		
	}

}
