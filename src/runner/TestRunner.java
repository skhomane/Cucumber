package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,features="src\\feature",glue={"stepdefinition"},
monochrome=true,tags={"@Browser2,@Browser1"})

public class TestRunner {

}
