package com.training.sdet.day3.collections.sets;

import java.util.HashSet;
import java.util.Set;

//Ctrl +Shift + o -> Imports all required java libraries
public class SetEx01 {
		public static void main(String[] args) {
			Set<String> mySet = new HashSet<>();
				
//			mySet.add("Raj");
//			mySet.add("Britt");
//			mySet.add("Raj");
//			mySet.add("Britt");
			
			System.out.println(mySet.add("Raj"));
			System.out.println(mySet.add("Britt"));
			System.out.println(mySet.add("Raj"));
			System.out.println(mySet.add("Britt"));
			
			System.out.println(mySet.size());
			System.out.println(mySet);
		}
}
