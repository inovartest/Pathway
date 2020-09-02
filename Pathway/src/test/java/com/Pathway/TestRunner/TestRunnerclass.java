package com.Pathway.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src\\test\\java\\com\\Pathway\\Base\\Featurefiles\\FullRenewalflow.feature","src\\test\\java\\com\\Pathway\\Base\\Featurefiles\\FullCancelationFlow.feature","src\\test\\java\\com\\Pathway\\Base\\Featurefiles\\FullBuildOutflow.feature","src\\test\\java\\com\\Pathway\\Base\\Featurefiles\\PartialCancelation.feature"},glue= "com.Pathway.Stepdefinations",
monochrome = true,dryRun = false,strict = true,
format = {
        "pretty",
        "html:test-output",
       "json:target/Pathwayreports/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ninthbuildreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter",
         "junit:junit_xml/cucumber.xml"})
public class TestRunnerclass  extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/extentreport.xml");
        
    }
    
    
}






