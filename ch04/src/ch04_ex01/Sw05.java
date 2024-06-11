package ch04_ex01;

public class Sw05 {		//	Sw03를 이용한 중첩 스위치문 + 스위치문 안에 if문 예제

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);		//	파라미터로 월 값을 받아온다
		String season	= "";
		
		switch (num) {												//	월을 받아서 스위치문에서 받아들인다  
				case 12:			
				case 1:			
				case 2:	
										switch (num){				//	중첩 switch문
										case 12 : System.out.println("초겨을");	break;
										case 1 : System.out.println("초겨을");	break;
										case 2 : System.out.println("초겨을");	break;
										}
								season  = "겨울";			
								break;
				case 3:			
				case 4:			
				case 5:			
										if (num ==3 || num == 4) System.out.println("대박");	// 스위치문 안에 if문 사용가능
										else System.out.println("...");
								season  = "봄";			
								break;
				case 6:			
				case 7:			
				case 8:			
								season  = "여름";			
								break;
				case 9:			
				case 10:			
				case 11:			
								season  = "가을";			
								break;
				default :													// 1~12말고 다른 값을 입력하면 오류 default는 생략가능하다
								System.out.println("오류야");
			}
		
		System.out.println(num+"월은 "+season+" 입니다");
	}

}
