package com.framework.testscripts;

import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.screens.LoginPage;
import com.framework.screens.SL_HomePage;

@Test
public class SL_HomePage_allAC extends FrameworkScript{
	
	public void slHomePageAllProdAC() throws Exception{
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		SL_HomePage hpallclics = new SL_HomePage(driver);
		hpallclics.allproducts_AC();
		Thread.sleep(3000);
		hpallclics.selectSortContainer(3);
		Thread.sleep(4000);
		hpallclics.selectSortContainer(0);
		Thread.sleep(2000);
		hpallclics.allproducts_RC();
		Thread.sleep(2000);
		hpallclics.logoutSecretSauce();
	}

}
