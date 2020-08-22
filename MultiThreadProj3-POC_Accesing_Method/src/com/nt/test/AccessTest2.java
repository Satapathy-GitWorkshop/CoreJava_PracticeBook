//IF START() CALLEDON THREAD CLASS OBJECT DIRECTLY THEN SUBCLASS RUN() IS EXECUTED OR NOT????
//No run() method is executred from Thread class directly.....
package com.nt.test;

public class AccessTest2 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}

	public static void main(String[] args) {
		AccessTest2 test1= new AccessTest2();
		Thread th = new Thread();
		th.start();
		System.out.println("main() is executed");
	}//main()
}//class
