package ch02_ex01;
//0523
public class LiteralExam {		// 진수에 따른 변수 값 저장 예제

	public static void main(String[] args) {
		//type 변수명 = 변수값 
		int var1 = 10;													//  일반적으로 숫자는10진수 결과값 [10]
		System.out.println("var1->"+var1);
		
		int var2 =010;
		System.out.println("var2->"+var2);		// 숫자앞에 0을 붙이면 8진수로 인식 결과값 [8]
		
		int var3= 0x10;
		System.err.println("var3->"+var3);		// 숫자앞에 0x를 붙이면 16진수로 인식 결과값 [16]
	}

}
