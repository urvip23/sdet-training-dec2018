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

public class CheckOut {

	public void CheckOutItem(WebDriver driver) {

		driver.findElement(By.name("txtCustomerName")).clear();
		driver.findElement(By.name("txtCustomerName")).sendKeys("Urvi");
		driver.findElement(By.name("txtAddress")).clear();
		driver.findElement(By.name("txtAddress")).sendKeys("25944 Amber Valley Pl");
		driver.findElement(By.name("txtCity")).clear();
		driver.findElement(By.name("txtCity")).sendKeys("Aldie");
		driver.findElement(By.name("txtState")).clear();
		driver.findElement(By.name("txtState")).sendKeys("VA");
		driver.findElement(By.name("txtZIP")).clear();
		driver.findElement(By.name("txtZIP")).sendKeys("20105");
		driver.findElement(By.name("txtPhone")).clear();
		driver.findElement(By.name("txtPhone")).sendKeys("6086288993");

		driver.findElement(By.name("optPaymentType")).click();
		driver.findElement(By.name("txtAcctNo")).clear();
		driver.findElement(By.name("txtAcctNo")).sendKeys("1306464654544");
		driver.findElement(By.name("txtCVV2No")).clear();
		driver.findElement(By.name("txtCVV2No")).sendKeys("523");
		driver.findElement(By.name("txtExpDate")).clear();
		driver.findElement(By.name("txtExpDate")).sendKeys("06/2023");

		driver.findElement(By.name("txtshipCustomerName")).clear();
		driver.findElement(By.name("txtshipCustomerName")).sendKeys("Urvi");
		driver.findElement(By.name("txtshipAddress")).clear();
		driver.findElement(By.name("txtshipAddress")).sendKeys("25944 Amber Valley Pl");
		driver.findElement(By.name("txtshipCity")).clear();
		driver.findElement(By.name("txtshipCity")).sendKeys("Aldie");
		driver.findElement(By.name("txtshipState")).clear();
		driver.findElement(By.name("txtshipState")).sendKeys("VA");
		driver.findElement(By.name("txtshipZIP")).clear();
		driver.findElement(By.name("txtshipZIP")).sendKeys("");
		driver.findElement(By.name("txtshipPhone")).clear();
		driver.findElement(By.name("txtshipPhone")).sendKeys("6086288993");
		driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();

		System.out.println("Check out items in Cart functionality implemented here.");

	}

}
