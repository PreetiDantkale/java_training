import java.util.*;

class JavaThread implements Runnable {
	
	public static Thread t1;
	//public static JavaThread jt;

	public static void main(String[] args){
		JavaThread jt = new JavaThread();
		t1 = new Thread(jt);

		System.out.println("T1 Thread State" + t1.getState());

		t1.start();

		System.out.println("T1 Thread State" + t1.getState());

		//t1.run();

	}

  public void run(){
    System.out.println("T1 Thread State" + t1.getState());
  }

}