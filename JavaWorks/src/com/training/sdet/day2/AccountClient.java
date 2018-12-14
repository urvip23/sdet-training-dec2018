package com.training.sdet.day2;

import java.util.Arrays;
import java.util.Comparator;

public class AccountClient {

	public static void main(String[] args) {
		Account [] accts = new Account[5];
		
		accts[0] = new Account("John",5000);
		accts[1] = new Account("Frank",6000);
		accts[2] = new Account("Brian",7000);
		accts[3] = new Account("Ethan",8000);
		accts[4] = new Account("Becky",9000);
		
		System.out.println("Sorting based on Name");
		Arrays.sort(accts);
				
		for(Account temp : accts){
			System.out.println(temp);
		}
		
		//Sort Option 1
		//Comparator<Account> compareBasedOnBalance = new Comparator<Account>(){
		
//		@Override
//		public int compare(Account o1, Account o2){
//			return ((int)o1.getBalance() - o2.getBalance());
//		}
//	};
		
		//Sort Option 2
		
		Arrays.sort(accts, new Comparator<Account>(){
		
			public int compare(Account o1, Account o2){
				return (int)(o1.getBalance() - o2.getBalance());
				}
		});

		//Option 3 - Sort by using Lambda expression
		//Arrays.sort(accts,(o1,o2) -> (int)(o1.getBalance() - o2.getBalance()));
		
		System.out.println();
		System.out.println("Sorting based on Balance");
		for(Account temp : accts)
			System.out.println(temp);
		}
		
	}
