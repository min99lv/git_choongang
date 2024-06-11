package ch02_ex03;
//0523완
public class Ex02Operator2 {		//	 비교 연산자 + 형식 문자열 예제

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		boolean result; 	// true = 1, false = 0;
		
		result = n1 > n2; 	// 10 > 0
		System.out.printf("%d %c %d = %b\n", n1, '>', n2, result);
												//	%c char = '문자'
												//	%s String = "문자열"
												//	%b boolean = 논리연산자
						
		result = n1 < n2;
		System.out.printf("%d %c %d = %b\n", n1, '<', n2, result);
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		result = n1 <= n2;		//	나머지
		System.out.printf("%d %s %d = %b\n", 10, "<=", 3, result);
		result = n1 == n1;		
		System.out.printf("%d %s %d = %b\n", 10, "==", 3, result);
		result = n1 != n2;		
		System.out.printf("%d %s %d = %b\n", 10, "!=", 3, result);

	}

}
