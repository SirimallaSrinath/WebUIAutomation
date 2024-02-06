package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01b4fxxcohryl1wggwc8avu0wg431129.node0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement tyn = driver.findElement(By.id("j_idt88:name"));
		tyn.sendKeys("Sathish Murugesan");
		Thread.sleep(2000);
		tyn.clear();
		//control enabled or not
		System.out.println("control enabled : "+tyn.isEnabled());
		Thread.sleep(2000);
		tyn.sendKeys("john Michael");
		Thread.sleep(2000);
		
		// moving to another url in same browser window
		
		driver.navigate().to("https://www.leafground.com/button.xhtml;jsessionid=node01b4fxxcohryl1wggwc8avu0wg431129.node0");
		Thread.sleep(4000);
		WebElement CCT = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		CCT.click();
		System.out.println("click button selected : "+CCT.isSelected());
		Thread.sleep(2000);
		System.out.println("Attribute Value for Id : "+CCT.getAttribute("id"));
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		WebElement checkbx= driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));
		checkbx.click();
		System.out.println("Checkbox selected: "+checkbx.isSelected());
	}

}
