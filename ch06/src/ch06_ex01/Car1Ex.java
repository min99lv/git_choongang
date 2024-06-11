package ch06_ex01;
// 0528완
class Car1 {//객체		// 퍼블릭은 하나만.........................
	//	공유 변수 --> class 변수 (전역변수) : 메모리를 공유하고있다 --> 실행-> 속도가 달라진다 
	// 메모리가 인스턴스안에 생성되는 것이 아니라서 선언하지 않고 사용가능
	static int speed;
	//	Member 변수, 필드,속성 = 성격
	String color;
	
	void print() {
		System.out.println("색깔"+color);
		System.out.println("속도"+speed);
		System.out.println("- - - - - - - - - - - -  - - - - ----");
	}
}

public class Car1Ex {
		// static이 붙어 있는것은 객체 선언 없이 사용 가능 (공유변수)
	public static void main(String[] args) {
		//	c1.color = "빨강"; // 선언 전에 속성을 주면 오류
		Car1.speed = 130; // 공유 변수 이면서 클래스 변수이기때문에 인스턴스화 하지 않아도 사용가능한 변수
		//  선언 				 생성
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.print(); // 인스턴스를 상속받고 프린트해도 변수는 생성되어있다.
		
		c1.color = "빨강";
		c1.speed = 200;		// 전구 의미 -> 이렇게 사용해도 되지만 스태틱변수는 이렇게 해달라?는 의미
		c2.color = "노랑";
		
		c1.print();
		c2.print();
			

	}

}


// int 초기값을 지정하기 않으면 0으로 들어간다