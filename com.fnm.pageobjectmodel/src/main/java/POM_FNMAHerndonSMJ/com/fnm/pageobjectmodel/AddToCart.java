/**
 * 
 */
package POM_FNMAHerndonSMJ.com.fnm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Huser
 *
 */

public class AddToCart {
	
	public void AddToCartItem(WebDriver driver){
		//System.out.println("Add Item to Cart functionality to be implemented here");
		
		driver.findElement(By.xpath("//td[3]/a/img")).click();
		System.out.println("Add to Cart Item functionality implemented.");
		
		
	}

}
