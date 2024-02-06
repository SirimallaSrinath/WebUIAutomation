package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webtable2 {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int totalrow = driver.findElements(By.xpath("//table[@id = 'example']//tbody//tr")).size();
		int totalcolumn = driver.findElements(By.xpath("//table[@id='example']//tbody//tr[1]//td")).size();
		System.out.println("total row: "+totalrow);
		System.out.println("total column: "+totalcolumn);

		for(int i=1;i<=totalrow;i++) {
			for(int j=1;j<=totalcolumn;j++) {
				String dynamicrowcolumn = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(dynamicrowcolumn);
			}
		}
	}
}