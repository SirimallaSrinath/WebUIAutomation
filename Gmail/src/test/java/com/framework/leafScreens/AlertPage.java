package com.framework.leafScreens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class AlertPage {
	
	@FindBy(xpath="//button[@id='j_idt88:j_idt91']")
	WebElement simpledialog=null;
	
	public void simple_Dialog() {
		simpledialog.click();
	}
	
	public AlertPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
