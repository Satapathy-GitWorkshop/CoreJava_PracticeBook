package com.nt.test;

public class WithDifferentLogic  extends Thread{
	int x;
	
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for(int i=0; i<=this.x;i++) {
			System.out.println("run"+i+"----"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		WithDifferentLogic logic1= new WithDifferentLogic();
		logic1.setX(5);
		logic1.start();
		WithDifferentLogic logic2= new WithDifferentLogic();
		logic2.setX(10);
		logic2.start();
		WithDifferentLogic logic3= new WithDifferentLogic();
		logic3.setX(15);
		logic3.start();
System.out.println("Main thread executed");
	}

}

