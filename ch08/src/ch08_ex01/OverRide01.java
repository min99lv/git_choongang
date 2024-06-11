package ch08_ex01;
// 0530
class A1 {  //오버라이드 사용 예제
	private int kkk;
	public void print () {
		System.out.println("부모 메소드print");
	}
}


class A2 extends A1 { 
//		@Override
//		public void print() { //  아버지메소드 프린트를 해준다....
//			super.print();
//		}
	public void print3 () {
		System.out.println("A2의 print 메소드");
	}
}
public class OverRide01 {

	public static void main(String[] args) {
		// A1선언 
		A1 a1 = new A1();
		a1.print();
//		a1.print3(); --> 컴파일에러 부모는 자식꺼 사용 불가능
		A1 a2 = new A2(); // 선언은 아부지 생성은 자식
		// 상속시 super 사용가능
		a2.print();
		// 선언을 super-> sub사용 불가능
//		a2.print3();
		// 선언 sub -> super sub 둘 다사용 불가능
		A2 a22 = new A2();
		a22.print();
		a22.print3();
//		a22.kkk; -> super 프라이빗 변수 사용 불가능
	}

}
