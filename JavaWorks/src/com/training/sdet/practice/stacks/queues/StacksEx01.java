package com.training.sdet.practice.stacks.queues;

import java.util.Enumeration;
import java.util.Stack;

public class StacksEx01 {

	public static void main(String[] args) {
		
		//A Stack is a first-in, last-out data structure that pops elements in the opposite order than they were pushed. 
		//By default, a Stack uses an Array for its internal storage, although this can easily be changed. 
		Stack s = new Stack();
		s.push("Bat");
		s.push("Cat");
		s.push("Dog");
		System.out.println("Stack: " + s);
		System.out.println();
		
		//Display stack vertically
		System.out.println( "Non-destructively enumerate the Stack." );
	    Enumeration e = s.elements();
	    while ( e.hasMoreElements() )
	      System.out.println( e.nextElement() );
	    System.out.println();

	    System.out.println( "Pop and print each element." );
	    while ( !s.isEmpty() )
	      System.out.println( s.pop() );

	}

}
