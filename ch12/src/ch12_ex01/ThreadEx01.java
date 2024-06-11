package ch12_ex01;

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
			if (i % 10 == 0)
				System.out.println();
			try {
				Thread.sleep(50);
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
		a1.start(); // 출력 순서는 cpu마음
		a2.start(); // cpu스케쥴링이 늦어짐
//		a1.run();	// 스케쥴링이 바로 시작
//		a2.run();
		for (int i = 1; i <= 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i % 10 == 0)
				System.out.println();
		}

	}

}
