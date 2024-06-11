package ch11_ex01;
// List계열
// 240605
import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {	
//																					앞에 스트링 있으면 뒤에는 빼도됨
			ArrayList<String > al = new ArrayList<String>();
//			원소 추가 : 중복 가능 , 순서 유지 
			al.add("구렁2");
			al.add("구렁8");
			al.add("구렁2");
			al.add("구렁4");
			al.add("구렁3");
			al.add("구렁1");
			
//			일반 for문 & 향상형 for
//									i < 6 반복
			for (int i = 0; i < al.size(); i++) {
//				 										i번째 인덱스 원소를 보여준다
				System.out.println(al.get(i));
			}
			System.out.println("===========향상형 For문===========");
			for (String str : al) {
				System.out.println(str);
			}
			
	}
}
