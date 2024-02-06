package com.practicea;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		//driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Select Product Type")).click();
		List<WebElement> prodtype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println(prodtype.size());
//		for(WebElement prod:prodtype) {
//			if(prod.getText().equals("Health Insurance")) {
//				prod.click();
//				break;
//			}
//		}
		dropdown(prodtype, "Health Insurance");
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> proddp = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
//		for(WebElement ecprod:proddp) {
//			if(ecprod.getText().equals("Super Top-up Insurance")) {
//				ecprod.click();
//				break;
//			}
//		}
		
		dropdown(proddp, "Super Top-up Insurance");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Apply online')]")).click();
		driver.close();
	}
	public static void dropdown(List<WebElement> prodlist,String Value) {
		for(WebElement prodec:prodlist) {
			if(prodec.getText().equals(Value)) {
				prodec.click();
				break;
			}
		}
		
	}
}
