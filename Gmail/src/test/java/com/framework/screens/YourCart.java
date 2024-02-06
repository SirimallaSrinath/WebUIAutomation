package com.framework.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCart {

	@FindBy(name = "checkout")
	private WebElement btnCheckOut;
	
	public YourCart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void btnCheckOut() throws Exception{
		btnCheckOut.click();
		Thread.sleep(3000);
	}

}
