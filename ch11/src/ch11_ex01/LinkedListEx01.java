package ch11_ex01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
//		리스트 생성 = kk
		LinkedList<String> kk = new LinkedList<String>();
//		배열 생성 = animal
		String[] animal = { "산토끼", "고양이", "진돗개", "치와와", "토끼" };
//		배열의 값들을 LinkedList에 저장
		for (int i = 0; i < animal.length; i++) {
			kk.add(animal[i]);
		}
//		1.출력
		System.out.println("kk1->" + kk);

		int i = 0;
//		Iterator : 요소를 순회하는 인터페이스
		Iterator<String> it = kk.iterator();
		while (it.hasNext()) {
//		2.출력
			System.out.println(i + "->" + it.next());
			i++;
		}
//		3.출력
		System.out.println("kk2->" + kk);
//		4.출력
		System.out.println("-----------simple------------");
		i = 0;
		while (!kk.isEmpty()) {
//																		 메모리에서 삭제 시켜가면서 꺼낸다
			System.out.println(i + "->" + kk.poll());
			i++;
		}
		System.out.println("kk3->" + kk);

	}

}
