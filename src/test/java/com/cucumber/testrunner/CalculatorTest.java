package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "Features" }, 
        glue = { "com.cucumber.stepdefcode" }, 
        plugin = { "pretty","html:target/cucumber-report/report.html" },
        monochrome=true,
        tags="@DataDriven"

)

public class CalculatorTest {

}
