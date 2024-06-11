package ex0610;

public class ThreadEx02 {

	public static void main(String[] args) {
//		쓰레드를 상속 받은 객체 생성
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");


		a1.start();
		a2.start();
		for (int i = 1; i <= 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i % 10 == 0)
				System.out.println();
		}
	}

}
