package com.nt.test;

public class WithSameLogic  extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=20;i++) {
			System.out.println("run"+i);
		}
	}

	public static void main(String[] args) {
		WithSameLogic logic1= new WithSameLogic();
		logic1.start();
		System.out.println(logic1.getName());
		WithSameLogic logic2= new WithSameLogic();
		logic2.start();
		System.out.println(logic2.getName());
		WithSameLogic logic3= new WithSameLogic();
		logic3.start();
		System.out.println(logic3.getName());
System.out.println("Main thread executed");
	}

}

