package ch10_ex01;

import java.util.Scanner;

public class Exception_Hw01 {

	public static void main(String[] args) {
//		변수 선언 & 초기화
		int result = 0;
		int num1 = 0;
		int num2 = 0;
//		Scanner클래스로 값을 입력받는 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("첫번째 숫자를 입력하세요");
//				num1에 첫번째 값 입력
				num1 = Integer.parseInt(sc.nextLine());
//				만약 num1의 값이 0 이라면 if문 종료
				if (num1 == 0)
					break;
				System.out.println("두번째 숫자 입력하세요");
//				num2에 두번째 값 입력
				num2 = Integer.parseInt(sc.nextLine());
//				result변수에 값 저장
				result = num1 / num2;
//				출력
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
//				  			정수를 0으로 나누면 예외처리
			} catch (ArithmeticException e) {
				System.out.println("숫자를 입력하세요");
//							모든 나머리 에러처리
			} catch (Exception e) {
				System.out.println("나머지 에러");
//			무조건 나오는 finally 블록
			} finally {
				System.out.println("난 무조건나온다");
			}

		} while (true);	// 무한루프
		System.out.println("프로그램 종료");
//		Scanner를 종료하는 메서드
		sc.close();

	}

}

//console
//첫번째 숫자를 입력하세요
//5
//두번째 숫자 입력하세요
//5
//5 / 5 = 1
//난 무조건나온다
//첫번째 숫자를 입력하세요
//1
//두번째 숫자 입력하세요
//0
//숫자를 입력하세요
//난 무조건나온다
//첫번째 숫자를 입력하세요
//2
//두번째 숫자 입력하세요
//a
//나머지 에러
//난 무조건나온다
