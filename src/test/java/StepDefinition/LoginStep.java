package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	
	
	WebDriver driver ;
	
	
	@Given("User should open chrome browser")
	public void user_should_open_chrome_browser() {

		driver= new ChromeDriver();
		driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
	}
//	@Then("page should navigate to home page")
//	public void page_should_navigate_to_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//


	
	@When("user enter username")
	public void user_enter_username() {
	    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	}

	@And("user enter password")
	public void user_enter_password() {
	    driver.findElement(By.id("password")).sendKeys("123456");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}


	@Then("page should navigate to home page")
	public void page_should_navigate_to_home_page() {
		 Assert.assertEquals(driver.getCurrentUrl(), "file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
	}



	@And("close the browser")
	public void close_the_browser() {
	   // driver.quit();
	}

	

}
