package com.nt.source;

public class Addition {
	int x,y;//Beacause local variable are sharable by mulitiple thread
	public synchronized void add(int x,int y) {
		this.x=x;
		this.y=y;
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {}
		int res=this.x+this.y;
		System.out.println("In"+Thread.currentThread().getName()+"Result"+res);
	}//add()
}//class

//If we declar NSM as synch. then its current Object is locked....