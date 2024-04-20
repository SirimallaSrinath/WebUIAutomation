package practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class select_dp {
	
	@Test
	public void selectdp() throws Exception{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='-- Select --']"));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
		System.out.println("List dd"+list.size());
		for(WebElement ec:list) {
			if(ec.getText().equals("Admin")) {
				ec.click();
				break;
			}
		}
		
		
//		Select select = new Select(sel);
//		select.selectByVisibleText("Admin");
	}

}
