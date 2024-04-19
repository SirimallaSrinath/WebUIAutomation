package com.cucumberprac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\HP\\git\\repository\\Gmail\\src\\test\\resources\\features\\TagsHooks.feature",
				glue="\\com\\cucumberprac",
				dryRun=false)
public class TestRunTagHook extends AbstractTestNGCucumberTests{

}
