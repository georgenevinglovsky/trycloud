package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        publish = true,
        features = "src/test/resources/features",//content
        glue = "com/trycloud/step_definition",//source
        dryRun = false,
        tags = "@US12"
)
public class CukesRunner {
}
