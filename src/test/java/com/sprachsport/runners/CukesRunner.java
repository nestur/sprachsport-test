package com.sprachsport.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/sprachsport/step_definitions",
        strict = true,
        dryRun = false,
        tags = "@navigate"
)

public class CukesRunner {
}
