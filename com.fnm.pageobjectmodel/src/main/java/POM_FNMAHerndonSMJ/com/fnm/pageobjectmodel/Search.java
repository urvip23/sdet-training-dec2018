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

public class Search {
	
	public void SearchItem(WebDriver driver, String ItemToSearch){
		System.out.println("Search for Item functionality to be implemented here");
		
		driver.findElement(By.name("txtSearch")).clear();
		driver.findElement(By.name("txtSearch")).sendKeys(ItemToSearch);
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		System.out.println("Search for Item functionality implemented ");
	}
	
}
