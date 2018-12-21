/**
 * 
 */
package com.training.sdet.cucumber.CucumberDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Urvi
 *
 */

public class VerifyTitle_StepDefinitions {
	
	WebDriver driver;
	String baseUrl;
	String actualPageTitle;
		
	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^User checks the title$")
	public void user_checks_the_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
			driver.get(baseUrl + "/");
			actualPageTitle = driver.getTitle();
			System.out.println("Page title is: " +  actualPageTitle);
					
		}
	

	@Then("^It must say \"([^\"]*)\"$")
	public void it_must_say(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(actualPageTitle,expectedTitle);
		System.out.println("The page title verified.");
		driver.quit();
	}

}
