package com.bleucrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={

                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features ="src/test/resources/features",
        glue="com/bleucrm/step_definitions",
        dryRun=false,
        tags="@AC6"


)
public class CukesRunner {
}
