package ch04_ex01;
//hw05 
//0524 완
import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		//	int num = System.in.read()-'0';
		//	for 구구단 완성
		
		int num = System.in.read()-'0'; // 아스키코드로 값을 입력받았을 때 
																	 // '5'-'0'  => 53-48 = 5로 한자리 숫자를 입력할 수 있지만 
																	 // 두자리 숫자에는 사용할 수 없는 단점
		
		
		if (num	>=	2 && num <= 20) {	// 2<= num <=20 일때만 수행 2~20단까지 출력할거임
			for (int i =	1; i	<=	9;	 i++) {		
				System.out.println(num	+	" * "	+	i	+	"="	+	num	*	i);	
			}										// 5 * 1 = 5
		}

	}

}


/*보고싶은 구구단 숫자는
5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
*/