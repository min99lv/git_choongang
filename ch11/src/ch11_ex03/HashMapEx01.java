package ch11_ex03;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
//								key 	value
//			1. Key	 중복 허용 X				
//			2. Value 중복 허용 O
		HashMap<String, String> hm01 = new HashMap<String, String>();
		 hm01.put("이승우","010-2222-3333");
		 hm01.put("손흥민","010-3333-3333");
		 hm01.put("전지현","010-4455-3333");
		 hm01.put("전지현","010-4455-3456");			// key가 같으면 Value는 마지막에 저장한 값으로 엎어친다
		 hm01.put("전지현3","010-4455-3456");			// Value는 같아도 키 다른 건 허용
		 
//		 																					꺼낼 때 키를 주면 Value가 나온다 = 순서 필요 X
		 System.out.println("이승우 TEL:"+hm01.get("이승우"));
		 System.out.println("손흥민 TEL:"+hm01.get("손흥민"));
		 System.out.println("전지현 TEL:"+hm01.get("전지현"));
		 System.out.println("전지현3 TEL:"+hm01.get("전지현3"));

	}

}

