package ch02_ex02;
//0523완
//Study & review
public class IncDecEx {	//	증감연산식 예제

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3=0, num4=0, num5 = 0;
		int result1 = num1++;			//	++연산의 결과는 num1의 기존값			//0
		int result2 = num2--;				//	--연산의 결과는 num2의 기존값			//0
		int result3 = ++num3;			//	++연산의 결과는 num3의 새로운값		//1
		int result4 = --num4;				//	--연산의 결과는 num4의 새로운값		//-1
		//int result5;								//	--연산의 결과는 num4의 새로운값		//0
		
		int result5 = ++num5;			//1															//1
		++num5;									//2															//2
		result5 = num5;						//0															//0
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		System.out.println("result4="+result4);
		System.out.println("result5="+result3);																						//1
		result3--;											//	단독실행할 때는 앞에 붙이나 뒤에 붙이나 결과값이 똑값다				//0
		System.out.println("result6="+result3++);																					//0
		System.out.println("result3="+result3);																						//1

	}

}
