//IS IT POSSIBLE TO CALL RUN() DIRECTLY FROM MAIN() THEN WHICH FLOW TAKE PLACE????
//Yes its possible to call run() from main(), but sequentially flow will take palce.....
package com.nt.test;

public class AccessTest3 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}

	public static void main(String[] args) {
		AccessTest3 test3= new AccessTest3();
		test3.run();
		System.out.println("main() is executed");
	}//main()
}//class
