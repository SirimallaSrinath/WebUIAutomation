package com.cucumberprac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\HP\\git\\repository\\Gmail\\src\\test\\resources\\features\\DataTable.feature",
				glue="\\com\\cucumberprac",
				plugin = "html:ExecutionReport.html")
public class TestRunDataTable extends AbstractTestNGCucumberTests{

}
