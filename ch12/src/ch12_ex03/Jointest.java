package ch12_ex03;

import java.util.ArrayList;

class Before extends Thread {
	Before(String str) {
		super(str);
	}

	void addCar() {
		System.out.println("addCar");
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
		addCar();
	}
}

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
	// static -> 다른메소드에서 공유받기 위해서
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

//join을 하지 않았을 때 차 목록이 출력되지 않는 이유 
//-> Before에 add가 1초 늦게되기 때문에 carList가 빈칸일수도 있기때문에 아래와 같이 출력된다
//우선
//나중에
//addCar

