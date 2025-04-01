package com.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage_TestCases {

	@Test
	void TestValidCreds() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
	}
	@Test
	void TestinvalidCreds() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiranss@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12223456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");

	}
}
