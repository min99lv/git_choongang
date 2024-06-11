package ch03_ex01;
//0523완
public class Ex03AccuracyEx {				// 연산 우선 순위 예제

	public static void main(String[] args) {
		int apple = 1;			
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		//								1 - 7 * 0.1  연산 우선순위에 따라서 number * pieceUnit 이 우선 연산된다.
		// 자바 연산에서 *, /, % 의 우선 순위 -> + -
		// 우선 순위가 동일할 때는 왼쪽 -> 오른쪽 방향으로 연산
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");
	}

}
