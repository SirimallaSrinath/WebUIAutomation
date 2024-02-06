package com.framework.leafScripts;

import org.testng.annotations.Test;

import com.framework.core.Frames_Base;
import com.framework.core.FrameworkScript;
import com.framework.leafScreens.FramesPage;
import com.framework.leafScreens.HomePage;

public class TC_003_Leaf_FrameInside extends FrameworkScript{
	@Test
	public void tc_003_Leaf_FrameInside() throws Exception{
		driver.get("https://www.leafground.com/");
		HomePage hp =new HomePage(driver);
		hp.menuitem_submenu_browser();
		hp.menu_layout_frame();
		
	
		Frames_Base fb = new Frames_Base();
		fb.frame(driver, 0);
		FramesPage fp = new FramesPage(driver);
		Thread.sleep(2000);
		fp.insideFrame();
		
		
	}
}
