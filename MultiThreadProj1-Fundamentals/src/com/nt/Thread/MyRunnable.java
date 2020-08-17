package com.nt.Thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("My runnable run method Executed");
	}
	public static void main(String[] args) {
		MyRunnable mr= new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		System.out.println("Main Executed");
	}//main
}//class
