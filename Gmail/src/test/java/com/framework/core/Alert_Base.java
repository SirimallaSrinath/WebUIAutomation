package com.framework.core;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alert_Base extends FrameworkScript{
	
	public void alert_accept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alert_dismiss(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

}
