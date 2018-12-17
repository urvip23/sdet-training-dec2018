package com.training.sdet.week1.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dictionary {

	static  Map<String, String[]> words = 
				new HashMap<>(); 
	public static void main(String[] args) {

		words.put("hello1", new String[] {"hello", "hi"}); 
		words.put("hello2", new String[] {"hello", "hola"}); 
		words.put("hello3", new String[] {"hello", "namaste"}); 
		words.put("hello4", new String[] {"hello", "bon jour"}); 
		
		Scanner sc = new Scanner(System.in); 

		while(true) {
			System.out.println("enter the word ");
			String word = sc.next(); 

			String [] strs = words.get(word); 
			
			if(strs != null) {
				Arrays.asList(strs).forEach(
						System.out :: println);
			}else {
				System.out.println("Sorry element not found ");
				System.out.println("Would you like to add Y/N");
				String ch = sc.next(); 
				if(ch.equals("Y")) {
					System.out.println("Enter word");
					String newWord = sc.next(); 
					// TODO 
					System.out.println("Hey please enter synonym and <enter to quit>");
					String newSynonyms [] = new String [5];  
					int count =0; 
					while(true) {
						newSynonyms[count++] = sc.next();
						System.out.println("Do you want to continue Y/N");
						
						if(sc.next().equals("n") || 
								sc.next().equals("")) {
							System.out.println("thanks ");
						}
						
						words.put(newWord, newSynonyms); 
						display(words); 
						break; 
					}
				}else {
					System.out.println("Okay you did not add element");
				}
				
				
			}
			
		}

		
	}
	
	private static void display(Map<String, String[]> words2) {
		
		Iterator itr = words2.entrySet().iterator(); 
		
		while(itr.hasNext()){
			Map.Entry temp = (Entry) itr.next(); 
			System.out.println(temp.getKey() 
					+", " + temp.getValue());
		} 
		
	}
}
