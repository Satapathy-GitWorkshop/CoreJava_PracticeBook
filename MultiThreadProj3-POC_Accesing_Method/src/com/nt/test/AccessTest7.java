 //IS IT POSSIBLE OVERRIDE START() METHOD IN SUB CLASS ????
//>Yes it is possible bcz its no a final method, but custom thread is executed....

package com.nt.test;

public class AccessTest7 extends  Thread{
	@Override
	public void run() {
		System.out.println("run() is executed");
		
	}
	@Override
	public synchronized void start() {
		System.out.println("Start() is executed");
//To start custom thread execution
		super.start();
	}

	public static void main(String[] args) {
		AccessTest7 test3= new AccessTest7();
		test3.start();
		System.out.println("main() is executed");
	}//main()
}//class
