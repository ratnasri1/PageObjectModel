package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="Feature/Homepage.feature",
		glue={"com.TestCases"},
		plugin = {"html:TestResult","json:jsonResult/Result.json"},
		monochrome=true,
		tags= {"@sc1"}
		)
		

public class RunnerClass {

}
