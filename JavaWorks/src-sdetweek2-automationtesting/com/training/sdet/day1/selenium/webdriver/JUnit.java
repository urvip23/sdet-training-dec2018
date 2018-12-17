/**
 * 
 */
package com.training.sdet.day1.selenium.webdriver;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Urvi
 *
 */

public class JUnit {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	
	@Test
	public void testVerifyHomePage() throws Exception {
		driver.get(baseUrl + "/");
		String actualPageTitle = driver.getTitle();
		String pageTitle = "Facebook - Log In or Sign Up";
		Assert.assertEquals(actualPageTitle,pageTitle);
		System.out.println("This is Test Case 1");
	}
	
	@Test
	public void testLogin() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("email")).sendKeys("urvip23@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
		driver.findElement(By.id("u_0_2")).click();
	
		String expectedValue = "The password you’ve entered is incorrect. Forgot Password?";
		String actualValue;
		actualValue = "";
		actualValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
		Assert.assertEquals(actualValue,expectedValue);
		System.out.println("This is Test Case 2");
		
	}
	
	@Test
	public void testText() throws Exception{
		driver.get(baseUrl + "/");
		String actualText = driver.findElement(By.id("blueBarDOMInspector")).getText();
		System.out.println(actualText);
		System.out.println("This is Test Case 3");
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

}
