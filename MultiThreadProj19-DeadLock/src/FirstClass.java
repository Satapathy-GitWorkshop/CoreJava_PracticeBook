
public class FirstClass {
public synchronized void firstClassMethod(SecondClass sc) {
  String name=Thread.currentThread().getName();
  System.out.println(name+"Enter into FirstClassMethod");
  try {
	  Thread.sleep(1000);
  }
  catch (InterruptedException e) {
	e.printStackTrace();
}
  System.out.println(name+"is trying to call Sc.lastMethod");
  sc.lastMethod();
}
public  void lastMethod() {
	System.out.println("Inside FC.lastMethod");
}
}//class
