package com.framework.testscripts;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.helper.ExcelHelper;

public class DriverScript extends FrameworkScript{
	
	@Test(dataProvider = "getTestData")
	public void execute(String tc,String description,String keyword,String properties,String data) {
		WebElement webElement = null;
		
		if(ObjectUtils.isNotEmpty(properties)) {
			String locatorType = properties.split("=")[0];
			String locatorValue = properties.split("=")[1];
			
			switch (locatorType) {
			case "id":
				webElement=driver.findElement(By.id(locatorValue));
				break;
			case "name":
				webElement=driver.findElement(By.name(locatorValue));
				break;
			case "className":
				webElement=driver.findElement(By.className(locatorValue));
				break;
			case "tagName":
				webElement=driver.findElement(By.tagName(locatorValue));
				break;
			case "xpath":
				webElement=driver.findElement(By.xpath(locatorValue));
				break;
			case "cssSelector":
				webElement=driver.findElement(By.cssSelector(locatorValue));
				break;
			case "linkText":
				webElement=driver.findElement(By.linkText(locatorValue));
				break;
			case "partialLinkText":
				webElement=driver.findElement(By.partialLinkText(locatorValue));
				break;
			}
		}
		
		//Action
		
		switch (keyword) {
		case "visit":
			driver.get(data);
			break;
		case "setText":
			webElement.sendKeys(data);
			break;
		case "click":
			webElement.click();
			break;
		}
		
		
	}

	@DataProvider(name = "getTestData")
	public String[][] getTestData() throws Exception {
		return ExcelHelper.getTestData("C:\\KeywordDriven.xlsx","Sheet1");
	}
}
