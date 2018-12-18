/**
 * 
 */
package com.training.sdet.day1.selenium.webdriver.junit;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Urvi
 *
 */
@RunWith(Parameterized.class)
public class JUnit_DDT {
	
	private String platform;
	private String browser;
	private String AUT;
	
	@Parameterized.Parameters
	public static LinkedList<String[]> getEnvironments() throws Exception{
		LinkedList<String[]> env = new LinkedList<String[]>();
		env.add(new String[] { Platform.WINDOWS.toString(), "ie", "http://www.amazon.com"});
		env.add(new String[] { Platform.WINDOWS.toString(), "ie", "http://www.facebook.com"});
		env.add(new String[] { Platform.WINDOWS.toString(), "chrome", "http://www.fanniemae.com"});
		env.add(new String[] { Platform.WINDOWS.toString(), "chrome", "http://www.sdettraining.com"});
		
		//add more browsers
		
		return env;
		
	}
	
	//Parameterized constructor
	public JUnit_DDT(String platform, String browser, String AUT){
		this.platform = platform;
		this.browser = browser;
		this.AUT = AUT;
	}
	
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//BROWSER=browserName;
		if(browser.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			System.out.println("Running test in browser..." + browser);
			
		}
		else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Running test in browser..." + browser);
		}
		else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Running test in browser..." + browser);
		}
		else {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Running test in browser..." + browser);
		}
		
		baseUrl = AUT;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void testVerifyHomePage() throws Exception {
		driver.get(baseUrl + "/");
		
		String actualPageTitle = driver.getTitle();

		System.out.println("Navigated to: " + AUT + " and got Page title as: " 
						+ actualPageTitle);
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	
  }
