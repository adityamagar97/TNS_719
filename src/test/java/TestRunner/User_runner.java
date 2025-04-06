package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




// @RunWith(Cucumber.class)
@CucumberOptions ( 
		
		features = "/Users/adityamagar/eclipse-workspace/TNS_719/File_feature/userp.feature",
		glue = "StepDefinition",
		monochrome = true
		
		
		)


public class User_runner extends AbstractTestNGCucumberTests {

}
