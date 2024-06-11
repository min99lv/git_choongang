package ch10_ex01;

public class Exception05 {
//												나를 호출한놈한테 던지겠다
	static void  method1() throws Exception {
		try {
			System.out.println("1. method1 run 정상 run");	// 2. 출력
			throw new Exception(); // 메소드 내에서 예외를 생성하고 나를 호출한놈한테 던지겠다
		} catch (Exception e) {
			System.out.println("2. method1 메서드에서 예외가 처리"); // 3. 출력
			throw e; // 다시 예외를 발생시킨다  -> Exception에게 던지겠다
			
		}
	}

	public static void main(String[] args) {
//		시작
		System.out.println("main Start..."); // 1. 출력
//		method1 실행
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main메서드에서 예외가 처리"); //4. 출력
		} 

	}

}
