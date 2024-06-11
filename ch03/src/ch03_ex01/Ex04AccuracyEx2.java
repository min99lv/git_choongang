package ch03_ex01;
//0523완
public class Ex04AccuracyEx2 {			//	연산 처리 우선순위 예제2

	public static void main(String[] args) {
		int		apple 		 = 1;			
		int		totalPiece = apple * 10;
		int		number 	 = 7;
		
		int 		temp 			 = totalPiece - number; //	3	=	10 - 7 
		// 자바 연산에서 *, /, % 의 우선 순위 -> + -
		// 우선 순위가 동일할 때는 왼쪽 -> 오른쪽 방향으로 연산
		double result		 = temp / 10.0; //	0.3

		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");
	}

}
