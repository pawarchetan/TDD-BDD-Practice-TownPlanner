package com.valtech.townplanner.feature.newspaper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/feature/newspaper/newspapers.feature")
public class RunCucumberTest {

}
