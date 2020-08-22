package com.nt.test;

import com.nt.Thread.MyThread2;

public class Daemon_Test {

	public static void main(String[] args) {
	System.out.println("Main Started");
	Thread th= Thread.currentThread();
	System.out.println("Main Thread Priority::"+th.getPriority());//5
	System.out.println("Main-Thread isDaemin:::"+th.isDaemon());//false
	MyThread2 th2=new MyThread2();
	//th2.start();
	System.out.println("MyThread2 Original Priority::"+th2.getPriority());//5
	System.out.println("MyThread2 Orinaly is daemon::"+th2.isDaemon());//false
	th2.setPriority(7);
	th2.setDaemon(true);
	th2.start();
	}

}
