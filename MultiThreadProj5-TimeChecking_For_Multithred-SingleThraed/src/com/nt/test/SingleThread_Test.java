package com.nt.test;

import com.nt.thread.PrintNumber;

public class SingleThread_Test {

	public static void main(String[] args) {
	System.out.println("Main Execution Start");
	PrintNumber print = new PrintNumber();
	long time1=System.currentTimeMillis();
	print.print1to50();
	System.out.println("-------");
	print.print50to1();
	long time2=System.currentTimeMillis();
	System.out.println("Time taking for Both execution::::"+(time2-time1)/1000+"sec");	
	}//main()
}//class()
//Here Both method take 10sec to complete the task
