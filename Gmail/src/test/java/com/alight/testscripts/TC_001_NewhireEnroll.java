package com.alight.testscripts;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.alight.core.BrowserScript;
import com.alight.screens.AlightWorklifeHome;
import com.alight.screens.HomeNewHire;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class TC_001_NewhireEnroll extends BrowserScript{

	@Test
	public void newhireEnroll() throws Exception{
		//URL details
		driver.get("http://alight:wellbeing23@products.alight.com/demopack/alight_worklife/home.html");
		Thread.sleep(2000);
		//Home page
		AlightWorklifeHome wlh = new AlightWorklifeHome(driver);
		wlh.homeNewHire();
		Thread.sleep(3000);
		//driver control to second window
		Set<String> handles = driver.getWindowHandles();
		List<String> ListHandles = new ArrayList<String>(handles);
		driver.switchTo().window(ListHandles.get(1));
		HomeNewHire hnh = new HomeNewHire(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		hnh.NewhireEnroll_Todo();
		//Screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest   = new File("C:\\Users\\Srinath\\Downloads\\screenshot\\img24.PNG");
		FileHandler.copy(source, dest);
		
		Thread.sleep(2000);
		Shutterbug.shootPage(driver, Capture.FULL).save("C:\\Users\\Srinath\\Downloads\\screenshot\\FULLSCREEN1.PNG");
		Thread.sleep(3000);
	}

}
