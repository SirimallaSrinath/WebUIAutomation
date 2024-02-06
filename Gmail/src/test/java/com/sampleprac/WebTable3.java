package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WebTable3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		List<WebElement> totalcolumns =driver.findElements(By.xpath("//table[@id='example']//tbody//tr[1]//td"));
		int countrylondonoccurance = 0;
		
		for(int i=1;i<totalrows.size();i++) {
			String country = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[4]")).getText();
			if(country.equals("London")) {
				countrylondonoccurance = countrylondonoccurance+1;
			}
		}
		System.out.println("London count: "+countrylondonoccurance);
	}

}
