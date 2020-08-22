package com.nt.thread;

import com.nt.source.Addition;

public class MyThread1 extends Thread{
Addition a;
public MyThread1(Addition a) {
	this.a = a;
}
@Override
	public void run() {
		a.add(50,60);
	}//run
}//class

//here we are  accessing the the add method using same (a) reference....