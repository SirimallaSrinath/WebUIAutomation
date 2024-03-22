package com.orange.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	private WebElement imgProfilePic = null;
	
	@FindBy(linkText = "Logout")
	private WebElement linkLogout = null;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement mainmenu_Admin = null;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void link_Mainmenu_Admin() {
		mainmenu_Admin.click();
	}
	
	public void clickProfilePicture() throws Exception{
		Thread.sleep(2000);
		imgProfilePic.click();
		Thread.sleep(2000);
		linkLogout.click();
	}
	
}
