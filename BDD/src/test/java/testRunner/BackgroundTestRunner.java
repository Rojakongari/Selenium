package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/BackgroundFeature/Background.feature", glue= {"StepsforBackground"},
monochrome= true,
plugin = {
		"html:target/HtmlReports/htmlReports.html"})
		
public class BackgroundTestRunner {

}

