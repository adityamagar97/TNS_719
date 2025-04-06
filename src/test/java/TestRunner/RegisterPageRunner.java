package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "/Users/adityamagar/eclipse-workspace/TNS_719/File_feature/Register.feature",
		glue= "RegisterStepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = ("html:target/cucumbesr_report.html\"")
		
		
		)

public class RegisterPageRunner extends AbstractTestNGCucumberTests{

}
