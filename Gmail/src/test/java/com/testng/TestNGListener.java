package com.testng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNGListener extends TestListenerAdapter{

	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Fail");
	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}
}
