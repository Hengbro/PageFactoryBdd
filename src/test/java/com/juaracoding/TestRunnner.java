package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/main/resources/features/login.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)
@Test
public class TestRunnner extends AbstractTestNGCucumberTests {

}
