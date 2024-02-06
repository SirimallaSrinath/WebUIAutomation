package com.framework.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle extends FrameworkScript{
	
	public void windowhandleIndex(WebDriver driver, int index) {
		
		Set<String> handles = driver.getWindowHandles();
		List<String> listhandles = new ArrayList<String>(handles);
		driver.switchTo().window(listhandles.get(index));
	}
	
	public void windowhandleTitle(WebDriver driver,String title) {
		Set<String> handles = driver.getWindowHandles();
		for(String eachhandle:handles) {
			if(driver.switchTo().window(eachhandle).getTitle().equals(title)) {
				break;
			}
		}
	}
	
	public void windowhandleUrl(WebDriver driver,String urltxt) {
		Set<String> handleurl =driver.getWindowHandles();
		List<String> listhandle = new ArrayList<String>(handleurl);
		for(String echandle:listhandle) {
			if(driver.switchTo().window(echandle).getCurrentUrl().equals(urltxt)) {
				break;
			}
		}
		
		
	}

}
