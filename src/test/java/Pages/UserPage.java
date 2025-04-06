package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UserPage {

	@FindBy(xpath = "//*[@id=\"username\"]") WebElement username;
	@FindBy(xpath = "//*[@id=\"mobile\"]") WebElement mobile ;
	@FindBy(xpath = "//*[@id=\"email\"]") WebElement email;
	@FindBy(xpath = "//*[@id=\"course\"]") WebElement course;
	@FindBy(xpath = "//*[@id=\"Male\"]") WebElement male;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select") WebElement state;
	@FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"submit\"]") WebElement submit;
	
	
	
	
public 	WebDriver driver;
	
	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void usern(String unm) {
		username.sendKeys(unm);
	}
	public void phone(String mob) {
		mobile.sendKeys(mob);
	}
	public void mail(String ema) {
		email.sendKeys(ema);
	}
	public void cor(String sub) {
		course.sendKeys(sub);
	}
	public void mal() {
		male.click();;
	}
	
	  public void selectFirstStateOption() {
	        Select dropdown = new Select(state);
	        dropdown.selectByIndex(1);
	    }

	public void paswor(String pass) {
		password.sendKeys(pass);
	}
	public void subm() {
		submit.click();
	}
	public void aleartt() {
		
		try {
	        // Switch to alert and accept it
	        Alert alert = driver.switchTo().alert();
	        alert.accept(); // Clicks "OK" button
	        System.out.println("Alert accepted successfully.");
	    } catch (NoAlertPresentException e) {
	        System.out.println("No alert found.");
	    }}

	
	
}
