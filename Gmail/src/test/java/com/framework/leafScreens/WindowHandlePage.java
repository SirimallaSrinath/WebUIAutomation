package com.framework.leafScreens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandlePage {

	@FindBy(xpath="//span[text()='Open']")
	WebElement Open_Window = null;

	public WindowHandlePage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	public void open_Window() {
		Open_Window.click();
	}

}
