package com.alight.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeNewHire {
	
	@FindBy(xpath="//p[text()='Review your options and enroll']")
	private WebElement btnNewhireBenefit_Card = null;

	@FindBy(xpath="//p[text()='Enroll in Your New Hire Benefits']")
	private WebElement btnNewhireEnroll_Todo = null;
	
	public HomeNewHire(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void NewhireBenefit_Card() {
		btnNewhireBenefit_Card.click();
	}
	public void NewhireEnroll_Todo() {
		btnNewhireEnroll_Todo.click();
	}
}
