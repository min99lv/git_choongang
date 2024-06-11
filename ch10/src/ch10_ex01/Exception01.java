package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception01 {
//																							예외를 시스템한테 던진다는 의미 = 니가 처리해라
	public static void main(String[] args) throws NumberFormatException, IOException  {
//		텍스트파일을 읽는 클래스													콘솔에서 사용자의 입력을 문자열로 읽어오기 위한코드
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

//		무한루프
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 =>");
//																	한줄만 읽는다
			int num1 = Integer.parseInt(bin.readLine());
			System.out.print("두 번째 값을 입력하세요 =>");
			int num2 = Integer.parseInt(bin.readLine());
			System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

		}

	}

}

