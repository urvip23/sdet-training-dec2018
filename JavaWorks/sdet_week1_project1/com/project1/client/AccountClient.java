package com.project1.client;

import java.util.Scanner;

import com.project1.dao.AccountDAO;
import com.project1.standards.IAccountDAO;

public class AccountClient {

	public static void main(String[] args) {
		
		//Account a = new Account();
		
		IAccountDAO dao = new AccountDAO();
		
		System.out.println("***************Week 1 Project - Point 1***************");
		System.out.println("------------------------------------List of Accounts---------------------------------");
		//Simpler way to print
		dao.getAllAccts().forEach(
				System.out :: println);
		
		System.out.println();
		System.out.println("***************Week 1 Project - Point 2***************");
				
		//Need to loop here to go through all account
		for(int i=1; i<6; i++) {
			
			System.out.println("Account retrieved is:");
			System.out.println(dao.getAccount(i));
		
			Scanner sc = new Scanner(System.in);
					
			System.out.println("Enter Your Acct Percentage:");
		
		double percentage = Double.parseDouble(sc.next());
		
		System.out.println("Your account percentage is " + percentage);
				
		dao.updateAccount(i, percentage);
		
		System.out.println("Your account has been updated with this data.");
		System.out.println("Updated record: ");
		
		//Update the record with the above percentage
		System.out.println(dao.getAccount(i));
		System.out.println();
		}
		
		System.out.println("-------------------------------List of Accounts after updating Percentage---------------------------------");
		//Simpler way to print
		dao.getAllAccts().forEach(
				System.out :: println);
		
		System.out.println("All records updated!! Goodbye.");

	}

}
