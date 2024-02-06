package com.framework.leafScreens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	@FindBy(id="menuform:j_idt39")
	private WebElement menuitem_submenu_browser = null;
	
	@FindBy(id="menuform:j_idt40")
	private WebElement menuitem_submenu_element = null;


	@FindBy(xpath = "//li[@id='menuform:m_window']")
	private WebElement menu_layout_window = null;

	@FindBy(xpath="//span[text()='Alert']")
	private WebElement menu_layout_alert = null;

	@FindBy(xpath="//span[text()='Frame']")
	private WebElement menu_layout_frame = null;
	
	@FindBy(xpath="//span[text()='Dropdown']")
	private WebElement menu_layout_dropdown = null;
	
	@FindBy(xpath="//li[@id='menuform:m_drag']")
	private WebElement menu_layout_drag = null;
	

	public void menuitem_submenu_browser() {
		menuitem_submenu_browser.click();
	}

	public void menuitem_submenu_element() {
		menuitem_submenu_element.click();
	}
	
	public void menu_layout_dropdown() {
		menu_layout_dropdown.click();
	}
	
	public void menu_layout_window() {
		menu_layout_window.click();
	}

	public void menu_layout_alert() {
		menu_layout_alert.click();
	}

	public void menu_layout_frame() {
		menu_layout_frame.click();
	}
	
	public void menu_layout_drag() {
		menu_layout_drag.click();
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
