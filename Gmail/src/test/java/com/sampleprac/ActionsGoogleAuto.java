package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsGoogleAuto {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("REST API");
		Thread.sleep(7000);
		List<WebElement> autoopt= driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		System.out.println("Total options counts: "+autoopt.size());
		for(WebElement ecopt:autoopt) {
			String serachopt = ecopt.getText();
			System.out.println("Each option details: "+serachopt);
		}
		Thread.sleep(2000);
		for(WebElement optclick:autoopt) {
			if(optclick.getText().contains("testing")) {
				optclick.click();
				break;
			}
		}
	}

}
