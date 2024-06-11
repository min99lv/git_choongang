package ch04_ex02;
// 현장과제
// IfDiceEx을 switch로 컨버젼
//0523완
public class SwitchEx01 {

	public static void main(String[] args) {
		int num = (int) (	Math.random()*6	)	+	1;
		
		switch (num) {
				case 1:
					System.out.println("1번이 나왔습니다.");
					break;
				case 2:
					System.out.println("2번이 나왔습니다.");
					break;
				case 3:
					System.out.println("3번이 나왔습니다.");
					break;
				case 4:
					System.out.println("4번이 나왔습니다.");
					break;
				case 5:
					System.out.println("5번이 나왔습니다.");
					break;
				case 6:
					System.out.println("6번이 나왔습니다.");
					break;
		}
		
	}
	
}


