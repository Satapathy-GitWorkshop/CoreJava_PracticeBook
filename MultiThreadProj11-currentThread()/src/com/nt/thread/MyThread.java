package com.nt.thread;

public class MyThread extends Thread {
@Override
public void run() {
	System.out.println("MyThread run method Executed:::");
	Exampple.m1();//Thread-0
}
}//class
