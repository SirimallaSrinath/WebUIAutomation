package com.framework.core;

import org.openqa.selenium.support.PageFactory;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots extends FrameworkScript{

	public void captureFull(WebDriver driver) {

		Shutterbug.shootPage(driver,Capture.FULL).save("C:\\Users\\HP\\Downloads\\screenshot\\SLFullTran.PNG");
	}

}
