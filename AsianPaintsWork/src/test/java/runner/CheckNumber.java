package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/UnregisteredNo.feature",glue= {"stepDefinition"},plugin= {"json:target/json/result.json"})
public class CheckNumber extends AbstractTestNGCucumberTests {

}
