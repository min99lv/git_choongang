package ch02_ex02;
//0523완
public class EqulityEx {		// 동등연산자 예제

	public static void main(String[] args) {
		int	num1	=	5;
		int	num2	=	2	+	3;			//5
		
		if	(num1	==	num2)	// 5 = 5
			System.out.println("num1과 num2의 값은 동일합니다.");
		
		if	((num1	!=	  num2)	==	false)	//num1 과 num2 값이 같지 않다 = false = 참
			System.out.println("다르다고 하면 거짓말");
	}

}
