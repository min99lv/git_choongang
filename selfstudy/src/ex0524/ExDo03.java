package ex0524;

import java.util.Scanner;	//자바 유틸 객체 

public class ExDo03 {			// Do while문을 사용하여 숫자 맞추기 게임 예제

	public static void main(String[] args) {
		Scanner sc = new Scanner	(System.in);
		
		int cnt = 0, num;
		int answer = (int)	(Math.random()	*	100)	+	1;
			do {
				System.out.println("1~100중 어떤 수?");
				num = sc.nextInt();
				
				if (answer == num) {
					System.out.println(cnt+"번에 맞췄습니다 !!!!!축하");
					break;
				} else if (answer > num) {
					System.out.println("더 큰수를 입력하셔");
				} else 
					System.out.println("더 작은 수를 입력하셔");
				cnt++;		
			} while (true);
				
	}

}

