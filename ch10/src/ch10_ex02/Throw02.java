package ch10_ex02;

public class Throw02 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		for (int i = 0; i < 10; i++) {
//			0이 랜덤으로 나오게 되면 오류가 나옴 이런 상태 발생 시 try-catch or Throw  
			int ran = (int) (Math.random() * 10);
			result = num / ran;
			System.out.println("나눗셈 결과 :" + result);
		}

	}

}

// random값이 0으로 발생하면 오류
