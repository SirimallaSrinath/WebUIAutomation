package com.orange.screens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement textUserName = null;

	@FindBy(xpath="//input[@name='password']")
	private WebElement textPassword = null;

	@FindBy(xpath="//button[text()=\" Login \"]")
	private WebElement buttonLogin = null;


	public void login(String username, String password) throws Exception{
		textUserName.sendKeys(username);
		Thread.sleep(2000);
		textPassword.sendKeys(password);
		Thread.sleep(2000);
		buttonLogin.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
