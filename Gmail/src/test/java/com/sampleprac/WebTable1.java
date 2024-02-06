package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		Thread.sleep(2000);
		//No of tables in WebPage
		int tablect = driver.findElements(By.cssSelector("table")).size();
		System.out.println("Total tables in Webpage: "+tablect);
		//No of columns in table1
		int columnsct = driver.findElements(By.xpath("//table[@id='example']//thead//tr//th")).size();
		System.out.println("Total columns count :"+columnsct);
		//columns each header cell text info
		List<WebElement> hc =driver.findElements(By.xpath("//table[@id='example']//thead//tr//th"));
		for(WebElement ehc:hc) {
			System.out.println("Header cell column text details: "+ehc.getText());
		}
		//Total rows in table1
		List<WebElement> trows =driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		System.out.println("Total rows in table1: "+trows.size());
		
		//row3 each data cell text info
		List<WebElement> edct3 = driver.findElements(By.xpath("(//table[@id='example']//tbody//tr)[3]//td"));
		for(WebElement r3t:edct3) {
			System.out.println("Row 3 each data cell information "+r3t.getText());
		}
	}

}
