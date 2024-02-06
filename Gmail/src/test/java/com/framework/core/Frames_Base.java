package com.framework.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames_Base extends FrameworkScript{
	
	public void frame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

}
