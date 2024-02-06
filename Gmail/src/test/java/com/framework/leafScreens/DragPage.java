package com.framework.leafScreens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.core.Actions_Base;

import org.openqa.selenium.WebElement;

public class DragPage {
	
	
	@FindBy(xpath="//div[@id='form:drag_content']")
	private WebElement drag = null; 
	
	@FindBy(xpath="//div[@id='form:drop_content']")
	private WebElement drop = null;
	
	public void dragDrop(WebDriver driver) {
		Actions_Base action = new Actions_Base();
		action.actions_base(driver,drag, drop);
	}

	public DragPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
