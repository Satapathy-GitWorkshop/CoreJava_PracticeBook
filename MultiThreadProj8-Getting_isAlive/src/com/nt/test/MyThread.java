package com.nt.test;

public class MyThread extends Thread{
@Override
public void run() {
	System.out.println("Run execution stared");
	System.out.println("from custom State of Thread after run() call ::"+this.isAlive());//true
try {
	Thread.sleep(5000);
}
catch (InterruptedException e) {
	// TODO: handle exception
	e.printStackTrace();
}
System.out.println("run end");
}
}//class
