package com.nt.thread;

import com.nt.source.Addition;

public class MyThread2 extends Thread{
Addition a;
public MyThread2(Addition a) {
	this.a = a;
}
@Override
	public void run() {
		a.add(50,50);
	}//run
}//class
