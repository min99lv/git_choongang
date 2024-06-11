package ch04_ex02;
//hw1
//0524완
public class SwitchStringEx {

	public static void main(String[] args) {
		String  position = args[0];
		//부장 -> 700만원
		//과장 -> 500만원
		//그외 -> 300만원
		int num=0;
		
		switch(position) {
			case "부장":
					num =700;
					break;
			case "과장":
					num =500;
					break;
			case "그 외":
					num =300;
					break;
			
		}
		System.out.println(position +"->"+num+"만원 입니다");

	}

}
