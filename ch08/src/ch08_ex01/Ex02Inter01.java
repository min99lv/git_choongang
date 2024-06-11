package ch08_ex01;

//-------------------------------------------------------
//인터페이스 사용목적
//		1) 양식의 역할( 큼) 함 ,   - -> 표준화
//      2) 다중상속 지원(극히 일부분..)
//      3) class 와 class 를 연결 해줌 (중요)
//-------------------------------------------------------

public interface Ex02Inter01 {
			int AA = 3;		// interface에 있는 모든 멤버변수는 public Static Final
			void display();
			void print ();	// 모든 public

}

class D1 implements Ex02Inter01	{ // 구현

	@Override
	public void display() {
//		AA = AA + 1; 		컴파일 에러 -> 상수이기때문에 값을 바꿀 수 없다
		System.out.println("재정의 했으...AA--> "+AA);
	}

	@Override
	public void print() {
			System.out.println("나도야 간다");
		
	}
			
}


// 인터페이스를 상속받으면 모든 메소드를 구현해주어야한다 전부 추상 메소드 이기때문에...