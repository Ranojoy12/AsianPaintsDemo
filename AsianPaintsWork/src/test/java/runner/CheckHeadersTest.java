package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/headers_information.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Information"})
public class CheckHeadersTest extends AbstractTestNGCucumberTests {

}
