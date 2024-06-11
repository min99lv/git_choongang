package ch04_ex03;
//hw07
import java.util.Scanner;

public class ex0302 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 잔액

		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("1. 예금|2.출금|3.잔고|4.종료");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("선택>");
			
			int menuNum = scanner.nextInt();
			// HW07
			// menuNum->1
			//   1) balance = balance + 예금액
			// menuNum->2
			//   2) balance = balance - 출금액
			// menuNum->3
			//   잔고 조회 콘솔에 보여줌
			
			switch(menuNum) {
			case 1:
				balance += scanner.nextInt();
				break;
			case 2:
				balance -=  scanner.nextInt();
				break;
			case 3: 
				System.out.println(balance);
				break;
			case 4:
				run = false;
				System.out.println("종료");
				break;
			}
			
		}
	}

}
