/**
 * 
 */
package com.training.day4.seleniumgrid.saucelabs;

/**
 * @author Urvi
 *
 */

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridTests {

	static WebDriver driver;
	static String baseURL;
	String nodeURL;

	@Test
	@Parameters("browserType")
	public void GridTest(String browserType) throws MalformedURLException {

		DesiredCapabilities dr = null;

		//String browserType = "internet explorer";
		if (browserType.equals("firefox")) {

			dr = DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			dr.setPlatform(Platform.WINDOWS);
            
		} 
		else if  (browserType.equals("chrome"))
		{
			dr = DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
		}
		else 
		{
			dr = DesiredCapabilities.internetExplorer();
			dr.setBrowserName("internet explorer");
			dr.setPlatform(Platform.WINDOWS);
		}

		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
		System.out.println("Browser opened: " + browserType);
		driver.navigate().to("http://www.facebook.com/");

		driver.manage().window().maximize();

		System.out.println("Page title is: " + driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("urvip23@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
		// Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();

		driver.quit();
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		baseURL = "http://amazon.com/";
		nodeURL = "http://127.0.0.1:4444//wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");

		// DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setPlatform(Platform.WIN10);
		// driver = new RemoteWebDriver(new URL(nodeURL), cap);

		driver = new RemoteWebDriver(new URL(nodeURL), capability);

		/*
		 * baseURL = "http://amazon.com/"; DesiredCapabilities caps =
		 * DesiredCapabilities.chrome(); ChromeOptions options = new ChromeOptions();
		 * options.addArguments("disable-infobars");
		 * caps.setCapability(ChromeOptions.CAPABILITY, options); driver = new
		 * RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), caps);
		 */
	}

	
	public void afterTest() {
		//driver.quit();
	}
}
