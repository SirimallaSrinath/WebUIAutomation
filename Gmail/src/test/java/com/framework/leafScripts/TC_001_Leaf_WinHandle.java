package com.framework.leafScripts;

import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.core.WindowHandle;
import com.framework.leafScreens.HomePage;
import com.framework.leafScreens.WindowHandlePage;


public class TC_001_Leaf_WinHandle extends FrameworkScript{
	
	@Test
	public void TC_001_Leaf_WinHandle() throws Exception{
		driver.get("https://www.leafground.com/");
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.menuitem_submenu_browser();
		Thread.sleep(3000);
		hp.menu_layout_window();
		
		WindowHandlePage whp = new WindowHandlePage(driver);
		
		whp.open_Window();
		Thread.sleep(7000);
		
		WindowHandle whs = new WindowHandle();
		whs.windowhandleIndex(driver, 1);
		Thread.sleep(2000);
		HomePage hp1 = new HomePage(driver);
		hp1.menuitem_submenu_browser();
		Thread.sleep(5000);
	}

}
