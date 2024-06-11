package ch04_ex01;
//0523완
public class Sw01 {			//	조건문 Switch 01 예제

	public static void main(String[] args) {
		int num = Integer.parseInt(args [0]);									//	 파라메터 값으로 1을 실행
		switch(num) {
						case 1 : System.out.println("L"); break;		//	 Break가 없으면 뒷문장까지 계속 실행한다
						case 2 : System.out.println("O"); break;
						case 3 : System.out.println("V"); break;
						case 4 : System.out.println("E"); break;
						default : System.out.println("똑바로 해");
		}

	}

}


	// 스위치문 사용 시 break를 반드시 걸어준다.