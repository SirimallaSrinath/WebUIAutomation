package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.cypress.io/");
		driver.findElement(By.xpath("//a[text()=' Log In ']")).click();
		Thread.sleep(3000);
		Set<String> wh = driver.getWindowHandles();
		/*
		 * List<String> lwh = new ArrayList<String>(wh);
		 * driver.switchTo().window(lwh.get(1));
		 */

		/*
		 * for(String eh:wh) {
		 * if(driver.switchTo().window(eh).getTitle().equals("Cypress.io")) { break; } }
		 */

		for(String ehw:wh) {
			if(driver.switchTo().window(ehw).getCurrentUrl().equals("https://cloud.cypress.io/login")) {
				break;
			}
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-provider btn-provider-github btn-block']")).click();
		Thread.sleep(3000);
		for(String whs:wh) {
			if(driver.switchTo().window(whs).getCurrentUrl().equals("https://www.cypress.io/")) {
				break;
			}
		}
		driver.close();
	}

}
