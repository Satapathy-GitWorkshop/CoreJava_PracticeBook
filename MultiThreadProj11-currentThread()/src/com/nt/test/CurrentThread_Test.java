package com.nt.test;

import com.nt.thread.Exampple;
import com.nt.thread.MyThread;

public class CurrentThread_Test {
public static void main(String[] args) {
	new MyThread().start();
	new Exampple().m1();
}
}
//this.getName()--->Print Current thread Object name...
//Thread.currentThread.getName()---->Print current running thread Object name....