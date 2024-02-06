package com.framework.leafScripts;

import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.core.Screenshots;
import com.framework.leafScreens.HomePage;
import com.framework.leafScreens.SelectPage;

public class TC_004_Leaf_SelectTool extends FrameworkScript{
	
	@Test
	public void tc_004_Leaf_SelectTool() throws Exception{
		driver.get("https://www.leafground.com/");
		Screenshots ss = new Screenshots();
		ss.captureFull(driver);
		HomePage hp = new HomePage(driver);
		hp.menuitem_submenu_element();
		ss.captureFull(driver);
		hp.menu_layout_dropdown();
		
		SelectPage sp = new SelectPage(driver);
		sp.selectTool_VisibleTxt("Selenium");
		ss.captureFull(driver);
	}
}
