/**
 * 
 */
package FMHerndonSMJ.com.FMHerndonSMJ.Tests;

/**
 * @author Urvi
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class DDT_DB {
	
private WebDriver driver = null;
String DBDataInLocalArray[][]=null;
int numOfRows = 0;
	
	@Test
	public void tc_Login() throws Exception{
		
		String AUT_URL = "http://sdettraining.com/trguitransactions/Account.aspx";
		String runTestInBrowser="Chrome";
		WebDriver driver;
		
		
		FetchDBData();
		
		for(int i=0; i<numOfRows; i++){	
			System.out.println("Putting it in the varaible in the testcase: " + DBDataInLocalArray[i][0]);
			String vFirtName= DBDataInLocalArray[i][0];                   //"Inga";
			String vLastName=DBDataInLocalArray[i][1];                   //"Selenium";
			String vEmail=DBDataInLocalArray[i][2];                   //"inga.selenium@tr.com";
			String vPassword=DBDataInLocalArray[i][3];                   //"Passw0rd";
			String vVerifyPassword=DBDataInLocalArray[i][3];
			String vHomePhone=DBDataInLocalArray[i][4];                   //"9638259999";
			String vCellPhone=DBDataInLocalArray[i][4];
			String vInstructions=DBDataInLocalArray[i][5];                   //"D7 of March 2017 Batch";
			
	  
	     driver = ReUsableFunctions.OpenBrowser(runTestInBrowser, AUT_URL);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //get the reference for Web Element Email
	 //     WebElement loginButton = driver.findElement(By.id("HeadLoginView_HeadLoginStatus"));
	 //     loginButton.click();
	    
	//      Thread.sleep(2000);
	      driver.findElement(By.linkText("CREATE ACCOUNT")).click();
	    
	    driver.findElement(By.id("MainContent_txtFirstName")).clear();
	    driver.findElement(By.id("MainContent_txtFirstName")).sendKeys(vFirtName);
	    Thread.sleep(2000);
	    driver.findElement(By.id("MainContent_txtLastName")).clear();
	    driver.findElement(By.id("MainContent_txtLastName")).sendKeys(vLastName);
	    driver.findElement(By.id("MainContent_txtEmail")).clear();
	    driver.findElement(By.id("MainContent_txtEmail")).sendKeys(vEmail);
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys(vPassword);
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).clear();
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys(vVerifyPassword);
	    driver.findElement(By.id("MainContent_txtHomePhone")).clear();
	    driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys(vHomePhone);
	    driver.findElement(By.id("MainContent_txtCellPhone")).clear();
	    driver.findElement(By.id("MainContent_txtCellPhone")).sendKeys(vCellPhone);
	    driver.findElement(By.id("MainContent_txtInstructions")).clear();
	    driver.findElement(By.id("MainContent_txtInstructions")).sendKeys(vInstructions);
	    driver.findElement(By.id("MainContent_btnSubmit")).click();
	    //Assert.assertEquals("Customer information added successfully", driver.findElement(By.id("MainContent_lblTransactionResult")).getText());
	    driver.quit();
	}
	
}
	
	
	
	 
	 
	 public void FetchDBData() throws Exception{
		 
		 String connectionString=null;
		 String DBSqlServerDriver=null;
		 String sqlQuery=null;
		
		 connectionString = "jdbc:sqlserver://sql2k801.discountasp.net:1433;databasename=SQL2008_841902_tr;user=SQL2008_841902_tr_user;password=52645264hrm";
		 DBSqlServerDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 
		 sqlQuery="select * from TRCustTestData order by CustFirstName";
		 
	 try{
			 
			 Class.forName(DBSqlServerDriver);
			 Connection oConn = DriverManager.getConnection(connectionString);
			 Statement oStmt = oConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			 
			 ResultSet oRslt =   oStmt.executeQuery(sqlQuery);
			 
			 oRslt.last();
			 numOfRows =  oRslt.getRow();
			 
			 System.out.println("Total Records from DB: " + numOfRows);
			 oRslt.beforeFirst();
			 
			 
			 
			 DBDataInLocalArray = new String[numOfRows][6];
			 
			 int i=0;
			 while(oRslt.next()){
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustFirstName"));
				 DBDataInLocalArray[i][0] =   oRslt.getString("CustFirstName");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustLastName"));
				 DBDataInLocalArray[i][1] =   oRslt.getString("CustLastName");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustEmail"));
				 DBDataInLocalArray[i][2] =   oRslt.getString("CustEmail");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustPassword"));
				 DBDataInLocalArray[i][3] =   oRslt.getString("CustPassword");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustHomePhone"));
				 DBDataInLocalArray[i][4] =   oRslt.getString("CustHomePhone");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustInstructions"));
				 DBDataInLocalArray[i][5] =   oRslt.getString("CustInstructions");
				 i=i+1;
			 }
			 
			// oRslt.close();
			// oConn.close();
			 
		 }
		 catch(Exception e){
			 System.err.println("Error occured while connecting to the DB: " + e.getMessage());
		 }
	 }

}