package com.nt.test;

public class MyThread extends Thread {
  @Override
public void run() {
	   System.out.println("run started");
	   try {
		   System.out.println("Before Sleep call");
		  Thread.sleep(1000);
	   }
	   catch(InterruptedException ie) {
		   ie.printStackTrace();
	   }
	   System.out.println("run End");
}//run
}//class
class Sleep_Test{
	public static void main(String[] args) {
		System.out.println("main started");
		   try {
			   System.out.println("Before Sleep call");
			  Thread.sleep(2000);
		   }
		   catch(InterruptedException ie) {
			   ie.printStackTrace();
		   }
		MyThread mt= new MyThread();
		mt.start();
		System.out.println("main End");
	}//main
}//class


//sleep() work is to paused the current running thread for given amount of time for another thread Execution
