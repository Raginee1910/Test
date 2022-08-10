package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/feature/tags.feature"
		,glue={"stepDefinition"}
//		,tags = "@Regression or @Smoke"
		)
public class tagsAndHooksTestRunner {

}
