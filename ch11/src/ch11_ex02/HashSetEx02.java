package ch11_ex02;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx02 {

	public static void main(String[] args) {
//		키보드에서 값 입력
		Scanner sc = new Scanner(System.in);
//		1. 출력
		System.out.println("첫번째 수");
//		사용자 입력값 = num1
		int num1 = sc.nextInt();
//		2. 출력
		System.out.println("두번째 수");
//		사용자 입력값 = num2
		int num2 = sc.nextInt();
//		Set : 순서 유지 X, 중복허용X
		HashSet<Integer> hs = new HashSet<>();
		hs.add(num1);
		hs.add(num2);

		while (true) {
//			랜덤으로 하면 중복된 수가 나올수도 있다
			int num = (int) (Math.random() * 45) + 1;
//			3. 출력
			System.out.println("num->" + num);
//			값 추가
			hs.add(num);
//			hs.size = 6이면 종료
			if (hs.size() == 6)
				break;
		}
//		4. 출력
		System.out.println(hs);
		sc.close();
	}

}
