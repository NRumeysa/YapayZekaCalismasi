package com.rumeysablog.runners;

import com.rumeysablog.utils.RetryAnalyzer;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.rumeysablog.steps", "com.rumeysablog.hooks"},
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.html"
        },
        monochrome = true,
        dryRun = false,
        publish = true
)
public class TestRunner {
    @Rule
    public RetryAnalyzer retry = new RetryAnalyzer(2);
}
