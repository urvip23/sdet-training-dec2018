/**
 * 
 */
package com.training.sdet.day1.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Urvi
 *
 */

public class DataProvider01 {
	
	@DataProvider
	public Object[][] testdata_shoppingCart() {
		return new Object[][] { 
				//IE has issues with Go xpath
			    new Object[] { "IPhone", "2", "Adam", "MIAMI BEACH", "FL" , "IE"},
				new Object[] { "TV", "3", "Brett", "MANHATTAN", "NY", "CH"},
				new Object[] { "Canon", "4", "Christene", "ALPHARETTA", "GA", "FF"},
				new Object[] { "Echo", "5", "David", "BOSTON", "MA", "CH"} 
			    };
	}

	@Test(dataProvider = "testdata_shoppingCart")
	public void tc_shoppingCartTesting(String item2Search, String qty, String customerName, String customerCity,
			String customerState, String browser) throws InterruptedException, IOException {
		String TestCaseName = "tc_shoppingCartTesting";
		String AUT_URL = "http://sdettraining.com/online/";
		String runTestInBrowser = browser;
				//"Chrome";
		WebDriver driver;

		// DOMConfigurator.configure("log4j.xml");
		System.out.println("TestCase Name is: " + TestCaseName);
		// Log.startTestCase(TestCaseName);

		
		//extentReport = new ExtentReports("C:\\121718\\Reports\\ExtentReport.html");
		//extentTest = extentReport.startTest("tc_shoppingCartTesting");
		
		
		 driver = ReUsableFunctions.OpenBrowser(runTestInBrowser, AUT_URL);

		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// driver = new FirefoxDriver();

	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//	driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get(AUT_URL);

		System.out.println("Opening Browser: " + runTestInBrowser);
		//extentTest.log(LogStatus.INFO, "Opening Chrome Browser");
		// Log.info("Opening Browser: " + runTestInBrowser);
		/*
		 * System.setProperty("webdriver.firefox.marionette",
		 * "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 * driver.get("http://sdettraining.com/online"); Thread.sleep(3000);
		 */

		driver.findElement(By.name("txtSearch")).clear();
		driver.findElement(By.name("txtSearch")).sendKeys(item2Search);
		//extentTest.log(LogStatus.INFO, "Searching Item: " +item2Search);
		// Log.info("Searching for Item: " + item2Search);
		System.out.println("Searching for Item: " + item2Search);

		driver.findElement(By.id("Go")).click();
		driver.findElement(By.xpath("html/body/font/table[1]/tbody/tr[2]/td[3]/a/img")).click();
		//driver.findElement(By.cssSelector("#Go")).click();
		
		driver.findElement(By.name("txtItemQty1")).clear();
		driver.findElement(By.name("txtItemQty1")).sendKeys(qty);
		// Log.info("Qty added to cart: " + qty);
		System.out.println("Qty added to cart: " + qty);

		driver.findElement(By.id("Recalc")).click();
		driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();

		driver.findElement(By.name("txtCustomerName")).clear();
		driver.findElement(By.name("txtCustomerName")).sendKeys(customerName);
		// Log.info("customerName: " + customerName);
		System.out.println("customerName: " + customerName);

		driver.findElement(By.name("txtAddress")).clear();
		driver.findElement(By.name("txtAddress")).sendKeys("123 Main Street");
		driver.findElement(By.name("txtCity")).clear();
		driver.findElement(By.name("txtCity")).sendKeys(customerCity);
		// Log.info("customerCity: " + customerCity);
		System.out.println("customerCity: " + customerCity);

		driver.findElement(By.name("txtState")).clear();
		driver.findElement(By.name("txtState")).sendKeys(customerState);
		// Log.info("customerState: " + customerState);

		driver.findElement(By.name("txtZIP")).clear();
		driver.findElement(By.name("txtZIP")).sendKeys("20121");
		driver.findElement(By.name("txtPhone")).clear();
		driver.findElement(By.name("txtPhone")).sendKeys("7035551414");
		driver.findElement(By.name("optPaymentType")).click();
		driver.findElement(By.name("txtAcctNo")).clear();
		driver.findElement(By.name("txtAcctNo")).sendKeys("412365896541");
		driver.findElement(By.name("txtCVV2No")).clear();
		driver.findElement(By.name("txtCVV2No")).sendKeys("123");
		driver.findElement(By.name("txtExpDate")).clear();
		driver.findElement(By.name("txtExpDate")).sendKeys("02/2019");
		driver.findElement(By.name("txtshipCustomerName")).clear();
		driver.findElement(By.name("txtshipCustomerName")).sendKeys("Trump");
		driver.findElement(By.name("txtshipAddress")).clear();
		driver.findElement(By.name("txtshipAddress")).sendKeys("6 Pennsylvania Ave");
		driver.findElement(By.name("txtshipCity")).clear();
		driver.findElement(By.name("txtshipCity")).sendKeys("Washington");
		driver.findElement(By.name("txtshipState")).clear();
		driver.findElement(By.name("txtshipState")).sendKeys("DC");
		driver.findElement(By.name("txtshipZIP")).clear();
		driver.findElement(By.name("txtshipZIP")).sendKeys("20888");
		driver.findElement(By.name("txtshipPhone")).clear();
		driver.findElement(By.name("txtshipPhone")).sendKeys("2021114455");

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,
				new File("C:\\Users\\Huser\\Documents\\screenshots\\" + customerName + "screenshot.jpg"));

		driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
		String orderConfirmation = driver.findElement(By.cssSelector("h2")).getText();
		// System.out.println("orderConfirmation: " + orderConfirmation);
		// Log.info("orderConfirmation: " + orderConfirmation);

		System.out.println("Order Confirmation Message: " + orderConfirmation);

		driver.quit();
		System.out.println("End executing TestCaseName: " + TestCaseName);
//		 Log.endTestCase(TestCaseName);
//		 extentReport.endTest(extentTest);
//		 extentReport.flush();
//		 extentReport.close();
	}

}
