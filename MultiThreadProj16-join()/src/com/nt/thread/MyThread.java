package com.nt.thread;

 public class  MyThread extends Thread {
   @Override
public void run() {
System.out.println("Run executed::::");
System.out.println(getName());
try {
	Thread.sleep(10000);
}
catch(InterruptedException ie) {}
System.out.println("Run end");
}//run()
}//class