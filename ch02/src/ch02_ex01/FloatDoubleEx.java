package ch02_ex01;
//0522완
public class FloatDoubleEx {			//	실수형 float과 double의 형변환 예제

	public static void main(String[] args) {
		double	var1	=	3.14;
		//	float var2	=	3.14;			-->  실수형 선언시 기본은 double로 저장된다 값은 적지만 double로 인식하기때문에 오류가 난다
		float 		var2	= 3.14F;
		//정밀도 테스트
		double	var4	=	0.1234567890123456789;			//	[var4 : 0.12345678901234568] 
		float		var5	=	0.1234567890123456789F;				//	[var5 : 0.12345679]		--> 정밀도 float < double 정밀도가 약 두배라 이름이 더블...ㅋ
		//	실수 리터럴 다양한 표현법
		int			var6	=	3000000;			
		double	var7	=	3e6; 			//		[3000000.0] 		--> e6	=	10^6
		float		var8	=	3e6F; 		//		[3000000.0]		--> e6	=	10^6 
		double	var9	=	2e-3; 			//		[0.002]					--> e-3 = 10^-3
	
		System.out.println("var1 : "	+	var1);
		System.out.println("var2 : "	+	var2);
		System.out.println("var4 : "	+	var4);
		System.out.println("var5 : "	+	var5);
		System.out.println("var6 : "	+	var6);
		System.out.println("var7 : "	+	var7);
		System.out.println("var8 : "	+	var8);
		System.out.println("var9 : "	+	var9);
		
	}

}
