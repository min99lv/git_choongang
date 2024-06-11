package ch02_ex01;
//0522완
public class LongEx {			//	long 문법

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
		//	long var3 = 100000000000; 정수는 기본적으로 int 타입 컴파일 에러 int값을 넘는 수는 L을 넣어줘야 한다.
		long var4 = 100000000000L; 
		
		System.out.println("var1->"+var1);
		System.out.println("var2->"+var2);
		System.out.println("var4->"+var4);
	}

}
