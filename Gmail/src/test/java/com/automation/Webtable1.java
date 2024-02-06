package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webtable1 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int tablescount = driver.findElements(By.xpath("//table")).size();
		System.out.println("Xpath total tables in a page :"+tablescount);
		
		int tablecountcss = driver.findElements(By.cssSelector("table")).size();
		System.out.println("CSS total tables count :"+tablecountcss);
		
		int tablecounttagname = driver.findElements(By.tagName("table")).size();
		System.out.println("Tagname total tables count :"+tablecounttagname);
		
		int rowscounttable1 = driver.findElements(By.xpath("//table[@id = 'example']//tbody//tr")).size();
		System.out.println("Total rows for 1st table: "+rowscounttable1);
		
		int totalcolumnstable1 = driver.findElements(By.xpath("//table[@id = 'example']//tbody//tr[1]//td")).size();
		System.out.println("Total columns for table1 : "+totalcolumnstable1);
		
	}
	

}
