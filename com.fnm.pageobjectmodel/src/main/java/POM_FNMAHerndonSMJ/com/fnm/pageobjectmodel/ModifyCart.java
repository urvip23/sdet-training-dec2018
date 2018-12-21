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

public class ModifyCart {
	
	public void ModifyCartItem(WebDriver driver){
		
		driver.findElement(By.name("txtItemQty1")).clear();
	    driver.findElement(By.name("txtItemQty1")).sendKeys("3");
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[2]")).click();
        // next line is clicking on proceed to checkout
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
		
	    System.out.println("Modify Item in Cart functionality implemented here.");
	}

}
