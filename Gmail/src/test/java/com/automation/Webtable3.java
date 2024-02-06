package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webtable3 {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		int totalrows = driver.findElements(By.xpath("//table[@id = 'example']//tbody//tr")).size();
		int offlocln = 0;
		
		for(int i=1;i<=totalrows;i++) {
			
			String offloc = driver.findElement(By.xpath("//table[@id = 'example']//tbody//tr["+i+"]//td[4]")).getText();
			if(offloc.equals("London")) {
				offlocln = offlocln+1;	
			}
		}
		System.out.println("London location occurance count: "+offlocln);
		driver.close();
	}

}
