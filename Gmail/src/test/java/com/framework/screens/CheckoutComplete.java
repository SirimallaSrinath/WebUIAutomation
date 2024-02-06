package com.framework.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete {
	
	@FindBy(id="back-to-products")
	private WebElement btnBackHome = null;
	
	public void backHome() {
		btnBackHome.click();
	}
	
	public CheckoutComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
