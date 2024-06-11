package ch10_ex01;

public class Exception04 {
//												예외를 던진다
	static void method1() throws Exception {
		System.out.println("method1 run"); // 1.출력
		method2(); // 메소드 1을 호출하면 메소드 2도 호출된다. 호출한 메소드가 던지면 호출된 메소드도 던져야한다
	}
//												예외를 던진다
	static void method2() throws Exception {
		System.out.println("method1 run");	// 2. 출력
//		일부러 예외를 발생시킨다
		throw new Exception(); // 나를 호출한 놈한테 던짐
	}

	public static void main(String[] args) throws Exception {
			method1(); // 메인에서 메소드를 만들때 스태틱 내가 스태틱이면 메소드도 스태틱이어야 호출 가능
			System.out.println("main End");
	}

}
