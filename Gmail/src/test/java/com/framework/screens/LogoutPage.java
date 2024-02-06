package com.framework.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement btnIcon = null;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement btnLogout = null;
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws Exception{
		btnIcon.click();
		Thread.sleep(2000);
		btnLogout.click();
	}


}
