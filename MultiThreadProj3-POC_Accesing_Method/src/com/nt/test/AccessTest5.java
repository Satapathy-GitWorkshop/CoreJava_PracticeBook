//WHAT HAPPEN IF WE CALL FIRST START() THEN RUN()?????
//First run() is executed from custom thread then executed from directly from the given class.....
package com.nt.test;

public class AccessTest5 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}

	public static void main(String[] args) {
		AccessTest5 test3= new AccessTest5();
		test3.start();
		test3.run();
		System.out.println("main() is executed");
	}//main()
}//class
