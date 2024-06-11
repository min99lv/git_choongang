package ch11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx_Hw01 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용균", 80);
		map.put("홍길동", 95);
		map.put("신용권", 85);

		System.out.println("총  Entry 수" + map.size());
		System.out.println("전체원소" + map);
		System.out.println("신용균:" + map.get("신용균"));
		
//		Set <String> st = map.keySet();
//		Iterator<String> keyst = st.iterator();
		Iterator<String> st = map.keySet().iterator();
		while(st.hasNext()) {
			String key = st.next();
			System.out.println(key+map.get(key));
		}
				
	}

}
//총 Entry 수: 3
//전체원소 : {신용균=80, 홍길동=95, 신용권=85}
//신용균 : 80
//--- 객체를 하나씩 처리 iterator, keySet --- 
//신용균 : 80
//홍길동 : 95
//신용권 : 85

//객체 찾기	-> 신용균 & 전체원소

//객체를 하나씩 처리 iterator, keySet