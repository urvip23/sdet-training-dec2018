/**
 * 
 */
package com.training.sdet.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Urvi
 *
 */

public class TestNGParametersDemo_XMLfile {
	
	WebDriver driver;
	String Pet;
	String BROWSER;
	

	@BeforeClass
	   @org.testng.annotations.Parameters(value={"pet","browser","version","platform"})
		
		
	    public void setUp(String pet, String browser, String version, String platform) throws Exception{
		
			BROWSER= browser;
			Pet = pet;
	}
		
//		if(browser.equals("firefox")){
//			
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//			driver = new FirefoxDriver();
//			System.out.println("Running test in browser..." + browser);
//			
//		}
//		else if (browser.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			driver = new ChromeDriver();
//			System.out.println("Running test in browser..." + browser);
//		}
//		else 
//		{
//			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
//			System.out.println("Running test in browser..." + browser);
//		}
//		
//		
//	}
	
	@Test(priority=0)
	public void tc_UsePetData(){
		System.out.println("This is coming from TestNG: " + Pet);
	}
	
//	@AfterClass
//	
//	}
	

}
