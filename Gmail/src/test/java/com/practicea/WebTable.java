package com.practicea;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/simple.html");
		Thread.sleep(2000);
		
		List<WebElement> trows =  driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		List<WebElement> tcols = driver.findElements(By.xpath("(//table[@id='example']//tbody//tr)[1]//td"));
		String Name = null;
		for(int i=1;i<=trows.size();i++) {
			for(int j=1;j<=tcols.size();j++) {
				String eachcelltext = driver.findElement(By.xpath("((//table[@id='example']//tbody//tr)["+i+"]//td)["+j+"]")).getText();
				System.out.println(eachcelltext);
				
				WebElement namefield = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)["+i+"]//td[1]"));
				String eename = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)["+i+"]//td[1]")).getText();
				
				if(eename.contains("Cox")) {
					namefield.click();
					break;
				}
			}
		}
		
		
	}

}
