//WHAT HAPPEN IF WE CALL RUN() AND START() FROM MAIN()????
//RUN()  is executed 2 time one from direactly and another from custom thread.....
package com.nt.test;

public class AccessTest4 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}

	public static void main(String[] args) {
		AccessTest4 test3= new AccessTest4();
		test3.run();
		test3.start();
		System.out.println("main() is executed");
	}//main()
}//class
