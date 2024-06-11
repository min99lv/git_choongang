package ch09_ex03;

import java.util.StringTokenizer;

public class StringTok1 {

	public static void main(String[] args) {																			// .,으로 구분= 딜리메타
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기,판딸기.집딸기,알카리딸기", ".,");
//		                                           0	     1       	2	      3	     4
//		StringTokenizer내부 : 산딸기 집딸기 판딸기 집딸기 알카리딸기 => 향상형 for문과 거의 비슷하다
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
