package ch04_ex01;
//0523완
public class If01 { 			// if조건문 예제 01

	public static void main(String[ ] args) {
		int a = 12;
		if 	(a > 0) {						// 만약 a>0 크면 밑줄 출력
			System.out.println(a	+	 "는 양수");
			
		} 	else 	{						// 거짓이면 a<0 밑줄 출력
			System.out.println(a	+	 "는 음수");
		}
		System.out.println("프로그램 종료");
	}

}
