package com.training.sdet.day4.threads.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Reads the questions from the text file
public class QuestionReader {
	//ArrayList 
	
	
	
	
	public static void main(String[] args) {
	try{
	    BufferedReader br = new BufferedReader
			(new FileReader("Questions.txt"));
	
	    String line="";
	
	    while((line = br.readLine()) != null) {
	    	System.out.println(line);
	    }
	
	} catch (IOException e){
		e.printStackTrace();
  }
 }
}
