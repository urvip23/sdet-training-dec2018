/**
 * 
 */
package FMHerndonSMJ.com.FMHerndonSMJ.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Urvi
 *
 */

public class testNG_02 {
	
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
	public void testText() throws Exception{
		driver.get(baseUrl + "/");
		String expectedText = "Facebook";
		String actualText = driver.findElement(By.cssSelector("#blueBarDOMInspector > div > div > div > div.lfloat._ohe > h1 > a > i")).getText();
		//System.out.println(actualText);
		Assert.assertEquals(expectedText,actualText);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is Test Case 2");
		
	}

}
