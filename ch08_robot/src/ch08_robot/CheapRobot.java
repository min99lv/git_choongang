package ch08_robot;

import ch08_robot.actions.FireNo;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {

//	부품은 cheaptrobot/ standardrobot/ superrobot 생성자에서 결정
	public CheapRobot() {
	flyAction = new FlyNo();
	fireAction = new FireNo();
	knifeAction = new KnifeNo();
	}
//  추상클래스를 상속받았기때문에 무조건 구현해야한다
	@Override
	public void Shape() {
		System.out.println("기본적으로 팔, 다리, 몸통, 존재. 그리고 걸을 수 있습니다.");
	}

}
