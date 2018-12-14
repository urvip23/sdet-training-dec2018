package com.training.sdet.day4.threads;

class MyBizLogic extends Thread{
	
		//simulate some time
	//Put any multi0threading methods in override run()
	public void run(){
		for(int i=0; i<500; i++){
			System.out.println("Value of i " + i +", " +
						Thread.currentThread().getName());
		}
		System.out.println("Thread " + 
				Thread.currentThread().getName() 
					+ " Exiting");
		
		//wait time
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(
				Thread.currentThread().getName());
		
		//Single threaded application if we use run() in main
		//Start calls starts and call run() and goes back to see if there is some other call
		MyBizLogic mb1 = new MyBizLogic();
		mb1.start();
	
		MyBizLogic mb2 = new MyBizLogic();
		mb2.start();
		
		MyBizLogic mb3 = new MyBizLogic();
		mb3.start();
		
		//TO ensure that parent(main) finishes its job after all children have finished
		try {
			mb1.join();
			mb2.join();
			mb3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main");
		
	}

}
