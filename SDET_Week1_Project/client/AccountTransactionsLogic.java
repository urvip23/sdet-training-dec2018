package com.project1.client;

import java.util.Scanner;

import com.project1.dao.AccountDAO;
import com.project1.standards.IAccountDAO;

public class AccountTransactionsLogic {
	
	IAccountDAO dao = new AccountDAO();
	
	//Get and display all accounts transaction
	public int getAllAccounts() {
		System.out.println("***************Week 1 Project - Point 1***************");
		System.out.println("------------------------------------List of Accounts---------------------------------");
		dao.getAllAccts().forEach(
				System.out :: println);
		System.out.println();
		
		return 1;
		
	}
	
	//Update account transaction
	public int updateAccount(int acctid, double percent){
		System.out.println("***************Week 1 Project - Point 2***************");
		
		//Need to loop here to go through all account
		
						
		dao.updateAccount(acctid, percent);
		
		System.out.println("Your account has been updated.");
		
		dao.getAllAccts().forEach(
				System.out :: println);
		
		return 2;
		
	}
	
}
