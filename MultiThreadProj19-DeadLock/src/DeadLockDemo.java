
public class DeadLockDemo implements Runnable {

	FirstClass fc= new FirstClass();
	SecondClass sc= new SecondClass();
	public DeadLockDemo() {
		Thread th = new Thread(this);
		   th.start();
		   fc.firstClassMethod(sc);//main thread is lock fc object
		   System.out.println("Back to main Thread");
	}
	
	@Override
	public void run() {
		sc.secondClassMethod(fc);
		System.out.println("Back in Other Thread");

	}

}
