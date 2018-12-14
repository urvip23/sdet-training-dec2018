package com.training.sdet.day3.collections.lists;

import java.util.Vector;

//Program shows how Vector works
public class CollectionEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(5,7); //first number is initial capacity and the second is increment capacity
		
		System.out.println("Size " + vector.size());
		System.out.println("Capacity " + vector.capacity()); //default capacity is 10
		
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		//vector.add("six"); //adding one element above capacity - increases the capacity by 10 more
		
		
		System.out.println("Size " + vector.size());
		System.out.println("Capacity " + vector.capacity()); //default capacity is 10
		
	
	}

}
