package com.nt.thread;

import com.nt.test.MyThread;

public class Yield_Test {
public static void main(String[] args) {
	System.out.println("Main Executed");
	MyThread mt= new MyThread();
	mt.start();
	Thread.currentThread().setPriority(4);
	Thread.yield();
  }
}
//yield() give chance the low priority thread by suspending its own execution and waiting
//in the queue to get the chance for execution