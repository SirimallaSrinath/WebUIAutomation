package com.framework.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class SL_HomePage {
	
	
	//Add and Remove Cart Actions
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement btnBackPack_AC;
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement btnBackPack_RC;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement btnBikeLight_AC;
	
	@FindBy(id="remove-sauce-labs-bike-light")
	private WebElement btnBikeLight_RC;
	
	@FindBy(name ="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement btnBoltShirt_AC;
	
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")
	private WebElement btnBoltShirt_RC;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement btnFleeceJacket_AC;
	
	@FindBy(id="remove-sauce-labs-fleece-jacket")
	private WebElement btnFleeceJacket_RC;
	
	@FindBy(name = "add-to-cart-sauce-labs-onesie")
	private WebElement btnOneSie_AC;
	
	@FindBy(name = "remove-sauce-labs-onesie")
	private WebElement btnOneSie_RC;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement btnTshirtRed_AC;
	
	@FindBy(id="remove-test.allthethings()-t-shirt-(red)")
	private WebElement btnTshirtRed_RC;
	
	
	//product_sort_container
	@FindBy(className = "product_sort_container")
	private WebElement sortcontainer;  
	
	// burgerMenuBtn
	@FindBy(id="react-burger-menu-btn")
	private WebElement burgerMenuBtn;
	
	// logoutBtn in burgerMenuBtn
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	
	// All items in burgerMenuBtn
	@FindBy(id="inventory_sidebar_link")
	private WebElement allItemsLink;
	
	//about in burgerMenuBtn
	@FindBy(id="about_sidebar_link")
	private WebElement aboutLink;
	
	//resetAppState in burgerMenuBtn
	@FindBy(id="reset_sidebar_link")
	private WebElement resetAppStateLink;
	
	public void logoutSecretSauce() throws Exception{
		burgerMenuBtn.click();
		Thread.sleep(2000);
		logoutLink.click();
	}
	
	public void aboutBurgerMenuBtn() throws Exception{
		aboutLink.click();
		Thread.sleep(2000);
	}
	
	public void allproducts_AC() throws Exception{
		btnBackPack_AC.click();
		Thread.sleep(2000);
		btnBikeLight_AC.click();
		Thread.sleep(2000);
		btnBoltShirt_AC.click();
		Thread.sleep(2000);
		btnFleeceJacket_AC.click();
		Thread.sleep(2000);
		btnOneSie_AC.click();
		Thread.sleep(2000);
		btnTshirtRed_AC.click();
		Thread.sleep(2000);
	}
	
	public void allproducts_RC() throws Exception{
		btnBackPack_RC.click();
		Thread.sleep(2000);
		btnBikeLight_RC.click();
		Thread.sleep(2000);
		btnBoltShirt_RC.click();
		Thread.sleep(2000);
		btnFleeceJacket_RC.click();
		Thread.sleep(2000);
		btnOneSie_RC.click();
		Thread.sleep(2000);
		btnTshirtRed_RC.click();
		Thread.sleep(2000);
		
	}
	
	public void selectSortContainer(int index) {
		Select selsortcontainer = new Select(sortcontainer);
		selsortcontainer.selectByIndex(index);
	}
	
	public void selectSortContainer(String Value) {
		Select selsort_value = new Select(sortcontainer);
		selsort_value.selectByValue(Value);
	}
	
	public void selectsortContainer(String Text) {
		Select selsort_visibletext = new Select(sortcontainer);
		selsort_visibletext.selectByVisibleText(Text);
	}
	
	@FindBy(id="shopping_cart_container")
	private WebElement linkYourCart;
	
	public void linkYourCart() {
		linkYourCart.click();
		
	}
	
	public SL_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
