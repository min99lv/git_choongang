package ch12_ex02;

class Th1 extends Thread {
	public Th1(String s) {
	super(s);
}
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("대박" + i + "\t");
			if (i % 5 == 0)
				System.out.println();
			try {
				sleep(150); 
			} catch (Exception e) {
				
			}
		}
	}
}

class Th2 extends Thread {

	public Th2(String s) {

		super(s);
	}
	public void run() {
		for (int i = 1; i <= 20; i++) {
//			System.out.print("수요일" + i + "\t");
			System.out.print(getName()+i+"\t"); // 스레드의 이름을 출력
			try {
				sleep(50); //50/1000초
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class Ra3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 20; i++ ) {
			System.out.println(Thread.currentThread()+"대박"+i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
class Ra4 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i <= 20; i++ ) {
			System.out.println(Thread.currentThread()+"대박"+i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

public class RunnableEx02 {

	public static void main(String[] args) {
		// 1. Ra3 : I / F 20번 수행 --> getName()+대박 + i
		// 2. Ra4 : I / F 20번 수행 --> getName()+월요일 + i
		// 3. Th1 : Thread 상속 , 수행  // 이미 존재
		// 4. Th2 :  Thread 상속 , 수행
		
		Ra3 r1 = new Ra3();
		Ra4 r2 = new Ra4();
		
		Thread th1 = new Thread(r1, "ㅋㅋ");
		Thread th2 = new Thread(r2,"ㅠㅠ");
		
		Th1 th3 = new Th1("zz");
		Th2 th4 = new Th2("oo");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		

	}

}
