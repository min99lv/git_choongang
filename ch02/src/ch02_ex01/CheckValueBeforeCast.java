package ch02_ex01;
//Study
//0522완
public class CheckValueBeforeCast {			//	if를 이용해서 casting전에 값을 확인하는 예제
	public static void main(String[] args) {
		int	i	=	128;		//	변수 선언 4byte
		//	int i = 126			-->범위안에 들어가지 않기때문에 else문이 실행되는 경우
		
		                           	 //	i<-128    or     i>127 이면 참 = 둘 중 하나가 참이면 참 
		if	((	i	<	Byte.MIN_VALUE	)	||	(	i	>	Byte.MAX_VALUE	))	{		//참이면 if문 실행 
			System.out.println("byte 타입으로 변환할 수 없습니다.");		//126
			System.out.println("값을 다시 확인해주세요.");
		} else {										//	if문이 참이 아니면 else문 실행
			byte b = (byte) i;				// 강제타입변환 실행  				
			System.out.println("b->"+b);
		}
		
	}
}
