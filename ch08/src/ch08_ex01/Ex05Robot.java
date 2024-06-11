package ch08_ex01;

public interface Ex05Robot {

}

class DanceRobot implements Ex05Robot {
	void dance() {
		System.out.println("춤을 춥니다");

	}
}

class DrawRobot implements Ex05Robot {
	void draw() {
		System.out.println("그림을 그립니다");

	}
}

class SingRobot implements Ex05Robot {
	void sing() {
		System.out.println("노래를 부릅니다");

	}
}