package ch04_ex01;
//0524완
public class For01 {			//	for값을 이용해서 1~10의 합을 구하는 예제

	public static void main(String[] args) {
					int sum = 0;															//	합계를 나타내는 변수
					//	process 
					//	1. int i = 1; 2. i<= 10; --> {} 
					//  2. i++ 2. i<=10 --->	{} logic이 끝날때까지
					for (int i = 1; i <=10; i++) {								//	i<=10 일때까지 반복문 실행
						sum += i;															//	sum = sum+i
						System.out.println(i+"까지 합:"+sum);		//  각 값에 따른 합 출력
					
					}
						System.out.println("합계:"+sum);				// 1~10까지 더한 합계를 출력하는 소스
	}

}






