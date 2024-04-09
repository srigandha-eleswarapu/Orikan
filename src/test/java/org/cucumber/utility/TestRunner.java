package org.cucumber.utility;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@Scenario2",
        features = "src//test//java//feature",
        glue = "org.cucumber.steps",
        plugin = {"pretty", "html:Test-Output/cucumber-reports"},
        monochrome= true)
public class TestRunner extends AbstractTestNGCucumberTests {

    private static BaseClass refBaseclass;

}
