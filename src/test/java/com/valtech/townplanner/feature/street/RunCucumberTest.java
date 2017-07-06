package com.valtech.townplanner.feature.street;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/feature/street/street.feature")
public class RunCucumberTest {
}
