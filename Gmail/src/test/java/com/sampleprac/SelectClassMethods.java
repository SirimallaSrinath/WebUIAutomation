package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectClassMethods {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.switchTo().frame("iframeResult");
		WebElement carsdp = driver.findElement(By.xpath("//select[@name='cars']"));
		Select seldp = new Select(carsdp);
		System.out.println("Multiple options available : "+seldp.isMultiple());
		seldp.selectByIndex(1);
		Thread.sleep(3000);
		seldp.selectByValue("audi");
		Thread.sleep(3000);
		seldp.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		List<WebElement> seloptions = seldp.getOptions();

		for(WebElement each:seloptions) {
			System.out.println(each.getText());
		}

		System.out.println("Cars Total Count : "+seloptions.size());
		Thread.sleep(2000);
		List<WebElement> selectedopt = seldp.getAllSelectedOptions();

		for(WebElement seop:selectedopt) {
			System.out.println("Selected options: "+seop.getText());
		}

		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement multidp = driver.findElement(By.xpath("//select[@name='cars']"));
		Select mulsel = new Select(multidp);
		System.out.println("Multiple Selection options Available: "+mulsel.isMultiple());
		mulsel.selectByIndex(1);
		Thread.sleep(2000);
		mulsel.selectByValue("audi");
		Thread.sleep(2000);
		//mulsel.deselectAll();
		List<WebElement> mulsele = mulsel.getAllSelectedOptions();
		for(WebElement ehmuls:mulsele) {
			System.out.println("Multiple Sel options name : "+ehmuls.getText());
		}
		Thread.sleep(2000);
		mulsel.deselectByIndex(1);
		
	}

}
