package ch03_ex01;
//0523완
public class Ex02DenyLogicOperatorEx {				// 불리안 타입 비교연산자 

	public static void main(String[] args) {
		boolean play	=	true;		//	play = true
		System.out.println(play);
		
		play = !play;							// play = false - 참의 부정 거짓
		System.out.println(play);
		
		play = !play;							//play = true - 부정의 부정은 참
		System.out.println(play);
		
		

	}

}
