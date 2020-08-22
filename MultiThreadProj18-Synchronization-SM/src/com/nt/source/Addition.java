package com.nt.source;

public class Addition {
	static int x,y;//Beacause local variable are sharable by mulitiple thread
	public synchronized static  void add(int x,int y) {
		Addition.x=x;
		Addition.y=y;
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {}
		int res=Addition.x+Addition.y;
		System.out.println("In"+Thread.currentThread().getName()+"Result"+res);
	}//add()
}//class

//If we declar SM as synch. then its class is locked...Hence it called Class level Lock
