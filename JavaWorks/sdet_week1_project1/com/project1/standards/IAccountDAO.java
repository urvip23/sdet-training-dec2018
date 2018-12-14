package com.project1.standards;

import java.util.List;

import com.project1.entity.Account;

public interface IAccountDAO {
	
	//Display all accounts
	public List<Account> getAllAccts();
	
	//Update Account with Percentage
	public boolean updateAccount(int acctId, 
			double percent);
	
	//Get Account with acctId
	public Account getAccount(int acctId);
	
	
}
