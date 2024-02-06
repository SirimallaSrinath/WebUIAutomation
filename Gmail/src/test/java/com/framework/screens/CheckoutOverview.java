package com.framework.screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview {
	
	@FindBy(id="finish")
	private WebElement btnFinish=null;
	
	public CheckoutOverview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFinishBtn() {
		btnFinish.click();
	}

}
