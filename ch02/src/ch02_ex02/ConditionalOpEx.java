package ch02_ex02;
//Study
//0523완
public class ConditionalOpEx { 			//	삼항연산자 if문 표현 예제

	public static void main(String[] args) {
			int a = 20, b =30, max;				//max는 선언만 함.
			
			max = a  >  b ?  a : b ;   // a>b크면 ? a   &  아니면 b
					
			/*                                   윗줄이랑 같은 뜻
			if (a > b) {
				max = a;
			} else {
				max = b;
			}
			*/
			System.out.println("max->"+ max);
	}

}
