package ch08_ex01;

class B1{
	void print1() {
		System.out.println("바꾸기 가능");
	}
	final void print2() { // 변경을 할 수 없는 메소드 
		System.out.println("변경금지");
	}
}

//	final은 오버라이드금지
class B2 extends B1{
	void print1() {
		System.out.println("난 자식 메소드");
	}
}

public class OverRide02 {

	public static void main(String[] args) {
		B1 b1 = new B2(); // 선언 부모 메모리는 자식
		b1.print1(); // 내것이 있으면 내거 먼저 
		b1.print2(); // 내것이 없으면 부모
	}

}
