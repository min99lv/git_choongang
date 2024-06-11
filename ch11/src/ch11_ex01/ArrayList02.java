package ch11_ex01;

// 포도주
import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
//		중복 --> ok , 순서 --> 유지 
		ArrayList<String> list = new ArrayList<String>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
//		System.out.println("list ->" + list); -> 안나온다고 가정함 -> 오버라이드
		devPrint(list); // 메소드를 만들어서 출력함 필요하다면..
//		 1번 자리에 끼워 넣기 가능하다.
//		0		1		2			3		4		5	
//		수박	사과	바나나	수박	대추	바나나	
		list.add(1, "키위");
		devPrint(list);
//		수박	키위	사과	바나나	수박	대추	바나나 add	= 밀림
		list.set(4, "봉숭아");
		devPrint(list);
//		수박	키위	사과	바나나	봉숭아	대추	바나나	 set = 교체
		list.remove(0);
		devPrint(list);
//		키위	사과	바나나	봉숭아	대추	바나나 remove = 삭제
		System.out.println("3번 인덱스 ->" + list.get(3));
//		contains 메소드 바나나를 담고 있는지 확인 
		System.out.println("바나나 문의" + list.contains("바나나"));
//		indexOf 메소드 바나나의 인덱스 출력
		System.out.println("바나나 문의" + list.indexOf("바나나"));
//		lastIndexOf 메소드 마지막순서의 바나나 인덱스 출력
		System.out.println("바나나 문의" + list.lastIndexOf("바나나"));

//		바나나로 되어진 것을 딸기로 바꾸고싶을때
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("바나나")) { // 가져온 값이 바나나랑 같은지 확인
				list.set(i, "딸기");						   // 같으면 딸기로 교체
			}
		}
//		딸기로 바뀐값 확인
		devPrint(list);
	}
//																	call by reference 이름이 바껴도 된다.
	private static void devPrint(ArrayList<String> list) {
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println("\n---------------------------------------------------------------------");

	}

}
