package ex0530;

public interface Robot1 { // 로봇 인터페이스  -> 구현 해주어야한다

}	

class DanceRobot1 implements Robot1{ // 구현 
	void dance() {			// 댄스메소드
		System.out.println("춤을 춘다");
	}
}
class DrawRobot1 implements Robot1{
	void draw() {	// 그림 메소드
		System.out.println("그림을 그린다");
	}
}
class SingRobot1 implements Robot1{
	void sing() {	// 노래 메소드
		System.out.println("노래를 부른다");
	}
}


