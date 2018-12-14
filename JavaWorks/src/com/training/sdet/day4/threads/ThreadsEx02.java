package com.training.sdet.day4.threads;

class OtherClass{}

class MyClass extends OtherClass implements Runnable{
	
	private Thread t;
	private String threadName;
	
	
	public MyClass(String threadName, int priority){
		t = new Thread(this, threadName);
		t.setPriority(priority);
		//OS level thread is created
		// and control is given for run()
		//in between it goes to calendar
		t.start();
	}

	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<500; i++){
			print(i);
		}
		System.out.println("Thread " + Thread.currentThread() + " exiting.");
	  }

	private void print(int i) {
		// TODO Auto-generated method stub
		System.out.println(
				"i value in " + Thread.currentThread().getName()
				+", " +i);
		}
	
		
}

public class ThreadsEx02 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass("William", Thread.NORM_PRIORITY+1);
		MyClass m2 = new MyClass("Koh", Thread.NORM_PRIORITY+2);
		MyClass m3 = new MyClass("John", Thread.MAX_PRIORITY);

	Thread t = new Thread(new MyClass());
	t.setName("Ashwini");
	t.setPriority(10);
	t.start();
	
		
	}
}