package Ch08_ex02;
// 0530완
class D1 { // 기본 생성자
	D1() {
		System.out.println("매개변수 없는 조상 생성자");
	}

	D1(int x) {	// 매개변수 생성자
		this();
		System.out.println("매개변수 1개 조상 : x" + x);
	}
}


class D2 extends D1 {
	D2(int x) {
		// super(x); // 조상 class의 1개 매개변수 생성자 --> 안불러도 기본생성자로 간다. 아부지는 무조건 들림 
		System.out.println("매개변수 1개 부모 : x=" + x);
	}

	D2(int x, int y) {
		this(x); // 자신 class의 1개 매개변수 생성자
		System.out.println("매개변수 2개 자식 x = " + x + "y=" + y);
	}
}


class C3 extends D2 {
	C3(int x, int y) {
		super(x, y); // 조상 class의 2개 매개변수 생성자
		System.out.println("매개변수 2개 자식 x=" + x + "y=" + y);
	}

	void c3() {
		System.out.println("자식 허걱");
	}
}


public class Ex03Super03 {

	public static void main(String[] args) {
				C3 c = new C3(7,15);
				c.c3();
	}

}
