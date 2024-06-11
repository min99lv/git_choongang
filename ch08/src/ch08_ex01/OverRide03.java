package ch08_ex01;

//	추상 class -> 하나이상의 추상메소드가 있어야한다
abstract class C1 {
	int k;

// 생성자
	public C1() { 
		System.out.println("추상 class 생성자");

	}

	void setK(int k) { // 세터 메소드
		this.k = k;
	}

	// 추상 클래스는 하나이상의 추상 메소드가 존재 해야함
	// 추상 메소드 : 메소드 정의만 있는 것.
	abstract void print(); 
}

// 상속 클래스 
class C2 extends C1 { 

 // 추상 클래스 상속 -> 반드시 구현해야한다
	@Override
	void print() {
		System.out.println("C2 k->" + k);
	}
	void print3 () {
		System.out.println("C2 print3");
	}

}

public class OverRide03 { // 추상클래스 예제

	public static void main(String[] args) {
		// 추상 class는 생성 안됨 -> 하나 이상의 추상 Method를 가지고 있기 때문이다
//		C1 c1 = new C1(); 
		C1 c1 = new C2();
		c1.setK(12);
		c1.print();
//		c1.print3 // 타입을  super로 받았기때문에 sub에 있는 것은 사용 불가능
		C2 c2 = new C2();
		c2.setK(7);
		c2.print();
		c2.print3();
	}
	

}



//추상메소드가 하나라도 있으면 인스턴스 불가능 구현한다음에는 가능