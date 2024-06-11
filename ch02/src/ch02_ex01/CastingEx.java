package ch02_ex01;
//0522완
public class CastingEx {			//	강제타입변환(Casting) 예제
			
	public static void main(String[] args) {
		int intValue = 44032; 														//	int = 4byte --> 유니코드로 결과값 [가]
		char charValue = (char)intValue;								//	char = 2byte이므로 (char) intValue로 바꿔주지 않으면 오류가 난다
		System.out.println("charValue-> "+charValue);
		
		long longValue1 = 5001234567L; 								//	long = 8byte
		intValue = (int) longValue1;											//	int = 4byte (int) longValue 로 강제타입변환 해주어야한다.
		System.out.println("intValue-> "+intValue); 			//	[intValue-> 706267271] ->>안에 들어갈 수 있는 부분이 한정적이기때문에 자른다.
		
		long longValue2 = 500L; 												//	long = 8byte
		intValue = (int) longValue2;											//	int = 4byte (int) longValue 로 강제타입변환 해주어야한다.
		System.out.println("intValue-> "+intValue); 			//	[intValue-> 500] ->>	int범위 안에 있는 값이면 그대로 나온다
		
		
		double doubleValue = 3.14; 										//	double = 8byte
		intValue = (int) doubleValue;										//	int = 4byte	(int)double 마찬가지로 강제타입변환 해주어야한다. 
		System.out.println("intValue2-> "+intValue);			//	[intValue2-> 3]	int에 실수를 저장할 수 없기때문에 잘라서 나온다.

	}

}


//	강제타입변환 작은데이터타입 = (작은데이터 타입) 큰데이터 타입; 이렇게 저장해야 실행된다 