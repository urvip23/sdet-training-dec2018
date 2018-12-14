package com.training.sdet.day3.collections.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set to keep User defined objects
public class SetEx02 {
	public static void main(String[] args) {
		
		
//***********HashSet implementation****************		
//		Set<Emp> set = new HashSet<>();
//		
//		set.add(new Emp(123, "Urvi", 1122));
//		set.add(new Emp(124, "Kumar", 2233));
//		set.add(new Emp(165, "Naveen",3344));
//		set.add(new Emp(157, "Padma", 4455));
//		set.add(new Emp(124, "Kumar", 2233));
//		
//		for(Emp temp : set){
//			System.out.println(temp + "," + temp.hashCode());
//		}
//		
		
//***********TreeSet implementation****************	
		TreeSet<Emp> set = new TreeSet<>();
		
		set.add(new Emp(123, "Urvi", 1122));
		set.add(new Emp(124, "Kumar", 2233));
		set.add(new Emp(165, "Naveen",3344));
		set.add(new Emp(157, "Padma", 4455));
		set.add(new Emp(124, "Kumar", 2233));
		
		for(Emp temp : set){
			System.out.println(temp + "," + temp.hashCode());
		}
	
		
	}

}
