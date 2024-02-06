package com.framework.core;

import org.openqa.selenium.WebDriver;

public class PageUrl extends FrameworkScript{
	
	public void url(WebDriver driver) {
		driver.get("https://www.saucedemo.com/");
	}

}
