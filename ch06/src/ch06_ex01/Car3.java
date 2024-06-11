package ch06_ex01;

public class Car3 {	// 주차요금 계산 클래스
	String name;		// 멤버변수
	int inTime;			// 입고시간
	int outTime;		// 출고시간
	int fee;					// 주차요금
	final int AMTPERTIME = 3000;		// 시간당요금 -> 상수 파이널변수 
	
	public Car3() {		// 기본 생성자
		// TODO Auto-generated constructor stub
		// 메모리만 생성한다는 의미
	}

	// overRoading 하나의 클래스 안에 같은 이름의 생성자 메소드가 두개 이상 존재
	// 멤버변수의 갯수나 타입이 다르면 용서해줌 같으면 화남 -> 이름을 바꾸는것은 소용없다.
	
	
	Car3(String n, int inTime, int out)	{		//	클래스 이름과 똑같은 생성자 constructor					
		this.name = n;											//	메모리로 생성될 때 가장먼저 호출되는 메소드
		this.inTime = inTime;		//	멤버변수에 this. 를 붙인다		//	멤버변수들을 초기화와 메모리를 갖는목적으로 사용
		this.outTime = out;
	}
	void print()	{				// 프린트 메소드
		int fee = (outTime - inTime)	*	AMTPERTIME;
		System.out.println("차 이름:"	+	name);
		System.out.println("입고시간:"	+	inTime);
		System.out.println("출고시간:"	+	outTime);
		System.out.println("주차요금:"	+	fee);
		System.out.println("---------------------");
	}
}


// static 클래스 변수 = 전역변수
// 필드 =인스턴스 변수= 필드 = 멤버변수
// 메소드 안에 생성된 변수 = 지역변수

// final 변수 = 마지막 변수 = 상수
// 생성자란 ? 인스턴스가 생성될 때 마다 호출되는 인스턴스 초기화 메소드
// 인스턴스 변수의 초기화, 멤버변수 초기화 목적
// 생성자가 없으면 시스템 내부에서 기본생성자를 만들어준다.
// 근데 기존의 생성자가 있다면 시스템 내부에서 만들어주지 않는다. ->public 접근제어자? 지금은 몰라도된다.
