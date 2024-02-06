package com.framework.core;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Actions_Base extends FrameworkScript{
	
	public void actions_base(WebDriver driver,WebElement drage,WebElement drope) {
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drage, drope).build().perform();
		
	}

}
