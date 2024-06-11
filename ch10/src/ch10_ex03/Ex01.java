package ch10_ex03;

public class Ex01 {
	static void method(boolean b) {
		try {
			System.out.println(1 + "b--->" + b);	// 2. true출력 // 6. 출력
			if (b) //1. true면 실행 / 2. false면 스킵
				throw new ArithmeticException(); // 호츌
			System.out.println(2);
//			예외가 발생하면 실행되지 않는 문장  --> ArithmeticException()이 자식이기때문에 없으면 RUNTIMEe호출
		} catch (RuntimeException e) {
			System.out.println("RuntimeException" + "-->" + 3); // 3.출력
			return;
//			메서드를 빠져나간다.(finally블럭을 수행한 후에)
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
//			예외 발생 여부에 관계없이 항상 실행되는 문장 -> 스킵되더라도 무조건 실행 
			System.out.println("예외 발생 여부에 관계없이 항상 실행되는 문장" + 5); // 4출력 , 7. 출력
		}
		System.out.println("정상적으로 끝나야 실행되는 문장"); // finally실행된후 return으로 가서 실행종료가 되기 때문에 실행 X 8.출력
	}

	public static void main(String[] args) {
		System.out.println("---true호출---"); // 1. 출력
		method(true);
		System.out.println("---false 호출---"); // 5. 출력
		method(false);
	}
}
