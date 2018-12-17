/**
 * @Urvi Pikle - Fannie Mae(Dec 2018 SDET)
 */

package com.training.sdet.week1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Quiz implements Runnable {
	
	volatile boolean keepRunning = true;

	static List<Question> questions = new ArrayList<>();

	static {
		questions.add(
				new Question("When was java invented?", Arrays.asList(new String[] { "1. 1995", "2. 1992", "3. 1993" }), 1));

		questions.add(
				new Question("In which state is Niagara Falls located?", Arrays.asList(new String[] { "1. CA", "2. NY", "3. FL" }), 2));

		questions.add(
				new Question("How many continents are there in the world?", Arrays.asList(new String[] { "1. 5", "2. 9", "3. 7" }), 3));

	
	}

	static long questionShown; 
	


	@Override
	public void run() {
		Scanner sc = new Scanner(System.in); 
		int i =0;
		//int correctAns = 1;
		int count = 0; //counter for every 1 sec
				
		for (Question temp : questions) {
			
				
			try {
			
				Thread t2 = new Thread();
							
				System.out.println(temp.getQuestion());
				System.out.println(temp.getOptions());
				System.out.printf("Enter your choice: ");
				
				t2.start();
					
				int choice = Integer.parseInt(sc.next()); 
				System.out.println("Your choice is: " + choice);
				
				long answeredTime  =  new Date().getTime();
				if((answeredTime - questionShown) > 1000) {
					t2.interrupt();
					//System.out.println("Thread interrupted true/false: " + Thread.interrupted());
				}
				
				Thread.sleep(1000); //thread incremented every 1s
				count++;
				System.out.println("Every 1 sec count is: " + count);
				
				
				if(choice==temp.getCorrectOption()){
					System.out.println("That is the correct answer!!");;
					System.out.println();
					i++;
				}else {
				System.out.println("That is the wrong answer.");
				System.out.println();
			  }
				
			} catch (InterruptedException ie) {
				System.out.println("Thread interrupted. Quiz timed out.");
			
		  }
		}
		
		if(i==3) {
			System.out.println("Total number of correct answers is: " + i);
			System.out.println("Congrats!! You won this quiz.");
		}
		else { 
			System.out.println("Total number of correct answers is: " + i);
			System.out.println("Sorry, you've lost. Try again.");
		}
	
	}
		
		public static void main(String[] args) {
			questionShown  = new Date().getTime(); 
			
			System.out.println("Welcome to Quiz World!");
			questions.toString();

			Quiz q = new Quiz();
			Thread t = new Thread(q);
			t.start();
	
	  }
}
