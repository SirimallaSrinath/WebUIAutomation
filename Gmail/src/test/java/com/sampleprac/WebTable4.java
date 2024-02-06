package com.sampleprac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		String table = driver.findElement(By.xpath("//table[@id='example']")).getText();
		System.out.println(table);
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		List<WebElement> totalcolumns =driver.findElements(By.xpath("//table[@id='example']//tbody//tr[1]//td"));
		for(int i=1;i<totalrows.size();i++) {
			
				String namecheck = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[2]")).getText();
				if(namecheck.contains("Williamson")) {
					driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[1]")).click();
					break;
				}
			
		}
		
	}}