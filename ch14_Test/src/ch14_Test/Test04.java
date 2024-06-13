package ch14_Test;



//Thread 상속 
class K1 extends Thread {
  public void run() {
      for (int i = 0; i < 20; i ++) {
          System.out.print("k1..");
      }
      System.out.println();
  }
}

//Runnable 구현 
class K2 implements Runnable {
  public void run() {
      for (int i = 0; i < 20; i ++) {
          System.out.print("k2..");
      }
      System.out.println();
  }
}
// 각각 K1 k1 , K2 k2 각각의  Thread 수행 하는 main Method를 완성하시요
public class Test04 {

	public static void main(String[] args) {
        K1 k1 = new K1();
		Thread k2 = new Thread(new K2());
		k1.start();
		k2.start();
		
		// 29 Line과 같음 
//		K2 r2  = new K2();
//		Thread th1 = new Thread(r2,"Pr"); 

	}

}