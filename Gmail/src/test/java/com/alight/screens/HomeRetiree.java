package com.alight.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeRetiree {
	
	@FindBy(xpath="//p[text()='Enroll in Your Benefits']")
	private WebElement btnRetireeEnroll_Todo = null;
	
	public HomeRetiree(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void retireeEnroll_todo() {
		btnRetireeEnroll_Todo.click();
	}
}
