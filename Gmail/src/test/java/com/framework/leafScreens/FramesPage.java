package com.framework.leafScreens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
	
	@FindBy(xpath="(//button[@id='Click'])[1]")
	private WebElement InsideFrame = null;
	
	public void insideFrame() {
		InsideFrame.click();
	}
	
	public FramesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
}
