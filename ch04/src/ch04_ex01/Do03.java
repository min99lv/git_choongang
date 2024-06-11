package ch04_ex01;
//0524완
import java.util.Scanner;	//자바 유틸 객체 

public class Do03 {			// Do while문과 스캐너를 사용해서 사용하여 숫자 맞추기 게임 예제

	public static void main(String[] args) {									// 2바이트 사용 가능한 스캐너
		Scanner sc = new Scanner	(System.in);							// 스캐너객체를 사용하면 int형태로 값을 받아들일 수 있다.
																													// arguments는 스트링으로 받아야함.. 
		
		int cnt = 0, num;																			// 몇번만에 맞추었는지 세는 카운트 변수와 입력값 num 변수
		int answer = (int)	(Math.random()	*	100)	+	1;					//1~100정수		//프로그램이 정한 숫자 값
				do {
					System.out.println("1~100중 어떤 숫자일까요?");
					num = sc.nextInt();															// 숫자로 가져왔기때문에 숫자입력 가능 
					
					//System.out.println("num->"+num);  --> 입력이 잘되었는지 확인해주는 소스
					
					if (answer == num) {																										
						System.out.println(cnt+"번에 맞췄습니다 축하 !!");	//만약 answer = num 값이 같을시 if문출력
						break;																				// 맨 밑에 문장을 보면 무한루프로 조건을 정했기 때문에 break를 걸어준다
					}	else if (answer >num) {												// answer >num 일 시 첫번째 else if문 출력
							System.out.println("더 큰수를 입력하세요");
					}	else System.out.println("작은 수를 입력하세요");		// 아닐시 else 출력 
					cnt++;																					//  카운트가 더해진다.
					}	while (true);																		// 무한 루프
				
	}
	
}

