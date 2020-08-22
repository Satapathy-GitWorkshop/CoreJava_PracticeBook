package com.nt.thread;

public class MyThread extends Thread{
public MyThread() {
	//no body
}
public MyThread(String name) {
	super(name);
}
@Override
	public void run() {
		System.out.println("run is executed");
	}
}



//Two Way we can change thread nam
       //>By using parameterised constructr
       //>By using setName() method