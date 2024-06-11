package ch02_ex01;
//0522완
public class PromotionEx {		//	promotion(자동타입변환) 예제

	public static void main(String[] args) {
		byte	byteValue	=	10;			//	byte = 1byte 	
		int	intValue	= byteValue; 	//	int = 4byte 	--> 작은값을 큰데이터값에 저장하면서 자동타입변환이 된다.
		System.out.println("intValue -> "	+	intValue);
		
		char charValue ='가'; 				//	char = 2byte
		intValue = charValue; 				//	int = 4byte 	--> 자동타입변환이 일어남.
		System.out.println("가의 유니코드 = "	+	intValue);
		
		intValue	=	500; 						//	int = 4byte
		long longValue	=	intValue; 	//	long = 8byte -->자동타입변환
		System.out.println("longValue -> "	+	longValue);
		
		intValue = 200; //	int = 4byte
		double doubleValue = intValue; //	double	= 8byte	-->자동타입변환
		System.out.println("doubleValue -> "+	doubleValue);
	}
	
}

		//	결론 작은 데이터 타입을 큰 데이터 타입 변수에 저장하는 것은 문제가 되지 않는다
		//	 문제는 큰 데이터 타입 -> 작은 데이터 타입에 저장하는 것은 주의