package ch02_ex03;
//0523완
public class Ex01Operator1 {		//	산술 연산자 + 형식문자열 예제

	public static void main(String[] args) {
		int n1 = 33;
		int n2 = 10;
		int result;
		
		// + - * / % 사칙연산자
		result = n1 + n2;
		//System.out.println(n1 + " + " + n2 + " " + " = "+ result);  --> 이렇게 적어도 되지만 가독성이 떨어짐
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);		//	printf = 줄 바꾸기 X 
											//	%d decimal = 정수
											//	%c char = 문자
											//	\n = 줄바꿈
											// %f = 실수 = float, double
											//%s = 문자열
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result); // [3] --> result 값이 int이기 때문에 소숫점 뒤는 자른다.
		result = 10 % 3;		//	나머지
		System.out.printf("%d %c %d = %d\n", 10, '%', 3, result);
		

	}

}
