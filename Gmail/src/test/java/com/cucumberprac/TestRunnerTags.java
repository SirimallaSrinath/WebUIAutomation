package com.cucumberprac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\HP\\git\\repository\\Gmail\\src\\test\\resources\\features\\SwagLabsTags.feature",
				glue="\\com\\cucumberprac",
						//tags="@Regression or @Integration",
						//tags = "@Regression"
				tags = "~@Regression or @Integration",
				plugin = "html:ExecutionReport.html")
public class TestRunnerTags extends AbstractTestNGCucumberTests{

}
