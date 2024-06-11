 package ch09_ex03;

public class String4 {

	public static void main(String[] args) {
//		숫자를 문자로 변경
		String str1 = 12 + "";
		String str2 = String.valueOf(3);
//		문자열을 숫자로 변경
		char c = str1.charAt(0);
		char d = str1.charAt(1); // --> 컴파일 에러 3의 다음 숫자를 찾는데 없기때문에 12면 가능

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(d);

	}

}

// console
// 3
// 3
// 3