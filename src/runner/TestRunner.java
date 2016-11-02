package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,features="src\\feature",glue={"stepdefinition"},
monochrome=false,tags={"@Browser1"})

public class TestRunner {

}
