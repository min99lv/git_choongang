package ch06_ex01;
// 실행하는 클래스만 메인을 찍는다.
// 0528완
// mainX->설계도 
public class Car {//객체
	// Member 변수, 필드 = 성격
	String color;
	int speed;
	int wheel;		// 바퀴 수 
	
	// 멤버변수가 행위를 하기위한 요소  = 메소드 (영문자 or $시작) 두번째부터 숫자가능
	void speedUp()	{
			speed++;
			System.out.println(speed+"속도를 올렷다");
	}
	
	// 행위요소 2 
	void print() {
			System.out.println("색깔" + color);
			System.out.println("속도" + speed);
	}
	

}
