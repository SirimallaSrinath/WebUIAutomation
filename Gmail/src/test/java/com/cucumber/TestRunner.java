package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\HP\\git\\repository\\Gmail\\src\\test\\resources\\features\\HRMOrange.feature",glue="\\com\\cucumber",plugin="html:ExecutionReport.html")
public class TestRunner extends AbstractTestNGCucumberTests{

}
