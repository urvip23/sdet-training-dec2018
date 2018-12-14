package com.training.sdet.day3.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import java.util.*; this is to import all java.util functionality

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("Harry", 4000);
		map.put("Peter", 4455);
		map.put("Britt", 2233);
		
//		System.out.println("Harry balance " + map.get("Harry"));
//		System.out.println("Peter balance " + map.get("Peter"));
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry element = (Entry) itr.next();
			
			System.out.println(element.getKey() + "," + element.getValue());
		
	
		}
		
	}

}
