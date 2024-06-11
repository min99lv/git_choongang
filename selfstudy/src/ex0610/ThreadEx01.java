package ex0610;

//원칙1
// Thread 생성시 extends Tread 
class A1 extends Thread {
	public A1(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getName() + i + "\t");
			if (i % 10 == 0) // i=10 이 될때마다 뛰어쓰기
				System.out.println();
			try {
				Thread.sleep(50); // 1000분의 50초 슬립
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		super.run();
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		a1.start();
		a2.start();
		for (int i = 0; i <= 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i % 10 == 0)
				System.out.println();
		}
	}

}
