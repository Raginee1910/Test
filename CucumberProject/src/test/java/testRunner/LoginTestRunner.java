package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\Desktop\\projects\\FirstProject\\src\\test\\java\\feature\\Login.feature"
		,glue={"stepDefinition"},
		monochrome = true
		)

public class LoginTestRunner {

}
