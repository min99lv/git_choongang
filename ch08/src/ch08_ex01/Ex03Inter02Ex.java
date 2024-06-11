package ch08_ex01;

interface E1 {
	void aa();
}

// 인터페이스는 메소드를 추상하기만 한다 
// in -> extends 인터페이스에서 상속 -> implements
interface E2 extends E1 {
	void bb();
}

interface E3 extends E2 {
	void cc();
}

// 클래스 -> 인터페이스 상속 -> implements
class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("E4 난 E2에 있는 메소드  bb()");

	}

	@Override
	public void aa() {
		System.out.println("E4 난 E1에 있는 메소드  aa()");
	}

	@Override
	public void cc() {
		System.out.println("E4 난 E3에 있는 메소드 cc()");
	}

}

public class Ex03Inter02Ex {

	public static void main(String[] args) {
		// 선언은 super 가능-> 인터페이스라 할지라도 메모리는 sub
		// e2.aa,e2.bb만 사용 가능 , e2.cc()는 사용 불가
		E2 e2 = new E4();
		e2.aa(); // E1 가능
		e2.bb(); // E2 가능
//				e2.cc(); // 메모리는 E4를 할당했더라도 선언한 객체를 넘어서지는 못한다
		E4 e4 = new E4(); // -- > 상속받은 것 모두 사용가능
		e4.aa(); // E1 가능
		e4.bb(); // E2 가능
		e4.cc(); // E3 가능

	}

}

//console
//E4 난 E1에 있는 메소드  aa()
//E4 난 E2에 있는 메소드  bb()
//E4 난 E1에 있는 메소드  aa()
//E4 난 E2에 있는 메소드  bb()
//E4 난 E3에 있는 메소드 cc()

// 선언이랑 메모리할당 범위를 주의할 필요가 있다