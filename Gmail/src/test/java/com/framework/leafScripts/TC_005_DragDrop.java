package com.framework.leafScripts;

import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.leafScreens.DragPage;
import com.framework.leafScreens.HomePage;

public class TC_005_DragDrop extends FrameworkScript{
	
	@Test
	public void tc_005_DragDrop() {
		driver.get("https://www.leafground.com/");
		HomePage hp = new HomePage(driver);
		hp.menuitem_submenu_browser();
		hp.menu_layout_drag();
		DragPage dp = new DragPage(driver);
		dp.dragDrop(driver);
		
	}

}
