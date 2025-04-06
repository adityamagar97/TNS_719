package RegisterStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.RegisterPage;

public class RegisterStepDef {

	
	WebDriver driver ;
	RegisterPage rp ;
	

	@Given("register page should open")
	public void register_page_should_open() {
		driver = new ChromeDriver();
		rp = new RegisterPage(driver);
		driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/register.html");
	}
	@When("user enter name")
	public void user_enter_name() {
	 rp.enternamee("Aditya");
	
	}
	@When("user enter mobile no")
	public void user_enter_mobile_no() {
		rp.enterPhoneno("7776836496");
	}
	@When("user enter email id")
	public void user_enter_email_id() {
		 rp.emaill("adityamagar06@g");
	}
	@When("user enter password")
	public void user_enter_password() {
		 rp.Password("adiaia");
	}
	@Then("user should be registered")
	public void user_should_be_registered() {
		 rp.Signin();
	}
	@Then("click on alert")
	public void click_on_alert() {
		 rp.aleartt();
	}



	
	
}
