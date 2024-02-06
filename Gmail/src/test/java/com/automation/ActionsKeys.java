package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeys {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement framecar = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(framecar);
		WebElement vol = driver.findElement(By.xpath("//select[@id='cars']/option[text()='Volvo']"));
		WebElement Audi = driver.findElement(By.xpath("//select[@id='cars']/option[text()='Audi']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		act.click(vol);
		Thread.sleep(3000);
		act.click(Audi);
		Thread.sleep(2000);
		act.keyUp(Keys.CONTROL).perform();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

	}

}
