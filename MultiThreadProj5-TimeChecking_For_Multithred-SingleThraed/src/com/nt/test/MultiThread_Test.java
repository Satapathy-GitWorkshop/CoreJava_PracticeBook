package com.nt.test;

import com.nt.thread.PrintNumber;

public class MultiThread_Test extends Thread{
public static PrintNumber pn=new PrintNumber();
@Override
public void run() {
	System.out.println("Name::"+Thread.currentThread().getName());
	pn.print1to50();
}
public static void main(String[]args) {
	//create sub class Object
	MultiThread_Test test=new MultiThread_Test();
	long time1=System.currentTimeMillis();
	test.start();
	//calling PrintNumber class Method on Main Thread
	pn.print50to1();
	long time2= System.currentTimeMillis();
	System.out.println("Time taking for both method to executed:::"+(time2-time1)/1000+"sec");
	
}
}
//Here both Method take 5sec to Complete the task