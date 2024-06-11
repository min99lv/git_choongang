package ch02_ex01;

public class FromIntToDouble {			//		int형 -> double형 타입으로 형변환하는 예제

	public static void main(String[] args) {
		int	num1		=		123456780;	
		int 	num2		=		123456780;	
		double	num3		=		num2;
		System.out.println("num3->	"	+	num3);
		
		num2		=		(int)	num3;
		int	result		= num1 - num2;
		System.out.println("result->"+result);
		
		//애초에 연산식이 일어날 때는 데이터타입을 맞춰주는 것이 좋다 !!! 큰->작 데이터타입을 잘리는 수가 있기때문에 주의
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println("intValue4->"+intValue4);
		
	}
}
