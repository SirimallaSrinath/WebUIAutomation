package com.sampleprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Screenshot1 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		File source = table.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Srinath\\Downloads\\img1.png");
		FileHandler.copy(source, target);

		File se = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dn = new File("C:\\Users\\Srinath\\Downloads\\img2.png");
		FileHandler.copy(se, dn);
		
		Shutterbug.shootPage(driver,Capture.FULL).save("C:\\Users\\Srinath\\Downloads\\img3.png");
	}
}
