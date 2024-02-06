package com.framework.leafScreens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.framework.core.Select_Base;

import org.openqa.selenium.WebElement;

public class SelectPage {
	
	@FindBy(xpath="//Select[@class='ui-selectonemenu']")
	private WebElement selecttool = null;
	
	public void selectTool_VisibleTxt(String text) {
		Select_Base sb = new Select_Base();
		sb.select_VisibleText(selecttool, text);
	}
	
	public SelectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
