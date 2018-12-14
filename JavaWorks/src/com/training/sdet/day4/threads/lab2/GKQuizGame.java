//package com.training.sdet.day4.threads.lab2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GKQuizGame implements Runnable{
//	
//	private static Object amountofTime;
//	private Thread t;
//	private String threadName;
//	private Object questions;
//
//	class Question{
//		private String question;
//		private List<String> options;
//		private int correctOption;
//		public Question(String question, List<String> options, int correctOption) {
//			super();
//			this.question = question;
//			this.options = options;
//			this.correctOption = correctOption;
//		}
//		public String getQuestion() {
//			return question;
//		}
//		public void setQuestion(String question) {
//			this.question = question;
//		}
//		public List<String> getOptions() {
//			return options;
//		}
//		public void setOptions(List<String> options) {
//			this.options = options;
//		}
//		public int getCorrectOption() {
//			return correctOption;
//		}
//		public void setCorrectOption(int correctOption) {
//			this.correctOption = correctOption;
//		}
//		
//	}
//	
//	//@Override
////	public void run() {
////		// TODO Auto-generated method stub
////		for (Question temp : questions){
////			System.out.println(temp.getQuestion());
////			System.out.println("Enter your choice");
////			int choice = sc.nextInt();
////		}
////	}
////	
////	public class Quiz implements Runnable{
////		static List<Question> questions = new ArrayList<>();
////		
////		//static {
////			//questions = new QuestionReader();
////		
////	      }
//		
//	//}
//	
//	//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//amountofTime = new Date().getTime();
//		
//	
//		
//	}
//
////}
//
//
