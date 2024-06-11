package ch02_ex01;
//Study
//0522완
public class OperationsPromotionEx {		// 정수연산에서 자동타입변환 예제

	public static void main(String[] args) {
		byte byteValue1 = 10;		
		byte byteValue2 = 20;
		//	byte byteValue3 = byteValue1+byteValue2; //	컴파일 에러 --> 정수타입의 연산에서 자동타입변환되어서 int로 인식된다 
		//	작은 데이터 타입끼리 연산을 하는 것은 오류가 날 확률이 높아서 자바 내에서 막아놓은 것 
		int intValue1 = byteValue1+byteValue2; 			//	int 타입으로 바꾸면 잘 실행된다.
		System.out.println("intValue->"+intValue1); //	[intValue->30]

		char charValue1='A';
		char charValue2=1;
		//	char charValue2=charValue1+charValue2; //컴파일 에러 
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValue2);				//	[유니코드=66]
		System.out.println("출력문자="+(char)intValue2);	//	[출력문자=B]
	}

}
		//	정수에서 int 타입보다 작은 byte, short타입의 변수는 int타입으로 자동형변환 연산을 수행함