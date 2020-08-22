package com.nt.thread;

public class MyThread1 extends Thread {
@Override
public void run() {
	//Print no 1-10
	System.out.println(Thread.currentThread().getName());
	for(int i=0;i<=10;i++) {
		System.out.println(i+"/t");
	}//for
}//run()
}//class
