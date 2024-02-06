package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReportSpark.html");

	@Test
	public void f1() {
		ExtentTest logger = extent.createTest("Launch Browser and Website").assignAuthor("Srinath Sirimalla")
				.assignCategory("Smoke").assignDevice("Chrome");
		logger.log(Status.PASS, "User able to launch Website");
		logger.pass("User launch Website verified");
	}

	@Test
	public void f2() {
		ExtentTest logger = extent.createTest("Verify Login").assignAuthor("Pavan").assignCategory("Regression").assignDevice("Mozilla");
		logger.info("Alert Displayed");
		logger.pass("User logged into application");
		logger.warning("Reset password alert displaying");
	}

	@Test
	public void f3() {
		ExtentTest logger = extent.createTest("Verify Dashboard").assignAuthor("Rajesh").assignCategory("Sanity").assignDevice("Edge");
		logger.skip("Verify Dashboard Skipped");
	}

	@Test
	public void f4() {
		ExtentTest logger = extent.createTest("Verify User Emails from Test Application").assignAuthor("Hanish").assignCategory("Integration").assignDevice("IE");
		logger.fail("No Email verfied due to server issues");
	}

	@Test
	public void f5() {
		ExtentTest logger = extent.createTest("Verify reports and analytics").assignAuthor("Raju").assignCategory("Unit").assignDevice("Safari");
		logger.fail("Reports crashed");
	}

	@Test
	public void f6() {
		ExtentTest logger = extent.createTest("Verify logout feature").assignAuthor("Ratan").assignCategory("Functional").assignDevice("Chrome");
		logger.pass("User able to logout successfully");
		logger.info("User redirected to Login Page");
	}


	@BeforeTest
	public void beforeTest() {
		extent.attachReporter(spark);
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

}
