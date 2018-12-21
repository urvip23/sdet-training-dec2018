/**
 * 
 */
package POM_FNMAHerndonSMJ.com.fnm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Urvi
 *
 */

public class OrderConfirmation {
	
	public void OrderConfirmPage(WebDriver driver){
		String OrderConfirmationMessage = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println("Order number: " + OrderConfirmationMessage);
		System.out.println("Order confirmation page functionality implemented here.");
	
	}

}
