package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/src/test/resources/FeatureWithTags", 
glue= {"StepDefinitions"},
tags = {"@smoke"}

		)
public class TestRunner_RunWithMultipleTags {

}
