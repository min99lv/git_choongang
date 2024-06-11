package ch04_ex02;
// 교재 예제 
//0523완
public class IfDiceEx {			// If를 이용해서 주사위 값을 출력하는 예제

	public static void main(String[] args) {
		
		int num = (int) (Math.random()	*	6)	+	1;	
										// Math.random() = 0.0 <= num < 1.0
										// 더블형 값을 양수로 위의 범위안에 랜덤 값을 발생시킨다.
										// 예 ) 0.6 * 6 = 1.8 + 1 = 2 // int 형 + 1 이므로 소수점은 날라간다.
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		 }else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
			} else {
			System.out.println("6번이 나왔습니다.");
			
		}
		

	}

}


// 출력해보면 값이 랜덤하게 나온다