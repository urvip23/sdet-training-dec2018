package com.training.sdet.day1.selenium.webdriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;

public class TestNG_ShoppingCart {

private static final String priority = null;

//LOGIN GROUP
  @BeforeGroups("Login")
  public void BeforeLogin(){
	  System.out.println("This is Before Group for Login tests");
  }
	
	
  @Test(groups = { "Login" }, priority=0)
  public void LoginTest1() {
	  System.out.println("This test is for Login functionality 1");
  }
  
  @Test(groups = { "Login" }, priority=1)
  public void LoginTest2() {
	  System.out.println("This test is for Login functionality 2");
  }
  
  @AfterGroups("Login")
  public void AfterLogin(){
	  System.out.println("This is After Group for Login tests");
  }
  
  @Test(priority=2)
  public void SearchTest() {
	  System.out.println("This test is for Search");
  }
  
  @Test(priority=3)
  public void AddItemTest() {
	  System.out.println("This test is for Adding Item to Cart");
  }
  
  @Test(priority=4)
  public void ModifyItemTest() {
	  System.out.println("This test is for Modifying Item in Cart");
  }
  
  @Test(priority=5)
  public void CheckoutTest() {
	  System.out.println("This test is for Checkout");
  }
  
  @Test(priority=6)
  public void OrderPlacedTest() {
	  System.out.println("This test is for Order confirmation");
  }
 

}
