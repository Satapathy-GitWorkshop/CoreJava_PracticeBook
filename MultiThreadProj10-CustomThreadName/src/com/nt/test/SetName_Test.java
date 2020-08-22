package com.nt.test;

import com.nt.thread.MyThread;

public class SetName_Test {
	public static void main(String[] args) {
		MyThread th= new MyThread();
		MyThread th1= new MyThread("satapathy");
		System.out.println("th intial name and priority");
		System.out.println("name::"+th.getName());//Thread-0
		System.out.println("priority"+th.getPriority());//5
		System.out.println("th1 intial name and priority");
		System.out.println("name::"+th1.getName());//satpathy
		System.out.println("priority"+th1.getPriority());//5
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>");
		th.setPriority(7);
		th.setName("chiku");
		System.out.println("th priority and name after changing");
		System.out.println("name::"+th.getName());//chiku
		System.out.println("priority"+th.getPriority());//7
		
	}

}
