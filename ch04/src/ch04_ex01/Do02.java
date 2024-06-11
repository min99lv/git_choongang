package ch04_ex01;
//0524완
public class Do02 {			//	 do while중첩문을 이용하여 구구단을 만드는 예제

	public static void main(String[] args) {
				System.out.println("구구단 Do02");         // 제목 출력
				int i= 1, j=2;														// 구구단은 2단부터시작 														
				do {
					do{																												
						System.out.print(j	+	"	*	"	+	i	+	"	=	"	+	i	*	j	+	"	\t	");			//	출력값 [2 * 1 = 2		]
						j++;																											//  j값을 1만큼 더한다 행으로 출력이 아니라 열로 출력이기때문에
					} while(j	<=	9);																					//  j를 9까지 반복 (9단까지 출력이 된다)	
					System.out.println();																			//  줄바꿈출력
					i++;																												//	i=i+1 피연산자 값을 더해준다
					j=2;																												//  j값을 초기화해야 다시 2단부터 시작할 수 있다
				} while (i	<=	9);																						//	i<=9 까지 반복 

	}

}
