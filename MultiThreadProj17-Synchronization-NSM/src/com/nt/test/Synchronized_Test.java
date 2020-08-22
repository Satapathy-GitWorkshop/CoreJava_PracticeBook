package com.nt.test;

import com.nt.source.Addition;
import com.nt.thread.MyThread1;
import com.nt.thread.MyThread2;

public class Synchronized_Test {
public static void main(String[] args) {
	System.out.println("main stated---");
	Addition a= new Addition();
	MyThread1 th1= new MyThread1(a) ;
	MyThread2 th2= new MyThread2(a);
	th1.setName("50-60");
	th2.setName("50-50");   
	th1.start();
	th2.start();
	
	/*
	new MyThread1(a).start();
	new MyThread2(a).start();
	*/
}
}
