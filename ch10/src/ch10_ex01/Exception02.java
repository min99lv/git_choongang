package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception02 {

	public static void main(String[] args) {
//		텍스트를 읽는 클래스																입력값을 받아와서 저장한다.
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

//		무한루프
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 =>");
//			예외처리
			try {
				int num1 = Integer.parseInt(bin.readLine());
				System.out.print("두 번째 값을 입력하세요 =>");
				int num2 = Integer.parseInt(bin.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
//							Error 범용처리 -> 어떤 exception이 걸려도 여기서 처리를 한다 = 퉁친다
			} catch (Exception e) { // 예외처리의 조상..: Exception
				System.out.println("값을 잘못 입력했습니다");
			} 

		}

	}

}
