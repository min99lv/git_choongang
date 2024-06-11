package ch04_ex02;
// hw2
public class SwitcNoBreakCaseEx {

	public static void main(String[] args) {
		// 8 <= ... < 12 (8+4) 사이의 정수 얻기 --> random
		
		int time = (int) (Math.random()	*	4)	+	8;
		System.out.println("[현재시간:"+time+"시]");
		
		//switch (time)
		// 8 -> 출근합니다
		// 9 -> 회의합니다
		// 10 -> 업무를 봅니다
		// 나머지-> 외근을 나갑니다
		String todo = "";
		switch (time) {
		case 8:
			todo = "출근 합니다";
			break;
		case 9:
			todo = "회의를 합니다";
			break;
		case 10:
			todo = "업무를 봅니다";
			break;
			default:
				todo ="외근을 나갑니다";
		}
		System.out.println(time+"시 ->"+todo);
				
	}

}
