package ch04_ex01;

public class WhileBreak01 {		// break 예제

	public static void main(String[] args) {
					int num = 0, sum=0;
					while (true) 			// 조건이 true면 무한반복된다 이 때 break를 걸면 실행이 종료된다
					{
						num ++;								// num 1씩 증가
						sum +=num;						// sum = sum + num
						if (num==5) break;		// num = 5가 되면 프로그램 종료
					}  // break 반복문, 분기문 종료
					System.out.println("합계:"+sum);
					System.out.println("끝");

	}

}
