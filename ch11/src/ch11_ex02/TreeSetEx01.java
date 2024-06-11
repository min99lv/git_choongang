package ch11_ex02;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
//		Set 선언 순서 X, 중복 X
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
//		ts.size = 6 이되면 종료
		while (ts.size() != 6) {
			int num = (int) (Math.random() * 45) + 1;
//			1. 출력
			System.out.println("num-->" + num);
			ts.add(num);
		}
//		2.출력
		System.out.println(ts);

	}

}
