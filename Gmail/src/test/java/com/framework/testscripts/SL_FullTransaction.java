package com.framework.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.core.FrameworkScript;
import com.framework.core.PageUrl;
import com.framework.core.Screenshots;
import com.framework.helper.ExcelHelper;
import com.framework.screens.CheckoutComplete;
import com.framework.screens.CheckoutOverview;
import com.framework.screens.CheckoutYourInfo;
import com.framework.screens.HomePage;
import com.framework.screens.LoginPage;
import com.framework.screens.LogoutPage;
import com.framework.screens.SL_HomePage;
import com.framework.screens.YourCart;

public class SL_FullTransaction extends FrameworkScript{

	@Test(dataProvider = "getTestDataSL")
	public void slFullTransaction(String UserName,String Password) throws Exception{

		//driver.get("https://www.saucedemo.com/");
		
		PageUrl urlobj = new PageUrl();
		urlobj.url(driver);
		Thread.sleep(5000);

		Screenshots screen = new Screenshots();
		screen.captureFull(driver);

		LoginPage lp = new LoginPage(driver);
		lp.login(UserName, Password);
		Thread.sleep(2000);

		SL_HomePage slhp = new SL_HomePage(driver);
		slhp.allproducts_AC();
		screen.captureFull(driver);
		Thread.sleep(5000);

		slhp.selectSortContainer(2);
		slhp.linkYourCart();
		Thread.sleep(4000);

		screen.captureFull(driver);
		YourCart yc = new YourCart(driver);
		yc.btnCheckOut();
		Thread.sleep(4000);

		screen.captureFull(driver);
		CheckoutYourInfo checkoutinfo = new CheckoutYourInfo(driver);
		checkoutinfo.fillYourInfo("Sirimalla", "Srinath", "505018");
		Thread.sleep(4000);

		screen.captureFull(driver);
		CheckoutOverview checkoutovview = new CheckoutOverview(driver);
		checkoutovview.clickFinishBtn();
		Thread.sleep(4000);

		screen.captureFull(driver);
		CheckoutComplete checkoutcplt = new CheckoutComplete(driver);
		checkoutcplt.backHome();
		Thread.sleep(4000);

		screen.captureFull(driver);
		LogoutPage logout = new LogoutPage(driver);
		logout.logout();
	}

	@DataProvider(name = "getTestDataSL")
	public String[][] getTestDataSL() throws Exception {
		return ExcelHelper.getTestData("C:\\Testdata.xlsx","Sheet1");
	}

}
