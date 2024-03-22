package com.orange.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement dropdown_Select = null;
	
	public void select_dd_Admin() throws Exception{
		Select select = new Select(dropdown_Select);
		select.selectByVisibleText("Admin");
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	private WebElement imgProfilePic = null;
	
	@FindBy(linkText = "Logout")
	private WebElement linkLogout = null;
	
	public void clickProfilePicture_admin() throws Exception{
		Thread.sleep(2000);
		imgProfilePic.click();
		Thread.sleep(2000);
		linkLogout.click();
	}
}
