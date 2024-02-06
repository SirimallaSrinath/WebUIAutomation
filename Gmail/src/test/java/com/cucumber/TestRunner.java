package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Srinath\\git\\repository\\Gmail\\src\\test\\resources\\features\\HRMOrange.feature",name = "HRM Application Login Logout Functionality",plugin="html:ExecutionReport.html")
public class TestRunner extends AbstractTestNGCucumberTests{

}
