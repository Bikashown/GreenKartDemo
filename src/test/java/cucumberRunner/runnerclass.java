package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="Stepdefinations",monochrome=true)
public class runnerclass extends AbstractTestNGCucumberTests{

}
