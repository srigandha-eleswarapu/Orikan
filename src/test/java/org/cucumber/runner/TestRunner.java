package org.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@login",
        features = "src//tests//java//feature",
        glue = "org/cucumber/steps")
public class TestRunner extends AbstractTestNGCucumberTests {

    private static BaseClass refBaseclass;

}
