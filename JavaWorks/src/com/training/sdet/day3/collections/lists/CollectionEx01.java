package com.training.sdet.day3.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//program to show working of list raw type
//Legacy programs uses this approach
public class CollectionEx01 {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add("Hello");
		l.add(50);
		l.add(true);
		l.add(new Object());
	
		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		//array start from 0
		// Iterators start from 
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
	}

}
