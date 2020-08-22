package com.nt.Thread;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1 run method");
		System.out.println("MyThread1 priority::"+this.getPriority());//5-7
		System.out.println("MyThread1 daemon::"+this.isDaemon());//false-true
	}

}
