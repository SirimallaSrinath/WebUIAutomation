package com.framework.leafScripts;

import org.testng.annotations.Test;

import com.framework.core.Alert_Base;
import com.framework.core.FrameworkScript;
import com.framework.leafScreens.AlertPage;
import com.framework.leafScreens.HomePage;

public class TC_002_Leaf_AlertSimple extends FrameworkScript{
	
	@Test
	public void tc_002_Leaf_AlertSimple() throws Exception{
		driver.get("https://www.leafground.com/");
		
		HomePage hp = new HomePage(driver);
		hp.menuitem_submenu_browser();
		hp.menu_layout_alert();
		
		AlertPage ap = new AlertPage(driver);
		ap.simple_Dialog();
		Alert_Base ab = new Alert_Base();
		Thread.sleep(3000);
		ab.alert_accept(driver);
		
	}

}
