package com.framework.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutYourInfo {
	
	@FindBy(id="first-name")
	private WebElement txtFirstName = null;
	
	@FindBy(id="last-name")
	private WebElement txtLastName = null;
	
	@FindBy(id="postal-code")
	private WebElement txtPostalCode = null;
	
	@FindBy(id="continue")
	private WebElement btnContinue = null;
	
	public CheckoutYourInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fillYourInfo(String FirstName, String LastName, String PostalCode) {
		txtFirstName.sendKeys(FirstName);
		txtLastName.sendKeys(LastName);
		txtPostalCode.sendKeys(PostalCode);
		btnContinue.click();
	}

}
