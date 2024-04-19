package com.cucumberprac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\HP\\git\\repository\\Gmail\\src\\test\\resources\\features\\Background.feature", 
				glue = "\\com\\cucumberprac",
				dryRun = false,
				plugin = "html:ExecutionReport.html")
public class TestRunBackground extends AbstractTestNGCucumberTests{

}
