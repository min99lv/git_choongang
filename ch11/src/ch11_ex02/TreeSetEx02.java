package ch11_ex02;

import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		int i = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(54);
		ts.add(24);
		ts.add(72);
		ts.add(34);
		ts.add(52);
		
		for (Integer t : ts) {
			i++;
//			1.출력
			System.out.println(i + "번째 t-->" + t);
		}

	}

}
