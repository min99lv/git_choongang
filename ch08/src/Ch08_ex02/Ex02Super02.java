package Ch08_ex02;
// 0530완
class C1 {
	// 생성자가 없으면 Default를 Compiler가 만들어 준다.
	
	// 생성자 오버로딩
	C1() {
		System.out.println("매개변수 없는 부모 생성자");
	}

	C1(String str) {
		System.out.println("매개벼수 있는 부모 생성자1 str" + str);
	}

	void cc1Method() {
		System.out.println("cc1 야호 ! 목요일이다.");
	}
}

class C2 extends C1 {

	C2() {
		super("헐~~"); // 매개변수 1개 짜리 부모 생성자 호출
		System.out.println("매개변수 없는 자식 생성자");
	}

	void cc1Method() {
			System.out.println("C2 야호!  목요일이다");
	}

	void cc2Method() {
			System.out.println("cc2 자식 method cc2");
	}

}

public class Ex02Super02 {

	public static void main(String[] args) {
		C2 c = new C2();
		c.cc2Method();
		c.cc1Method();
		// 메인에서는 .super로 아버지를 부를 수가 없다
	}

}


//console
//매개벼수 있는 부모 생성자1 str헐~~
//매개변수 없는 자식 생성자
//cc2 자식 method cc2
//C2 야호!  목요일이다



// 아무것도 없을때 아버지의 기본생성자 호출 -> 다음 내 생성자

