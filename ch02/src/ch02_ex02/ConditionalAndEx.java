package ch02_ex02;
//0523완
public class ConditionalAndEx {		// 단항 증감연산자 예제

	public static void main(String[] args) {
		int num1 = -1, num2	=	0;			//	전역변수
		//num1	=	0 이면 if문 실행 num2	=	-1이면 if문을 실행하지 않는다.
		
			 //0 >0 =false 또는 1>0 이므로 참 if문이 실행됨 
		if(++num1	> 0 || ++num2 > 0)		
			System.out.println("num1이 0보다 크고 num2 보다 큽니다."); //		if문이 한줄이면 중괄호를 쓰지 않아도 된다
		
		 System.out.println("num1=" + num1);
		 System.out.println("num2=" + num2);

	}

}
