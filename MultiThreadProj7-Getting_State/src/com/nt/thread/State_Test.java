package com.nt.thread;

import com.nt.test.MyThread;

public class State_Test {
public static void main(String[] args) {
	System.out.println("main staterd");
	//Creating Thrad sub class Object
	MyThread mt= new MyThread();
	System.out.println("from main State before start() call"+mt.getState());//New
	mt.start();
	System.out.println("from main State aftter start() call"+mt.getState());//Runnable
	try{Thread.sleep(500);}
	catch(InterruptedException ie) {ie.printStackTrace();}
	System.out.println("from main state after thread sleep"+mt.getState());//TimeWaiting
	try{Thread.sleep(5066);}
	catch(InterruptedException ie) {ie.printStackTrace();}
	System.out.println("from main state after run() completed"+mt.getState());//Terminated
	System.out.println("main end");
}
}