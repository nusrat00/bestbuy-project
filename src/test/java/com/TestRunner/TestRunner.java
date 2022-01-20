package com.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Parent_BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/text/resources/inc.Features"},
plugin = {"json:target/cucumber.json"}, glue = "StepDep",tags= {"@health1,@health2,@health3,@health4"})



public class TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void launchURL() {
		
		Parent_BaseClass test = new Parent_BaseClass();
		test.browserinitial();
	}
	
    @AfterTest 
	public void closeURL () {
		//Parent_BaseClass close = new Parent_BaseClass();
		Parent_BaseClass.driver.quit();
	}
}
