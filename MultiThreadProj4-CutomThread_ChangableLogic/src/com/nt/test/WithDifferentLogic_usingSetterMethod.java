package com.nt.test;

public class WithDifferentLogic_usingSetterMethod  extends Thread{
	int x;
	public WithDifferentLogic_usingSetterMethod(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		for(int i=0; i<=this.x;i++) {
			System.out.println("run"+i+"----"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		WithDifferentLogic_usingSetterMethod logic1= new WithDifferentLogic_usingSetterMethod(10);
		logic1.start();
		WithDifferentLogic_usingSetterMethod logic2= new WithDifferentLogic_usingSetterMethod(20);
		logic2.start();
		WithDifferentLogic_usingSetterMethod logic3= new WithDifferentLogic_usingSetterMethod(30);
		logic3.start();
System.out.println("Main thread executed");
	}

}

