package com.nt.thread;

public class MyThread2 extends Thread {
@Override
public void run() {
	//Creating another thread Object
	System.out.println(Thread.currentThread().getName());
	MyThread1 th1= new MyThread1();
	th1.start();
//printing no 10-1
	for(int i=10;i>=1;i--) {
		System.out.println(i+"/t");
	}//for
}//run
}//class
