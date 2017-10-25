package org.testcraft.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/plan_journey.feature"},
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"org.testcraft.stepDefs"})
public class RunCukesTest {
}