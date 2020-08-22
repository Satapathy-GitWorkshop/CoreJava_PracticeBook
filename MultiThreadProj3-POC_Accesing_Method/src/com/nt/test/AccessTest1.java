//WHAT HAPPEN IF WE CALL START() AT END OF MAIN()????
//Both main() and run() executed sequentially....
package com.nt.test;

public class AccessTest1 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
	}

	public static void main(String[] args) {
		AccessTest1 test1= new AccessTest1();
		System.out.println("main() is executed");
		test1.start();
	}//main()
}//class
