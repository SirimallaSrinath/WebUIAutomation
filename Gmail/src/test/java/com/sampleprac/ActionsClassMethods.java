package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsClassMethods {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.get("https://www.timesjobs.com/");
		Thread.sleep(3000);
		WebElement timesj = driver.findElement(By.xpath("//h5[text()='New to Timesjobs?']"));
		Actions timesjobc = new Actions(driver);
		//timesjobc.click(timesj).perform();
		Thread.sleep(5000);
		driver.navigate().to("https://api.jquery.com/dblclick/");
		driver.switchTo().frame(0);
		WebElement divtag = driver.findElement(By.tagName("div"));
		Actions divtagac = new Actions(driver);
		divtagac.doubleClick(divtag).build().perform();
		Thread.sleep(2000);
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions dragdrop = new Actions(driver);
		dragdrop.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		Actions ddr = new Actions(driver);
		WebElement sources = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targets = driver.findElement(By.xpath("//div[@id='droppable']"));
		ddr.clickAndHold(sources).release(targets).build().perform();
		
		driver.navigate().to("https://www.cypress.io/");
		Thread.sleep(2000);
		WebElement docmouse= driver.findElement(By.xpath("//a[@id='dropdownDocs']"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(docmouse).build().perform();
		Thread.sleep(2000);
		WebElement confilink = driver.findElement(By.linkText("Configuration"));
		mouseover.click(confilink).perform();
		
	}

}
