package ex0531.ch08_ex04;

public class Car {
//	필드(Tire와 연관관계)						: 위치,남은수명
	Tire frontLeftTire = new Tire("앞 왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽",3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
//	생성자
	
//	메소드 
	int run() {
		System.out.println("[자동차가 달립니다]");
//										Tire클래스의 roll 메소드 실행
//		if문이기 때문에 다 돌고 다시 run으로 간다
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		};
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		};
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		};
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		};
			return 0;
		
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
