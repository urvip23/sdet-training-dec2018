package com.training.sdet.day2;

public class MyMath {
	
	static int x=100;
	
	static int add(int n1, int n2){
			return n1+n2;
	}
	
	static {
		System.out.println("x value is "+ x);
		System.out.println("This is static block 1.");
	}
	
	static {
		System.out.println("This is static block 2.");
	}
	
	static int sub(int n1, int n2){
		return n1-n2;
}
	
	public static void main(String[] args) {
			//MyMath m = new MyMath();
			System.out.println(add(10,20));
			System.out.println(sub(30,20));
	}
	
	static {
		System.out.println("This is the last static block.");
	}

}
