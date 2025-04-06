package TestRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "/Users/adityamagar/eclipse-workspace/TNS_719/File_feature/Login.feature",
		glue= "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin=("html:target/cucumber_report.html")
		
		
		)



public class LoginRunner extends AbstractTestNGCucumberTests {
	
	

}
