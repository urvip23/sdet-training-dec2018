package com.training.sdet.practice.stacks.queues;

import java.util.Queue;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

//Queue is First In First Out Data structure
public class QueueEx01 {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add("Bat");
		q.add("Cat");
		q.add("Dog");
		
	    
	    System.out.println( "queue = " + q);
	    System.out.println();
	    System.out.println("Queue output is -");

	  //access via Iterator
	    Iterator iterator = q.iterator();
	    while(iterator.hasNext()){
	      String element = (String) iterator.next();
	      
	      System.out.println(element);
	    }

	    //access via new for-loop
	    for(Object object : q) {
	        String e = (String) object;
	    }

	}
  
}

