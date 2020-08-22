package com.nt.test;

import com.nt.thread.MyThread;

public class Join_Test {
  public static void main(String[] args)throws InterruptedException {
	System.out.println("main started");
	MyThread mt= new MyThread();
	mt.start();
	mt.join();//it will Override the parameterised join()
	//mt.join(100);
	//mt.sleep(100);
	System.out.println("main thread is running!!!!");
	System.out.println("main end");
}
}
//join()-->Pausing the thread execution until other thread execution is completed..
//join(-)-->pausing the thread execution for given amount of time,if other thread execution
//          completed before given time its resume the thread execution immediately....