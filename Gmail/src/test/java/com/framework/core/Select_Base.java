package com.framework.core;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Select_Base extends FrameworkScript{
	
	public void select_Index(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void select_VisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void select_Value(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	

}
