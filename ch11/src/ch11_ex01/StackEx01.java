package ch11_ex01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
//		배열 선언																			중복허용 -> 리스트 계열 
		String[] pet = { "지렁이", "굼벵이", "애벌레", "구렁이", "지렁이" };
//		리스트 선언<자료형> 
		Stack<String> st = new Stack<String>();
//										"지렁이", "굼벵이", "애벌레", "구렁이"
		for (String str : pet) {
//			1.출력
			System.out.println("psuh-->" + str);
//			스택에서 데이터를 집어 넣는 것 = push 데이터를 꺼내는 것 = pop
			st.push(str);
		}
//		2. 출력
		System.out.println("push st ->"+st);
//		3.출력
		System.out.println("-------------------------------");
//							스택이 비었는지 확인하는 메소드
		while (!st.isEmpty()) {
			System.out.println("POP->" + st.pop());
		}
//		pop을 한 후에 스택 출력 : 메모리까지 삭제하면서 실행 
		System.out.println("POP st->" + st);

	}

}
