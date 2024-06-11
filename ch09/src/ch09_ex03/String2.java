package ch09_ex03;

public class String2 {

	public static void main(String[] args) {
		char[] c = { 'k', 'o', 'r', 'e', 'a' };
//														생성자 오버로딩
		String str1 = new String(c);
		String str2 = new String(" Fighting");
		String str3 = str1 + str2;

		System.out.println(str3);
//												숫자 연산 + 문자열 
		System.out.println(2 + 1 + 1 + 5 + "년");
//												문자열 + 숫자=문자열처리
		System.out.println("연1: " + 2 + 1 + 1 + 5);
//												문자열+(숫자) = 괄호먼저 처리
		System.out.println("연2: " + (2 + 1 + 1 + 5));

	}

}

//console
//korea Fighting
//9년
//연12115
//연29