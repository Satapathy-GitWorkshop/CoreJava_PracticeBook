//IS IT POSSIBLE TO CALL START() MORE THAN ONE USING SAME REFERENCE ????
//>No it is not possible bcz it throws (IllegalThreadStateException)... 
//>Even though main thread is terminated custom thread will executed....
package com.nt.test;

public class AccessTest6 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}

	public static void main(String[] args) {
		AccessTest6 test3= new AccessTest6();
		test3.start();
	    test3.start();
		System.out.println("main() is executed");
	}//main()
}//class
