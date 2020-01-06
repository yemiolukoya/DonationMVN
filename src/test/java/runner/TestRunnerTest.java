package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "feature"
		features = "/Users/yemioluv/eclipse-workspace/donationMvn/src/test/java/features/£20SingleDonation.feature", 
		glue = { "steps" },
		format = {"pretty", "html:test-output", "json:json_output/cuccmber.json", "junit:junit_xml/cucumber.xml",
				 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html"},
		// tags= {"@random"},
		monochrome = true, 
		strict = true
//		dryRun = true

)

public class TestRunnerTest {

}
