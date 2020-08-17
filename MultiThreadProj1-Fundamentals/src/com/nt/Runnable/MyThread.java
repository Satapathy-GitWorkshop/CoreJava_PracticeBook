package com.nt.Runnable;

public class MyThread extends Thread{
public MyThread() {
	System.out.println("MyThread-Oparam Constructor");
}   
@Override
	public void run() {
		System.out.println("Run method Executed");
	}
public static void main(String[] args) {
	MyThread mt = new MyThread();
	mt.start();
	System.out.println("Main Exected");
}//main
}//class
