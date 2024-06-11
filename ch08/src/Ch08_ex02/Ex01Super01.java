package Ch08_ex02;
// 상속 클래스에 대한 예제
// 0530 완
class S1 {
	int a = 7;	// 필드 생성
	int b = 7;
	
	//	메소드 선언
	void dispaly() {
		System.out.println("B1 대박");
	}

	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
}
// 상속 클래스 
class S2 extends S1 {
	int a = 10;

	void print() {
		super.print(); // 부모 메소드를 찾는다. --> 내거 안에서 부모 먼저 호출
		System.out.println("B2 부모멤버 a =" + super.a); // 아버지의 a 
		System.out.println("B2 난 자식 메소드 a =" + a); // this가 생략된것으로 봄 = this.a
		System.out.println("B2 난 자식 메소드 b =" + b); // sub에 없고 super에 있으면 출력
		System.out.println("=====================");
	}
}

public class Ex01Super01 {

	public static void main(String[] args) {
		S2 b = new S2();
		b.print();
		b.dispaly();

	}

}


// 나한테 있으면 내꺼먼저
// 없으면 아버지 
// 아버지거 호출하면 아버지것이 옴 super.멤버변수