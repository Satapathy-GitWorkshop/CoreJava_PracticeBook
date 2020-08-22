package com.nt.thread;

public class Exampple {
static {
	System.out.println("Example static block Thread name:::"+Thread.currentThread().getName());//main
}
public static void m1() {
	System.out.println("Example m1 method Thread name::"+Thread.currentThread().getName());//main
}
}//class
