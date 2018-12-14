package com.project1.account.test;

import static org.junit.Assert.*;

import javax.print.DocFlavor.STRING;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project1.client.AccountTransactionsLogic;
import com.project1.entity.Account;

public class AccountTransactionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is the start of the JUnit Test for Account Transactions Logic");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is the end of the JUnit Test for Account Transactions Logic");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start of a method test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of a method test");
	}

	AccountTransactionsLogic atl = null;
	
	//100 ms check
	@Test(timeout = 1000)
	public void getAllAcctsTest(){
		AccountTransactionsLogic atl = new AccountTransactionsLogic();
			
		int retVal = atl.getAllAccounts();
		
		assertEquals(1, retVal); //1 is pass for retrieve
	}
		
	@Test(timeout = 100)
	public void updateAcctPercentTest(){
		AccountTransactionsLogic atl = new AccountTransactionsLogic();
		
		int retVal = atl.updateAccount(3,45);
		assertEquals(2, retVal); // 2 is pass for update percent
		
	}
	
	@Test(timeout = 1000)
	public void getAccountByIdTest(){
		AccountTransactionsLogic atl = new AccountTransactionsLogic();
		String expVal = "Account [acctId=3, acctNo=C103, acctBal=3000.0, avgBal=2500.0, percent=45.0]";
		Account actVal = atl.getAccountById(3);
		assertEquals(expVal, actVal.toString());
	}


}
