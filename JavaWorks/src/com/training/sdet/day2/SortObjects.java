package com.training.sdet.day2;

import java.util.Arrays;

public class SortObjects {
	public static void main(String[] args) {
		int [] arr = {12, 3,56,234,23, 16, 14, 55, 23, 14, 24, 6, 22};
		
		for(int temp : arr){
			System.out.println(temp);
		}

	System.out.println("------------Number Sort - After Sort-----------");
	
	Arrays.sort(arr);
	for(int temp : arr){
		System.out.println(temp);
	}
	
	System.out.println();
	System.out.println("------------Name Sort-----------");
	
	String [] arr1 = {"Sam", "Nick", "Linda", "Amy"};
	Arrays.sort(arr1); 
	for(String temp : arr1){
		System.out.println(temp);
	}

  }
}
