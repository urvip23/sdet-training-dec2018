package com.training.sdet.day3.collections.lists;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class CollectionEx02 {

	public static void main(String[] args) {
		//Do not use int
		List<String> l = new ArrayList<>(); //Diamond operator introduced in JDK 1.8 
		
		l.add("Urvi");
		l.add("Harshad");
		l.add("Ansh");
		l.add("Annika");
		l.add("Annika");
		
		//Use below to print
		for(String temp : l){
			System.out.println(temp);
		}
		
		System.out.println(l);
		System.out.println("Size " + l.size());
		
		l.remove("Annika");
		System.out.println(l);
		System.out.println("Size " + l.size());
		
		System.out.println(l.contains("Annika"));
		
		List<String> sublist = l.subList(2, l.size());
			System.out.println("Sublist " + sublist);
		
	
//		Iterator<String> itr = l.iterator();
//		
//		//while is faster than for loop
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}

	}

}
