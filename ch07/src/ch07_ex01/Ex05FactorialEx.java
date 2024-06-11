package ch07_ex01;
// 재귀함수를 사용하는 예제
// 0529완
import java.util.Scanner;

class Fac1 {

	int result = 1;

// 재귀함수 -> 자기자신을 재 호출
	void Factorial(int cnt) {
		if (cnt > 1) {
			result *= cnt;
			System.out.print(cnt + "*");
			Factorial(--cnt); // 자기 자신을 다시 호출
		} else {
			System.out.println(cnt);
			System.out.println("Factorial 결과는" + result);
			return; // 최종값을리턴
		}
	}
}

public class Ex05FactorialEx {

	public static void main(String[] args) {
		Fac1 e = new Fac1(); 	// 팩토리얼 객체 선언
		int InNum;						// 반환값을 저장할 변수

		System.out.println("Factorial 할 10이하의 숫자를 입력하세요?");
		Scanner sc = new Scanner(System.in);		// 입력값
		InNum = sc.nextInt();											// 입력값을 inNum에 저장한다
		e.Factorial(InNum);												// 팩토리얼 메소드 호출

	}

}


//console
//Factorial 할 10이하의 숫자를 입력하세요?
//9
//9*8*7*6*5*4*3*2*1
//Factorial 결과는362880