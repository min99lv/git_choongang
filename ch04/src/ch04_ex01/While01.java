package ch04_ex01;

public class While01 {		// 반복문 while문 예제1

	public static void main(String[] args) {
			int sum = 0, i =1;		//	반드시 !!!!!! while문 변수에 대한 초기값 설정
			while (i<=10) {			// 1 <= i <10 까지 반복한다
				sum += i;					// sum = sum + i  
				System.out.println(i+"까지 합"+ sum);
				i++;								// 출력하고 나면 i에 값을 1 더해준다 
			}
			System.out.println("합계"+ sum);
		
	}

}
