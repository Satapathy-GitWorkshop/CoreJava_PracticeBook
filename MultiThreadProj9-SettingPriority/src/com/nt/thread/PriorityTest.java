package com.nt.thread;

import com.nt.test.MyThread;

public class PriorityTest {
public static void main(String[] args) {
   System.out.println("main start");
   System.out.println(Thread.currentThread().getPriority());//5
   System.out.println(Thread.currentThread().getName());//main
	MyThread mt1= new MyThread();
	MyThread mt2= new MyThread();
	mt1.setPriority(9);
	mt1.setPriority(6);
	mt2.start();
	mt1.start();
	System.out.println("Main end");
}
}
//Those many start() method call those many thread is created
//High priority thread end 1st