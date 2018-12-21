/**
 * 
 */
package com.training.sdet.cucumber.CucumberDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Urvi
 *
 */

public class LoginFB_StepDefinitions {
	
	WebDriver driver2;
	String Url;
	
	
	@Given("^A User is on the website$")
	public void a_User_is_on_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver2 = new ChromeDriver();
		Url = "https://www.facebook.com/";
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Page title is: " + driver2.getTitle()); 
		
	}
	
	
	@When("^User types UserName$")
	public void user_types_UserName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver2.findElement(By.cssSelector("#email")).sendKeys("urvip23@gmail.com");
		
		
	}
	

	@When("^Usertypes Password$")
	public void usertypes_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver2.findElement(By.cssSelector("#pass")).sendKeys("annika4ansh");
		
	}
	
	@When("^User types invalidUserName$")
	public void user_types_invalidUserName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver2.findElement(By.cssSelector("#email")).sendKeys("abc23@gmail.com");
	}

	@When("^Usertypes invalidPassword$")
	public void usertypes_invalidPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver2.findElement(By.cssSelector("#pass")).sendKeys("P@assword1");
	}


	@When("^User clicks on the submit button$")
	public void user_clicks_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver2.findElement(By.id("u_0_2")).click();
	}
	
	@Then("^User must log in successfully$")
	public void user_must_log_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("User login successful");
		driver2.quit();
	}

}
