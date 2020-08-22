package com.nt.Thread;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run method");
		System.out.println("MyThread2 priority::"+this.getPriority());//5-7
		System.out.println("MyThread2 daemon::"+this.isDaemon());//false-true
		MyThread1 th1= new MyThread1();
		th1.start();
	}

}
