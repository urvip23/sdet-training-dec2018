package com.training.sdet.day3.filehandling.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperation {

	public static void main(String[] args) {
		//Buffered Reader is to get file data in a certain format
		//WriteFile();
		
		try{
		    BufferedReader br = new BufferedReader
				(new FileReader("Sample.txt"));
		
		    String line="";
		
		    while((line = br.readLine()) != null) {
		    	System.out.println(line);
		    }
		
		} catch (IOException e){
			e.printStackTrace();
	  }
		
   }

	private static void WriteFile() {
		FileWriter fileWtr = null;
		try {
			BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in));
			
			System.out.println("Enter Emp Id: ");
			int empId = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Emp Name: ");
			String empName = br.readLine();
			
			System.out.println("EMP ID is: " + empId);
			System.out.println("EMP NAME is: " + empName);
			
			File f = new File("Sample.txt");
			
			fileWtr = new FileWriter(f, true);
			fileWtr.append("Emp Id: " + empId + "\n");
			fileWtr.append("Emp Name: " + empName + "\n");
		
			
			System.out.println("Content written to file");
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
			fileWtr.close();
		} catch (IOException e){
			e.printStackTrace();
	   }
	  }
	}
}

