/**
 * 
 */
package com.training.sdet.day1.selenium.webdriver.junit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Urvi
 *
 */

public class WebDriver_Intro {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		System.out.println("Page title is: " + driver.getTitle()); 
		
		driver.findElement(By.id("email")).sendKeys("urvip23@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
		driver.findElement(By.id("u_0_2")).click();
	
		String expectedValue = "The password you’ve entered is incorrect. Forgot Password?";
		//Use below expectedValue for Test Case to Fail	
		//"The password you've entered doesn't match your account.";
		String actualValue;
		//Thread.sleep(3000);
		actualValue = "";
//		actualValue = driver.
//				findElement(By.cssSelector(
//						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer")).getText();
		//Using XPath	
		actualValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
		
		System.out.println("Actual value is: " + actualValue);
		
		if(expectedValue.equals(actualValue)){
			System.out.println("TEST PASSED");
		}
		
		else 
			System.out.println("TEST FAILED");
			driver.close();
	}

}
