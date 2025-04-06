package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep {

	
	
	WebDriver driver ;
	UserPage up;

	@Given("chrome browser should open")
	public void chrome_browser_should_open() {
		driver = new ChromeDriver();
		driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html?gender=Female");
		up = new UserPage(driver);
	}
	@When("enter username")
	public void enter_username() {
	    up.usern("aditya");
	}
	@When("enter mobileno")
	public void enter_mobileno() {
	    up.phone("7776836496");
	}
	@When("enter email")
	public void enter_email() {
	   up.mail("adity@gmail.com");
	}
	@When("enter subject")
	public void enter_subject() {
	    up.cor("Java");
	}
	@When("select gender")
	public void select_gender() {
	    up.mal();
	}
	@When("select state")
	public void select_state() {
	    up.selectFirstStateOption();
	}
	@When("enter password")
	public void enter_password() {
	   up.paswor("asd");
	}
	@When("press submit")
	public void press_submit() throws InterruptedException {
	   up.subm();
	   
	   Thread.sleep(2000);
	}
	@When("press ok")
	public void press_ok() {
	    up.aleartt();
	   
	}
	








}
