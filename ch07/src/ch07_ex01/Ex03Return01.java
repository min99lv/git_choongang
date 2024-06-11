package ch07_ex01;
//0529 리턴형에 대한 예제
//0529완
class C1 {
	
	void divide1(int x, int y) {
		if (y == 0) {
			System.out.println("y가 0이야 0으로 못 나눠");
			return; // 여기까지 하고 메소드를 호출한 곳으로 돌아가라는 의미
		}
		System.out.printf("%d / %d = %d\n", x, y, x / y);

	}

	int divide2(int x, int y) {	// 반환값을 받기위한 메소드 -> 반드시 타입이 같은 리턴값이 있어야한다.
		if (y == 0) {
			System.out.println("y가 0이야 0으로 못 나눠");
			return y;
		} else
			System.out.printf("%d / %d = %d\n", x, y, x / y);
		int retDivide = x / y; 
		return retDivide; // 나눈값을 리턴하는 변수 
	}

}

public class Ex03Return01 {

	public static void main(String[] args) {
		int resultDivide1,resultDivide2,resultDivide3;   // 나눈 결과값  int 여야 리턴값을 반환할 수 있다.
		C1 c = new C1();	// 인스턴스 
		c.divide1(13, 3);	// divide1 메소드 호출
		resultDivide1 = c.divide2(13, 3);
		resultDivide2 = c.divide2(23, 3);
		resultDivide3 = c.divide2(33, 3);
		int total = resultDivide1+resultDivide2+resultDivide3; 
		System.out.println("Main resuleDivide Total-->" + total);

	}

}

//console
//13 / 3 = 4
//13 / 3 = 4
//Main resuleDivide-->4



