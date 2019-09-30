package testbatchrunner_casestudy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="Features_casestudy",glue="stepdef_casestudy",tags="@Login",plugin= {"json:target/cucumber-json-report.json"})
public class TestRunner {
 
}
