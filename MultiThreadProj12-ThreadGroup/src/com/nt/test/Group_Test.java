package com.nt.test;

public class Group_Test {
public static void main(String[] args) {
	System.out.println("Getting Thread-Group Name::::");
	Thread th1= new Thread();
	System.out.println(th1.toString());//[Thread-0,5,main]
	Thread th2= new Thread("Child");
	System.out.println(th2.toString());//[Child,5,main]
	Thread th3=Thread.currentThread();  //------Currrent Running Thread
	System.out.println(th3.toString());//Thread[main,5,main]
	th3.setPriority(7);
	Thread th4= new Thread();
	System.out.println(th4.toString());
	
//Getting and  Thread Group name
	String th5=Thread.currentThread().getThreadGroup().getName();
	System.out.println(th5);//main 
}
}
