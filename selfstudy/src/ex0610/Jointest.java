package ex0610;

import java.util.ArrayList;

// 클래스 생성
class Before extends Thread {
// 생성자 생성
	Before(String str) {
// 상속 받아서 사용
		super(str);
	}
// 메소드 생성 1. 차 목록을 추가하는 메소드 
	void addCar() {
		System.out.println("addCar");
		
//		carList에 차 목록 추가 => 순서 유지, 중복 허용
		Jointest.carList.add("벤츠");
		Jointest.carList.add("아우디");
		Jointest.carList.add("SM7");
		Jointest.carList.add("포르쉐");
	}

	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
//		addCar메소드를 실행한다
		addCar();
	}
}

// 클래스 생성2
class After extends Thread {
	After(String str) {
		super(str);
	}

	public void run() {
		System.out.println(getName());
		for (String car : Jointest.carList) {
			System.out.println(car);
		}
	}
}

public class Jointest {
//	컬렉션 생성
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중에");
		bf.start();
		try {
//			Waits for this Thread to die.
//			join메소드 = bf가 다 실행되면 af 실행을 하겠다
			bf.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		af.start();

	}

}
