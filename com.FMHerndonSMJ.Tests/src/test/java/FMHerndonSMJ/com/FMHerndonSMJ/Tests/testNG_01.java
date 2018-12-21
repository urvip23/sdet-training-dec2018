/**
 * 
 */
package FMHerndonSMJ.com.FMHerndonSMJ.Tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

/**
 * @author Urvi
 *
 */

public class testNG_01 {
	
	WebDriver driver;
	String baseUrl;
	
	@BeforeMethod
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
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is Test Case 1");
		
	}
	
	

}
