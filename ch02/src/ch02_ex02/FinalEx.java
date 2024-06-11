package ch02_ex02;
//Study
//0523완
public class FinalEx {			//	final변수 = 상수 예제
	
	public static void main(String[] args) {
		
		final double	PI	=	3.14;			//	final이 들어가면 대문자로 사용하기
		double	radius = 2.0,circum;
		
		//	PI++; 			-->컴파일 에러  - 상수는 할당 할 수 없다 = 왜냐 마지막값이니까 
		circum 	= 	2 	*	 PI	*	 radius;
		System.out.println(circum);
		
	}

}
