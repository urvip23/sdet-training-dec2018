/**
 * 
 */
package POM_FNMAHerndonSMJ.com.fnm.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Urvi
 *
 */

public class DriverScript {
	
	WebDriver driver;
	String AUTUrl;
	String ItemToSearch = "Echo";
		
	@BeforeClass
	public void setUp(){
		
		//System.out.println("Browser gets prepared here and will navigate to the AUT");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		AUTUrl = "http://www.sdettraining.com/online/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AUTUrl);
	}
	
	@Test
	public void tc_End2EndShoppingCartTest(){
		
		//SEARCH
		System.out.println("Step 1: Search Class/Page Object called");
		Search sp = new Search();
		sp.SearchItem(driver, ItemToSearch);
		
		//ADD TO CART
		System.out.println("Step 2: AddToCart Class/Page Object called");
		AddToCart atc = new AddToCart(); 
		atc.AddToCartItem(driver);
		
		//MODIFY CART
		System.out.println("Step 3: ModifyCart Class/Page Object called");
		ModifyCart mc = new ModifyCart();
		mc.ModifyCartItem(driver);
		
		//CHECKOUT
		System.out.println("Step 4: CheckOut Class/Page Object called");
		CheckOut co = new CheckOut();
		co.CheckOutItem(driver);
		
		//ORDER CONFIRM
		System.out.println("Step 5: OrderConfirmation Class/Page Object get called");
		System.out.println("Step 6: Verify that order has been placed code get executed");
		
		OrderConfirmation oc = new OrderConfirmation();
		oc.OrderConfirmPage(driver);
	
		
		}
	
	@AfterTest
	public void tearDown(){
		System.out.println("Browser will get closed");
		//driver.quit();
		
	}

}
