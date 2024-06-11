package ch04_ex01;
//0523완
public class If02 { 				//	문자열을 숫자로 파씽하는 방법 예제
																		//	argments = 인자 : 값을 나중에 대입하는 것 
		public static void main(String[] args) {	
				int a = Integer.parseInt(args[0]) ;		//	.parselnt :문자열을 숫자(int)로 바꿔주는 메소드-> 숫자가 아니라면 오류	
																						//	배열의 시작은 0 부터
				int b = Integer.parseInt(args[1]) ;		//	시작이 0이기때문에 다음은 1부터 시작
				String str = args[2] ;									//  args 스트링 값도 받아들일 수 있다 ->여러개의 파라미터 값을 받아들일 수 있다는 코드
				
				System.out.println("a->"+a);				//	[a->35]
				System.out.println("b->"+b);				//	[b->20]
				System.out.println("str->"+str);			// 	[str->파라메타테스트]
				
				if (  a > 0	) { //	 a 
					System.out.println(a+"는 양수");			
					System.out.println("양수일");
				} else {
					System.out.println(a+"는 음수");
					System.out.println("음수일");
				}
				System.out.println("프로그램 종료");	
			
		}
}

// 	파라미터로 값을 받아서 수행하는 것 : 파라미터란 매개변수
//	arguments 값 35 두번째 값 12  = 문자열로 나온다
//	장점 : 값을 소스파일에 넣어줄 필요가 없고 파일을 실행할 때 값을 넣어주는 것 ==> 재사용이 가능하다


// run as -> run configuration -> arguments에 값을 입력해주면 출력
// 두개의 값을 넣고 싶을 때는 뛰어쓰기로 구분 
// 예 a= 35 , b= 20 을 넣고 결과값을 보고싶다면 arguments에 35 20 을 입력