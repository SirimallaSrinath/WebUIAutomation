package com.alight.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlightWorklifeHome {

	@FindBy(xpath = "//h3[text()='New Hire']")
	private WebElement btnNewHire = null;

	@FindBy(xpath = "//h3[text()='Mid-Career']")
	private WebElement btnMidCarrer = null;

	@FindBy(xpath = "//h3[text()='Near Retiree']")
	private WebElement btnNearRetiree = null;

	public AlightWorklifeHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void homeNewHire() {
		btnNewHire.click();
	}
	public void homeMidCareer() {
		btnMidCarrer.click();
	}
	public void homeNearRetiree() {
		btnNearRetiree.click();
	}
	
}
