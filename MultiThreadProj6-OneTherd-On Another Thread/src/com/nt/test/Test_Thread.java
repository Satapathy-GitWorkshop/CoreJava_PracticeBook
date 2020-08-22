package com.nt.test;

import com.nt.thread.MyThread2;

public class Test_Thread {

	public static void main(String[] args) {
    //Create On thread class Object
		MyThread2 th2= new MyThread2();
		th2.start();
		System.out.println("Main Executed Started");
	}//main
}//class
