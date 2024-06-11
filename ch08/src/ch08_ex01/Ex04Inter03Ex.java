package ch08_ex01;
// 인터페이스와 상속에 관한 예제
interface F1 {
	void aa();
}

interface F2 {
	void bb();
}

// Interface끼리는 다중 상속 가능 -> extends
interface F3 extends F1, F2 {
	void cc();
}

class F4 implements F3 {

	@Override
	public void aa() {
			System.out.println("aa method");
		
	}

	@Override
	public void bb() {
		System.out.println("bb method");
		
	}

	@Override
	public void cc() {
		System.out.println("cc method");
		
	}
}
// class가 interface를 상속 받을때 -> 다중상속 가능 
class F5 implements F1, F2 {

		@Override
		public void bb() {
			System.out.println("F5 bb method");
			
		}

		@Override
		public void aa() {
			System.out.println("F5 aa method");
			
		}
	
}



public class Ex04Inter03Ex {

	public static void main(String[] args) {
			F3 f3 = new F4();    
			f3.aa();
			f3.bb();
			f3.cc();
			F2 f2 = new F4(); 
//			f2.aa();
			f2.bb();
//			f2.cc();		
			F5 f5 = new F5();
			f5.aa();
			f5.bb();
			
	}

}
