package com.columbia.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/com/columbia/features"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = "com.columbia.stepdef",
        tags = "not @wip")
public class TestRunner extends AbstractTestNGCucumberTests {
}
