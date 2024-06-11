package ch12_ex02;

class Ra1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}

	}

}

class Ra2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "월요일" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}

	}

}

public class RunnableEx01 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		
		
//		implement 한 것은 반드시 아래와 같은 선언후 사용
//		Must --> Thread th1 = new thread(r1)
//		스레드는 클래스기 때문에 멀티플 상속이 불가능해서 러너블 인터페이스로 감싸주어서 상속할 수 있게 한다 = runnable
		Thread th1 = new Thread(r1, "pr");
		Thread th2 = new Thread(r1, "pr");

		th1.start();
		th2.start();

	}

}
