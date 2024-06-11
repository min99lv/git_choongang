package ch02_ex01;
//0522완
public class ByteEx {			//	Byte타입 변수 범위 예제 

	public static void main(String[] args) {
				byte var1 = -128;
				byte var2 = -30;
				byte var3 = 0;
				byte var4 = 30;
				byte var5 = 127;
				//	byte var6 = 128;			//	컴파일 에러	-	byte타입은 -128~127까지 표현 가능하므로 에러 
				
				System.out.println("var1->"+var1);
				System.out.println("var2->"+var2);
				System.out.println("var3->"+var3);
				System.out.println("var4->"+var4);
				System.out.println("var5->"+var5);

	}

}
