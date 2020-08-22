package com.nt.thread;

public class PrintNumber {
//Printing number from 1-15
	public void print1to50(){
		for(int i=1;i<=50;i++) {
			System.out.println(i+"\t");
			try {
			Thread.sleep(100);
		}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
//Printing number from 15-1
	public void print50to1() {
		for(int i=50;i>=1;i--) {
			System.out.println(i+"/t");
		
		try {
		Thread.sleep(100);
	}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//for
  }//method
}//class