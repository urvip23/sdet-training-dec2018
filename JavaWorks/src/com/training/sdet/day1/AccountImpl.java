package com.training.sdet.day1;

public class AccountImpl {
	public static void main(String[] args) {
		Account harryAccount; //reference holds Null
		
		// its in heap 
		harryAccount = new Account(); //instance holds data
		
		//harryAccount.accId=101;
		//harryAccount.accBalance=-3000;
		//harryAccount.accHolderName="Harry Peter";
		harryAccount.setAccId(101);
		harryAccount.setAccBalance(3000);
		//harryAccount.setAccHolderName("Harry Peter");
		
			
		Name name = new Name();
		name.setFirstName("Harry");
		name.setLastName("Peter");
		
		//******Imp command*****
		harryAccount.setName(name);
		
		//***When using public variable***
		//System.out.println("Acc Id: "+ harryAccount.accId);
		//System.out.println("Acc Holder Name: " + harryAccount.accHolderName);
		//System.out.println("Acc Balance: " + harryAccount.accBalance);
	
		
		//***When using private variable/Java Bean class***
		System.out.println("Acc Id:" + harryAccount.getAccId());
		//System.out.println("Acc Name:" + harryAccount.getAccHolderName());
		System.out.println("First Name:" + harryAccount.getName().getFirstName());
		System.out.println("Last Name:" + harryAccount.getName().getLastName());
		System.out.println("Acc Balance:" + harryAccount.getAccBalance());
		
		//By default toString will go to Object class
		//By defining Override toString method in Account and Names class
		//we can customize the output.
		System.out.println(harryAccount.toString());
		
		
	}

}
