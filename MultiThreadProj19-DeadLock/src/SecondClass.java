
public class SecondClass {
    public synchronized void secondClassMethod(FirstClass fc) {
    	 String name=Thread.currentThread().getName();
    	  System.out.println(name+"Enter into SecondClassMethod");
    	  try {
    		  Thread.sleep(1000);
    	  }
    	  catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    	  System.out.println(name+"is trying to call fc.lastMethod");
    	  fc.lastMethod();
    }
    public synchronized void lastMethod() {
    	System.out.println("Inside sc.lastMethod");
    }
}
