package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Features",glue="scripts",tags="@validDetails,@invalidDetails")
public class Run_1 extends AbstractTestNGCucumberTests {

}
