package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception03 {

	public static void main(String[] args) {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

//		무한루프
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 =>");
			try {
				int num1 = Integer.parseInt(bin.readLine());
				System.out.print("두 번째 값을 입력하세요 =>");
				int num2 = Integer.parseInt(bin.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
				
//			Excetption02보다 더 정교한 예외처리
			} catch (NumberFormatException e) { // 입력값이 숫자가 아닌경우의 예외처리
				// TODO Auto-generated catch block
				System.out.println("숫자를 입력해야 합니다");
			} catch (ArithmeticException e) { // 입력값이 0인 경우에 예외처리
				// TODO Auto-generaFted catch block
				System.out.println("0으로 나누는 계산을 처리할 수 없습니다.");
//			 반드시 해주는게 좋다 예측하지 못한 오류처리
			} catch (Exception e) { // 예외처리의 조상..: Exception
				System.out.println("값을 잘못 입력했습니다");
			} 


		}


	}

}
