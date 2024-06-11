package ch08_ex01;

// 객체 형변환에 관한 예제
public class Ex05RobotEx {

	// 유지보수에 좋은 소스코드
	static void action(Ex05Robot r) {
		// r의 객체 type = > DanceRobot이냐 ? 나는 의미
		// 로봇을  댄스로봇으로 사용하고 싶기 때문에 형변환
		if (r instanceof DanceRobot) { // 1. r(DanceRobot) == DanceRobot 이 맞냐 ?
			DanceRobot dr = (DanceRobot) r; // 2. 맞다. 댄스로봇 참조변수 dr = 댄스로봇으로 형변환해서 저장
			dr.dance(); // 3. 형변환의 의미는 찐 r이 찐 댄스로봇인스턴스라는 것
			((DanceRobot) r).dance(); // 4. 따라서 r이 댄스로봇의 인스턴스일때 댄스 메소드를 출력하라는 의미
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		} else {
//			(( SingRobot)r).sing(); : 밑에 두줄을 한줄로 축약
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}

	// 공유메소드 -> 공유 메소드만 사용가능
	public static void main(String[] args) {
		// 객체 배열 선언
		Ex05Robot[] rb = new Ex05Robot[3];
		rb[0] = new DanceRobot(); // rb[0] = DanceRobot 객체 저장
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		// rb = Robot의 배열 {DanceRobot,DrawRobot,SingRobot}
		for (Ex05Robot r : rb) {
			action(r);
		}
	}

}

// instanceof ==> 객체타입 비교 연산자
// 같은 계열은 캐스팅 가능
