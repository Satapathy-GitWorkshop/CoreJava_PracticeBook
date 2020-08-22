package com.nt.flow;

public class ConcurrentFlow_Test extends Thread{
@Override
public void run() {
	for(int i=20;i>=1;i--) {
		System.out.println("run"+i);
	}//for
}//run(-)
public static void main(String[] args) {
	ConcurrentFlow_Test test= new ConcurrentFlow_Test();
	test.start();
	try {
	Thread.sleep(2000);
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	for(int i=0;i<=5;i++) {
		System.out.println("main"+i);
	}
}//main
}//class
