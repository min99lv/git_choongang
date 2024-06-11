package ch07_ex01;
// 리턴형을 스트링으로 하는 예제
//0529완
class F1 {
	int add(int x, int y) { // int값을 반환하는 메소드
		return x + y;
	}

	String print(String name) { // String 값을 반환하는 메소드
		return name + "Return Name"; // 스트링을 리턴하는 법
	}
}

public class Ex04Return02 {

	public static void main(String[] args) {
		F1 f1 = new F1();												// f1 객체 생성
		System.out.println(f1.add(10, 5));				// f1에 add메소드 호출
		int k = f1.add(7, 6);											// add메소드에 입력값을 반환하는 코드
		System.out.println("연산결과" + k);				// k를 출력
		System.out.println(f1.print("양만춘"));
		String result = f1.print("대조영");
		System.out.println(result);
	}

}


// F1클래스 선언 -> int타입의 add메소드 생성 & String 타입의 메소드 생성 -> F1을 인스턴스해서 f1 객체 생성 -> f1.add(x,y); 메소드 호출
// int k를 선언해서 add메소드 호출하고 리턴값을 반환한다 -> k출력 -> print메소드를 사용해서 문자열을 출력
// result 변수에 print메소드 리턴값 저장 -> result 출력


//console
//15
//13
//양만춘Return name
//대조영Return name