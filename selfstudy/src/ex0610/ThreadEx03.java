package ex0610;

class Th1 extends Thread {
//	public Th1() {
//	// TODO Auto-generated constructor stub
//	super(str);
//} --> 생성자가 없는 상태 실험
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("대박" + i + "\t");
			if (i % 5 == 0)
				System.out.println();
			try {
				sleep(150); // 우선 순위 조정 가능
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Th2 extends Thread {

//	public Th2() {
//		// TODO Auto-generated constructor stub
//		super(str);
//	}
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

public class ThreadEx03 {

	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		t1.start();
		t2.start();

	}

}
