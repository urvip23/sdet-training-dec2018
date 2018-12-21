/**
 * 
 */
package com.training.sdet.cucumber.CucumberDemo;

/**
 * @author Urvi
 *
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ddtLoginInvalid_stepdef {
	
	WebDriver driver;
	
	@Given("^A User is on the Login Page$")
	public void a_User_is_on_the_Login_Page() throws Throwable {
		System.out.println("INSIDE A_User_is_on_the_website");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/"); 
	}
	
	@When("^User enters an invalid \"([^\"]*)\"$")
	public void user_enters_an_invalid(String un) throws Throwable {
	   System.out.println("Entering username as : " + un);
	   driver.findElement(By.id("email")).sendKeys(un);
	}

	@When("^enters an invalid \"([^\"]*)\"$")
	public void enters_an_invalid(String pwd) throws Throwable {
			System.out.println("Entering password as : " + pwd);
			driver.findElement(By.cssSelector("#pass")).sendKeys(pwd);
		}
	
	@When("^User clicks on the Sign in button$")
	public void user_clicks_on_the_SignIn_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.id("u_0_2")).click();
		driver.quit();
	}
	
	@Then("^User must not be able to log in to the application$")
	public void user_must_not_be_able_to_log_in_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Login Failed. Invalid username or password. Please try again.");
	}


}